/**
 * ProjectmanagementController.java
 * 
 * 
 * this class is responsible for handling user input and
 * handling the project managment options in the system.
 * 
 *  ProjectmanagementView.java the view class associated with assign controller
 * 
 * used design : MVC pattern
 * 
 */

package ProjectManagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import AdminPanel.AdminPanelView;
import CreateProject.CreateProjectView;
import Model.Model;
import ProjectAssign.ProjectAssignView;
import ProjectEdit.ProjectEditView;
import ProjectViewDetails.ProjectViewDetailsView;

public class ProjectmanagementController implements ActionListener {

    private Model model;
    private String type;
    private int selectedRow;
    private ProjectmanagementView projectView;
    String selectedID;

    public ProjectmanagementController(ProjectmanagementView projectView) {
        this.projectView = projectView;
        model = Model.getModel();
        String[] columnNames = { "ID", "Title", "specialization", "Creator ID", "status" };
        projectView.getProjectsTable().setModel(new DefaultTableModel(model.dataProjects(), columnNames));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        selectedRow = projectView.getProjectsTable().getSelectedRow();
        type = (String) projectView.getProjectCatagory().getSelectedItem();

        if (e.getSource() == projectView.getButtonBack()) {
            projectView.dispose();
            new AdminPanelView();
        } else if (e.getSource() == projectView.getButtonCreat()) {
            new CreateProjectView();
        } else if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No row selected. Please select a row to edit.");
        } else {

            selectedID = (String) projectView.getProjectsTable().getValueAt(selectedRow, 0);
            if (e.getSource() == projectView.getButtonEdit()) {
                new ProjectEditView(selectedID);

            } else if (e.getSource() == projectView.getButtonView()) {
                new ProjectViewDetailsView(selectedID);

            } else if (e.getSource() == projectView.getButtonComment()) {
                commentButton(selectedID);
            } else if (e.getSource() == projectView.getButtonDelete()) {
                deleteButton(selectedID);
            } else if (e.getSource() == projectView.getButtonActive()) {
                activeButton(selectedID);
            } else if (e.getSource() == projectView.getButtonHide()) {
                hideButton(selectedID);
            } else if (e.getSource() == projectView.getButtonAssign()) {
                assignButton(selectedID);
            } else if (e.getSource() == projectView.getButtonUnAssign()) {
                UnAssignButton(selectedID);
            }
        }

        updateTable(type);
    }

    public void updateTable(String type) {
        String[] columnNames = { "ID", "Title", "Specialization", "Creator ID", "Status" };
        if (type.equals("My Projects")) {
            projectView.getButtonAssign().setVisible(true);
            projectView.getButtonUnAssign().setVisible(true);
            projectView.getProjectsTable().setModel(new DefaultTableModel(model.dataProjectsOfUserID(), columnNames));
        } else {
            projectView.getButtonAssign().setVisible(false);
            projectView.getButtonUnAssign().setVisible(false);
            projectView.getProjectsTable().setModel(new DefaultTableModel(model.dataProjects(), columnNames));

        }

    }

    public void commentButton(String selectedID) {
        String username = model.getAdminById().getUserName();
        String comment = JOptionPane.showInputDialog(null, "Enter your comment:");
        if (comment != null) {
            model.addComment(username, comment, selectedID);
        }
    }

    public void deleteButton(String selectedID) {
        int confirm = JOptionPane.showConfirmDialog(projectView,
                "Are you sure you want to delete ", "Confirm Delete",
                JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {

            int index = model.getprojectIndexById(selectedID);
            model.deleteProject(index);

        } else {
            // If the user clicks No or closes the dialog, stop the code
            JOptionPane.showMessageDialog(projectView, "Delete operation had been canceled.", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void activeButton(String selectedID) {
        int index = model.getprojectIndexById(selectedID);

        if (model.getallProjects().get(index).getStatus().equals("Active")) {
            JOptionPane.showMessageDialog(projectView, "The Project is already Acitve", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(projectView, "The project has been successfully Activated.", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            model.activeProject(index);
        }
    }

    public void hideButton(String selectedID) {
        int index = model.getprojectIndexById(selectedID);
        if (model.getallProjects().get(index).getStatus().equals("Hidden")) {
            JOptionPane.showMessageDialog(projectView, "The Project is already Hidden", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (model.getallProjects().get(index).getAvailability().equals("Not Available")) {
            JOptionPane.showMessageDialog(projectView, "The Project is assigned to a student please unassign it first.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(projectView, "The project has been successfully Hidden.", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            model.hideProject(index);
        }
    }

    public void assignButton(String selectedID) {
        int index = model.getprojectIndexById(selectedID);
        if (model.getallProjects().get(index).getAvailability().equals("Not Available")
                || model.getallProjects().get(index).getStatus().equals("Hidden")) {
            JOptionPane.showMessageDialog(projectView, "The Project is Not Available for Assigning", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            new ProjectAssignView(selectedID);

        }
    }

    public void UnAssignButton(String selectedID) {
        int index = model.getprojectIndexById(selectedID);
        if (model.getallProjects().get(index).getAvailability().equals("Available")) {
            JOptionPane.showMessageDialog(projectView, "The Project is Available for Assigning", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            model.unAssignStudent(index);
            JOptionPane.showMessageDialog(projectView,
                    "The Project  has been Unassigned successfully", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
