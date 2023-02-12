package AccountDetails;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import AccountManagement.AccountManagementView;
import Model.Model;

/**
 * AccountDetailsController.java
 * 
 * 
 * This class controls the behavior of the Account Details view by
 * handling user inputs and updating the view accordingly.
 * 
 * AccountDetailsView.java the view class associated with creating a new user account
 * 
 * used design : MVC pattern
 * 
 */



public class AccountDetailsController implements ActionListener {
    private Model model;
    private AccountDetailsView accountDetailsView;
    private String userType;
    private int index;

    
    public AccountDetailsController(AccountDetailsView accountDetailsView) {
        this.accountDetailsView = accountDetailsView;
        this.model = Model.getModel();
        userType = model.getUserType(accountDetailsView.getSelectedID());
        if (userType.equals("Admin")) {
            index = model.getAdminIndexById(accountDetailsView.getSelectedID());
            accountDetailsView.setTextId(model.getallAdmins().get(index).getId());
            accountDetailsView.setTextFirstName(model.getallAdmins().get(index).getFirstName());
            accountDetailsView.setTextLastName(model.getallAdmins().get(index).getLastName());
            accountDetailsView.setTextUsername(model.getallAdmins().get(index).getUserName());
            accountDetailsView.setTextPassword(model.getallAdmins().get(index).getPassword());
            accountDetailsView.setTextPhone(model.getallAdmins().get(index).getPhoneNumber());
            accountDetailsView.getLabelUserSpecialization().setVisible(false);
            accountDetailsView.getLabelAssignedProjectID().setVisible(false);
            accountDetailsView.getLabelAvailability().setVisible(false);
            accountDetailsView.getTextSpecialization().setVisible(false);
            accountDetailsView.getTextAvailability().setVisible(false);
            accountDetailsView.getTextAssignedProjectID().setVisible(false);
        } else if (userType.equals("Student")) {
            index = model.getStudentIndexById(accountDetailsView.getSelectedID());

            accountDetailsView.setTextId(model.getallStudents().get(index).getId());
            accountDetailsView.setTextFirstName(model.getallStudents().get(index).getFirstName());
            accountDetailsView.setTextLastName(model.getallStudents().get(index).getLastName());
            accountDetailsView.setTextUsername(model.getallStudents().get(index).getUserName());
            accountDetailsView.setTextPassword(model.getallStudents().get(index).getPassword());
            accountDetailsView.setTextPhone(model.getallStudents().get(index).getPhoneNumber());
            accountDetailsView.setTextSpecialization(model.getallStudents().get(index).getSpecialization());
            accountDetailsView.setTextAvailability(model.getallStudents().get(index).getAvailability());
            accountDetailsView.setTextAssignedProjectID(model.getallStudents().get(index).getAssignedProjectID());
            accountDetailsView.getLabelUserSpecialization().setVisible(true);
            accountDetailsView.getLabelAssignedProjectID().setVisible(true);
            accountDetailsView.getLabelAvailability().setVisible(true);
            accountDetailsView.getTextSpecialization().setVisible(true);
            accountDetailsView.getTextAvailability().setVisible(true);
            accountDetailsView.getTextAssignedProjectID().setVisible(true);
        } else if (userType.equals("Lecturer")) {
            index = model.getLecturerIndexById(accountDetailsView.getSelectedID());

            accountDetailsView.setTextId(model.getallLectrurs().get(index).getId());
            accountDetailsView.setTextFirstName(model.getallLectrurs().get(index).getFirstName());
            accountDetailsView.setTextLastName(model.getallLectrurs().get(index).getLastName());
            accountDetailsView.setTextUsername(model.getallLectrurs().get(index).getUserName());
            accountDetailsView.setTextPassword(model.getallLectrurs().get(index).getPassword());
            accountDetailsView.setTextPhone(model.getallLectrurs().get(index).getPhoneNumber());
            accountDetailsView.setTextSpecialization(model.getallLectrurs().get(index).getSpecialization());

            accountDetailsView.getLabelUserSpecialization().setVisible(true);
            accountDetailsView.getLabelAssignedProjectID().setVisible(false);
            accountDetailsView.getLabelAvailability().setVisible(false);
            accountDetailsView.getTextSpecialization().setVisible(true);
            accountDetailsView.getTextAvailability().setVisible(false);
            accountDetailsView.getTextAssignedProjectID().setVisible(false);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == accountDetailsView.getBackButton()) {
            accountDetailsView.dispose();
            new AccountManagementView();
        }

    }

}
