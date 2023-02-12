/**
 * ProjectViewDetailsController.java
 * 
 * 
 * this class is responsible for displaying the project details 
 * 
 *  ProjectViewDetailsView.java the view class associated with project details controller
 * 
 * used design : MVC pattern
 * 
 */

package ProjectViewDetails;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Model;


public class ProjectViewDetailsController implements ActionListener {

    private ProjectViewDetailsView projectViewDetailsView;
    private Model model;
    private int index;

    public ProjectViewDetailsController(ProjectViewDetailsView projectViewDetailsView) {
        this.projectViewDetailsView = projectViewDetailsView;
        this.model = Model.getModel();
        index = model.getprojectIndexById(projectViewDetailsView.getSelectedID());
        projectViewDetailsView.setTextProjectID(model.getallProjects().get(index).getId());
        projectViewDetailsView.setTextProjectTitle(model.getallProjects().get(index).getTitle());
        projectViewDetailsView.setTextProjectContent(model.getallProjects().get(index).getContent());
        projectViewDetailsView.setTextProjectSpecialization(model.getallProjects().get(index).getSpecialization());
        projectViewDetailsView.setTextProjectStatus(model.getallProjects().get(index).getStatus());
        projectViewDetailsView.setTextProjectCreatorID(model.getallProjects().get(index).getCreatorId());
        projectViewDetailsView.setTextProjectAvailability(model.getallProjects().get(index).getAvailability());
        projectViewDetailsView.setTextAssignedStudentID(model.getallProjects().get(index).getAssignedStudentID());
        projectViewDetailsView.getCommentsArea().setText("");
        for (int i = 0; i < model.getallComments().size(); i++) {
            if (model.getallComments().get(i).getProjectID()
                    .equals(model.getallProjects().get(index).getId())) {
                        projectViewDetailsView.getCommentsArea().append(model.getallComments().get(i).getAdminUsername() + ": "
                        + model.getallComments().get(i).getText() + "\n");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        projectViewDetailsView.dispose();
    }
 
}
