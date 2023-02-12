/**
 * LecturerPanelController.java
 * 
 * 
 * This class controls the behavior of the lecturer  in the system 
 * by handling the lecturer inputs and update the view accordingly.
 * 
 *  LecturerPanelView.java the view class associated with lecturer panel
 * 
 * used design : MVC pattern
 * 
 */



package LecturerPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import CreateProject.CreateProjectView;
import Login.LoginView;
import Model.Model;
import ProjectAssign.ProjectAssignView;
import ProjectEdit.ProjectEditView;
import ProjectViewDetails.ProjectViewDetailsView;

public class LecturerPanelController implements ActionListener {

        private Model model;
        private int selectedRow;
        private LecturerPanelView lecturerView;
        String selectedID;

        public LecturerPanelController(LecturerPanelView lecturerView) {
                this.lecturerView = lecturerView;
                model = Model.getModel();
                String[] columnNames = { "ID", "Title", "specialization", "Creator ID", "status" };
                lecturerView.getProjectsTable()
                                .setModel(new DefaultTableModel(model.dataProjectsOfUserID(), columnNames));

                lecturerView.setTextID(model.getLecturerById().getId());
                lecturerView.setTextName(model.getLecturerById().getFirstName());
                lecturerView.setTextUsername(model.getLecturerById().getUserName());
                lecturerView.setTextPhone(model.getLecturerById().getPhoneNumber());
                lecturerView.setTextWelcomeAdmin(model.getLecturerById().getFirstName());
                lecturerView.setTextSpecialization(model.getLecturerById().getSpecialization());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                selectedRow = lecturerView.getProjectsTable().getSelectedRow();

                if (e.getSource() == lecturerView.getButtonLogout()) {
                        lecturerView.dispose();
                        new LoginView();
                } else if (e.getSource() == lecturerView.getButtonCreate()) {
                        lecturerView.dispose();
                        new CreateProjectView();
                } else if (selectedRow == -1) {
                        JOptionPane.showMessageDialog(lecturerView, "No row selected. Please select a row to edit.");
                } else {
                        selectedID = (String) lecturerView.getProjectsTable().getValueAt(selectedRow, 0);
                        if (e.getSource() == lecturerView.getButtonEdit()) {
                                lecturerView.dispose();
                                new ProjectEditView(selectedID);
                        } else if (e.getSource() == lecturerView.getButtonView()) {
                                new ProjectViewDetailsView(selectedID);
                        } else if (e.getSource() == lecturerView.getButtonDelete()) {
                                deleteButton(selectedID);
                        } else if (e.getSource() == lecturerView.getButtonActive()) {
                                activeButton(selectedID);
                        } else if (e.getSource() == lecturerView.getButtonHide()) {
                                hideButton(selectedID);
                        } else if (e.getSource() == lecturerView.getButtonAssign()) {
                                assignButton(selectedID);
                        } else if (e.getSource() == lecturerView.getButtonUnAssigned()) {
                                UnAssignButton(selectedID);
                        }
                }
                updateTable();
        }
        // to update the projects table after performign actions on it 
        public void updateTable() {
                String[] columnNames = { "ID", "Title", "Specialization", "Creator ID", "Status" };
                lecturerView.getProjectsTable()
                                .setModel(new DefaultTableModel(model.dataProjectsOfUserID(), columnNames));
        }

        public void deleteButton(String selectedID) {
                int confirm = JOptionPane.showConfirmDialog(lecturerView,
                                "Are you sure you want to delete ", "Confirm Delete",
                                JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {

                        int index = model.getprojectIndexById(selectedID);
                        model.deleteProject(index);

                } else {
                        // If the user clicks No or closes the dialog, stop the code
                        JOptionPane.showMessageDialog(lecturerView, "Delete operation had been canceled.", "Success",
                                        JOptionPane.INFORMATION_MESSAGE);
                }
        }

        public void activeButton(String selectedID) {
                int index = model.getprojectIndexById(selectedID);

                if (model.getallProjects().get(index).getStatus().equals("Active")) {
                        JOptionPane.showMessageDialog(lecturerView, "The Project is already Acitve", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                } else {
                        JOptionPane.showMessageDialog(lecturerView, "The project has been successfully Activated.",
                                        "Success",
                                        JOptionPane.INFORMATION_MESSAGE);
                        model.activeProject(index);
                }
        }

        public void hideButton(String selectedID) {
                int index = model.getprojectIndexById(selectedID);
                if (model.getallProjects().get(index).getStatus().equals("Hidden")) {
                        JOptionPane.showMessageDialog(lecturerView, "The Project is already Hidden", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                } else if (model.getallProjects().get(index).getAvailability().equals("Not Available")) {
                        JOptionPane.showMessageDialog(lecturerView,
                                        "The Project is assigned to a student please unassign it first.",
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE);
                } else {
                        JOptionPane.showMessageDialog(lecturerView, "The project has been successfully Hidden.",
                                        "Success",
                                        JOptionPane.INFORMATION_MESSAGE);
                        model.hideProject(index);
                }
        }

        public void assignButton(String selectedID) {
                int index = model.getprojectIndexById(selectedID);
                if (model.getallProjects().get(index).getAvailability().equals("Not Available")
                                || model.getallProjects().get(index).getStatus().equals("Hidden")) {
                        JOptionPane.showMessageDialog(lecturerView, "The Project is Not Available for Assigning",
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE);
                } else {
                        lecturerView.dispose();
                        new ProjectAssignView(selectedID);

                }
        }

        public void UnAssignButton(String selectedID) {
                int index = model.getprojectIndexById(selectedID);
                if (model.getallProjects().get(index).getAvailability().equals("Available")) {
                        JOptionPane.showMessageDialog(lecturerView, "The Project is Available for Assigning", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                } else {
                        model.unAssignStudent(index);
                        JOptionPane.showMessageDialog(lecturerView,
                                        "The Project  has been Unassigned successfully", "Success",
                                        JOptionPane.INFORMATION_MESSAGE);
                }
        }
}
