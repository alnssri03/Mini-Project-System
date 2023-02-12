/**
 * ProjectAssignController.java
 * 
 * 
 * this class is responsible for handling user input and
 *  Assign a student to a project.
 * 
 *  ProjectAssignView.java the view class associated with assign controller
 * 
 * used design : MVC pattern
 * 
 */



package ProjectAssign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import LecturerPanel.LecturerPanelView;
import Model.Model;
import ProjectManagement.ProjectmanagementView;

public class ProjectAssignController implements ActionListener {
    private Model model;
    private ProjectAssignView projectAssignView;

    private int indexProject;
    private int indexStudent;
    private String sp;

    public ProjectAssignController(ProjectAssignView projectAssignView) {
        this.projectAssignView = projectAssignView;
        this.model = Model.getModel();
        sp = model.getallProjects().get(indexProject).getSpecialization();
        indexProject = model.getprojectIndexById(projectAssignView.getSelectedIDProject());

        String[] columnNames = { "ID", "First name", "Username" };
        projectAssignView.getStudentTable().setModel(new DefaultTableModel(model.dataStudentAssign(sp), columnNames));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == projectAssignView.getBackButton()) {
            projectAssignView.dispose();
            updateViews();
        } else {
            int selectedRow = projectAssignView.getStudentTable().getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "No row selected. Please select a row to edit.");
            } else {
                String selectedID = (String) projectAssignView.getStudentTable().getValueAt(selectedRow, 0);
                indexStudent = model.getStudentIndexById(selectedID);
                if (model.getallStudents().get(indexStudent).getAvailability().equals("Not Available")) {
                    JOptionPane.showMessageDialog(null,
                            "The student is already assigned to a project please choose another one");
                } else {
                    model.assignStudent(indexStudent, indexProject);
                    JOptionPane.showMessageDialog(projectAssignView,
                            "The user has been assigned successfully", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    projectAssignView.dispose();
                    updateViews();
                }
            }
        }
    }


    public void updateViews() {
        if (model.getUserType(model.getUserID()).equals("Admin")) {
            new ProjectmanagementView();
        } else if (model.getUserType(model.getUserID()).equals("Lecturer")) {
            new LecturerPanelView();
        }
    }



}
