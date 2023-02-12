/**
 * AdminPanelControler.java
 * 
 * 
 * This class is responsible for handling user input and
 * controlling the behavior of the Admin Panel view
 * 
 * AdminPanelView.java the view class associated with Account Management page
 * 
 * used design : MVC pattern
 * 
 */

package AdminPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import AccountManagement.AccountManagementView;
import Login.LoginView;
import Model.Model;
import ProjectManagement.ProjectmanagementView;
import ReportManagement.ReportManagementView;
import SpecielizationManagment.SpecielizationManagementView;


public class AdminPanelControler implements ActionListener {

    private Model model;
    private AdminPanelView adminPanelView;


    public AdminPanelControler(AdminPanelView adminPanelView) {
        this.adminPanelView = adminPanelView;
        model = Model.getModel();

        adminPanelView.setTextID(model.getAdminById().getId());
        adminPanelView.setTextName(model.getAdminById().getFirstName());
        adminPanelView.setTextUsername(model.getAdminById().getUserName());
        adminPanelView.setTextPhone(model.getAdminById().getPhoneNumber());
        adminPanelView.setTextWelcomeAdmin(model.getAdminById().getFirstName());
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == adminPanelView.getButtonAccountManagment()) {
            new AccountManagementView();
        } else if (e.getSource() == adminPanelView.getButtonLogout()) {
            adminPanelView.dispose();
            new LoginView();
        }
        else if (e.getSource() == adminPanelView.getButtonProjectManagment()) {
            new ProjectmanagementView();
        } else if (e.getSource() == adminPanelView.getButtonSpecialization()) {
            new SpecielizationManagementView();
        }
        else if (e.getSource() == adminPanelView.getButtonReports()) {
            new ReportManagementView();
        }

        adminPanelView.dispose();
    }
}
