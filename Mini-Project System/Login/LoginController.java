/**
 * LoginController.java
 * 
 * 
 * This class controls the behavior of the login system 
 * by handling the USERS inputs Username and Password and direct the user to its panel.
 * 
 *  LoginView.java the view class associated with login controller
 * 
 * used design : MVC pattern
 * 
 */

package Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import AdminPanel.AdminPanelView;
import LecturerPanel.LecturerPanelView;
import Model.Model;
import StudentPanel.StudentPanelView;

public class LoginController implements ActionListener {
  private String username;
  private String password;
  private LoginView loginView;
  private Model model;


  public LoginController(LoginView loginView) {
    this.loginView = loginView;
    model =  Model.getModel();
  }


  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == loginView.getButtonLogin()) {
      username = loginView.getTextUsername().getText();
      password = loginView.getTextPassword().getText();

      if (model.getAdmin(username, password) != null) {
        model.setUserIDAdmin(username, password);
         new AdminPanelView();
        loginView.dispose();
      }
      else if (model.getStudent(username, password) != null) {
        model.setUserIDStudent(username, password);
         new StudentPanelView();
        loginView.dispose();
      }
      else if (model.getLecturer(username, password) != null) {
        model.setUserIDLecturer(username, password);
        new LecturerPanelView();
        loginView.dispose();
      }
      else {
        JOptionPane.showMessageDialog(null, "Wrong Username or Password please try again!.");
      }
    }
  }
}
