/**
 * ProjectmanagementController.java
 * 
 * 
 * this class is responsible for handling student input and
 * handling the student panel options in the system.
 * 
 *  ProjectAssignView.java the view class associated with student panel controller
 * 
 * used design : MVC pattern
 * 
 */



package StudentPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


import Login.LoginView;
import Model.Model;

import ProjectViewDetails.ProjectViewDetailsView;

public class StudentPanelController implements ActionListener {

    private Model model;
    private int selectedRow;
    private StudentPanelView studentPanelView;
    String selectedID;

    public StudentPanelController(StudentPanelView studentPanelView) {
        this.studentPanelView = studentPanelView;
        model = Model.getModel();
        String[] columnNames = { "ID", "Title", "Specialization", "Creator ID", "Status" };
        studentPanelView.getProjectsTable().setModel(new DefaultTableModel(model.dataProjectsStudentPanel(), columnNames));
        studentPanelView.setTextID(model.getStudentById().getId());
        studentPanelView.setTextName(model.getStudentById().getFirstName());
        studentPanelView.setTextUsername(model.getStudentById().getUserName());
        studentPanelView.setTextPhone(model.getStudentById().getPhoneNumber());
        studentPanelView.setTextWelcomeAdmin(model.getStudentById().getFirstName());
        studentPanelView.setTextSpecialization(model.getStudentById().getSpecialization());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        selectedRow = studentPanelView.getProjectsTable().getSelectedRow();

        if (e.getSource() == studentPanelView.getButtonLogout()) {
            studentPanelView.dispose();
            new LoginView();
        } else if (e.getSource() == studentPanelView.getButtonAssignedProject()) {
            assignProjectButton();
        } else if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No row selected. Please select a row to edit.");
        } else {
            selectedID = (String) studentPanelView.getProjectsTable().getValueAt(selectedRow, 0);
            if (e.getSource() == studentPanelView.getButtonView()) {
                new ProjectViewDetailsView(selectedID);
            }
        }
        

    }

    public void assignProjectButton() {
        String projectID = model.getStudentById().getAssignedProjectID();
        if (projectID.equals("null")) {
            JOptionPane.showMessageDialog(null, "You don't have any assigned projects yet.");
        } else {
            new ProjectViewDetailsView(projectID);
        }
    }

   
}
