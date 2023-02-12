/**
 * ProjectEditController.java
 * 
 * 
 * this class is responsible for handling user input and
 *  Edit a project int the system 
 * 
 *  ProjectEditView.java the view class associated with edit project controller
 * 
 * used design : MVC pattern
 * 
 */

package ProjectEdit;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;

import LecturerPanel.LecturerPanelView;
import Model.Model;
import ProjectManagement.ProjectmanagementView;

public class ProjectEditController implements ActionListener {
    private Model model;
    private ProjectEditView projectEditView;
    private String title;
    private String id;
    private String content;
    private String specialization;
    private String status;
    private String creatorId;
    private String availability;
    private String assignedStudentID;
    private int index;
/**
 * The ProjectEditController class is responsible for handling user input and
 * Edit Project.
 */
    public ProjectEditController(ProjectEditView projectEditView) {
        this.projectEditView = projectEditView;
        this.model = Model.getModel();
        index = model.getprojectIndexById(projectEditView.getSelectedID());
        projectEditView.setTextFieldTitle(model.getallProjects().get(index).getTitle());
        projectEditView.setTextFieldContent(model.getallProjects().get(index).getContent());
        projectEditView.setComboBoxSpIndex(model.getallProjects().get(index).getSpecialization());
        projectEditView.getComboBoxSp().setModel(new DefaultComboBoxModel<>(model.getSpCombox()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == projectEditView.getEditButton()) {
            editButton();
        }
        if (e.getSource() == projectEditView.getBackButton()) {
            projectEditView.dispose();
        }

    }

    public void editButton() {
        index = model.getprojectIndexById(projectEditView.getSelectedID());
        id = model.getallProjects().get(index).getId();
        title = projectEditView.getTextFieldTitle().getText();
        content = projectEditView.getTextFieldContent().getText();
        specialization = (String) projectEditView.getComboBoxSp().getSelectedItem();
        status = model.getallProjects().get(index).getStatus();
        creatorId = model.getallProjects().get(index).getCreatorId();
        availability = model.getallProjects().get(index).getAvailability();
        assignedStudentID = model.getallProjects().get(index).getAssignedStudentID();
        model.editPrject( id,title, content, specialization, status, creatorId, availability, assignedStudentID);
        projectEditView.dispose();
        updateViews();
      
    }
    public void updateViews() {
        if (model.getUserType(model.getUserID()).equals("Admin")) {
            new ProjectmanagementView();
        } else if (model.getUserType(model.getUserID()).equals("Lecturer")) {
            new LecturerPanelView();
        }
    }


}
