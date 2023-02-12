/**
 * CreateProjectController.java
 * 
 * 
 * This class controls the behavior of creating new Projects in the system 
 * by handling the user inputs and updating the view accordingly.
 * 
 * CreateProjectView.java the view class associated with creating a new project
 * 
 * used design : MVC pattern
 * 
 */

package CreateProject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import LecturerPanel.LecturerPanelView;
import Model.Model;
import ProjectManagement.ProjectmanagementView;

public class CreateProjectController implements ActionListener {

    private Model model;
    private CreateProjectView createProjectView;

    private String title;
    private String content;
    private String specialization;
    private String status;
    private String creatorId;
    private String availability;
    private String assignedStudentID;

    public CreateProjectController(CreateProjectView createProjectView) {
        this.createProjectView = createProjectView;
        this.model = Model.getModel();
        createProjectView.getComboBoxSp().setModel(new DefaultComboBoxModel<>(model.getSpCombox()));
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == createProjectView.getCreateButton()) {
            createButton();
        } else if (e.getSource() == createProjectView.getBackButton()) {
            createProjectView.dispose();
            updateViews();
        }

    }

    public void createButton() {
        title = createProjectView.getTextFieldTitle().getText();
        content = createProjectView.getTextFieldContent().getText();
        specialization = (String) createProjectView.getComboBoxSp().getSelectedItem();
        status = "Active";
        creatorId = model.getUserID();
        availability = "Available";
        assignedStudentID = "null";

        if (title.isEmpty() || content.isEmpty()) {
            JOptionPane.showMessageDialog(createProjectView, "Please fill out all fields.", "Error",
                    JOptionPane.ERROR_MESSAGE);

        } else if (specialization == null) {
            JOptionPane.showMessageDialog(createProjectView, "Please choose the specialization again.", "Error",
                    JOptionPane.ERROR_MESSAGE);

        } else {
            model.addProject(title, content, specialization, status, creatorId, availability, assignedStudentID);
            JOptionPane.showMessageDialog(createProjectView,
                    "The Project with title { " + title + " } has been created successfully", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            createProjectView.dispose();
            updateViews();

        }

    }

    // to return the user to its view according to the user type
    public void updateViews() {
        if (model.getUserType(model.getUserID()).equals("Admin")) {
            new ProjectmanagementView();
        } else if (model.getUserType(model.getUserID()).equals("Lecturer")) {
            new LecturerPanelView();
        }
    }
}
