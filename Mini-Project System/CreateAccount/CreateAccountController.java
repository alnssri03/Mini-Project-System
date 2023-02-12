/**
 * CreateAccountController.java
 * 
 * 
 * This class controls the behavior of creating new Accounts in the system 
 * by handling the user inputs and updating the view accordingly.
 * 
 * CreateAccountView.java the view class  associated with creating a new user account
 * 
 * used design : MVC pattern
 * 
 */

package CreateAccount;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import AccountManagement.AccountManagementView;
import Model.Model;


public class CreateAccountController implements ActionListener {

    private Model model;
    private CreateAccountView creatView;

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phoneNumber;
    private String specialization;
    private String Availability;
    private String assignedProjectID;
    private String userType;


    public CreateAccountController(CreateAccountView creatView) {
        this.creatView = creatView;
        this.model = Model.getModel();
        creatView.getSpcyType().setModel(new DefaultComboBoxModel<>(model.getSpCombox()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == creatView.getButtonCreate()) {
            buttonCreate();
        }
        if (e.getSource() == creatView.getButtonBack()) {
            creatView.dispose();
            new AccountManagementView();
        }

    }

   
    public void getType(String type) {
        this.userType = type;
        if (userType.equals("Admin")) {
            creatView.getSpcyType().setVisible(false);
            creatView.getLabelSpecialization().setVisible(false);
            creatView.invalidate();
            creatView.validate();
            creatView.repaint();
        } else {
            creatView.getSpcyType().setVisible(true);
            creatView.getLabelSpecialization().setVisible(true);
            creatView.invalidate();
            creatView.validate();
            creatView.repaint();
        }
    }

    /**
     * Handles the create button event by creating a new user account and validating
     * the input fields.
     */
    public void buttonCreate() {
        firstName = creatView.getTextFieldFirstName().getText();
        lastName = creatView.getTextFieldLastName().getText();
        username = creatView.getTextFieldUsername().getText();
        password = creatView.getTextFieldPassword().getText();
        phoneNumber = creatView.getTextFieldPhone().getText();
        specialization = (String) creatView.getSpcyType().getSelectedItem();
        Availability = "Available";
        assignedProjectID = "null";
        userType = (String) creatView.getAccountType().getSelectedItem();

        if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || password.isEmpty()
                || phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(creatView, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (userType == null) {
            JOptionPane.showMessageDialog(creatView, "Please choose the User type again.", "Error",
                    JOptionPane.ERROR_MESSAGE);

        } else if (!userType.equals("Admin") && specialization.isEmpty()) {
            JOptionPane.showMessageDialog(creatView, "Please choose the Specialization again.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        else if (model.userValidation(username)) {
            JOptionPane.showMessageDialog(null, "Error: Username already exists. Please enter a different one.");
        } else {
            if (userType.equals("Admin")) {
                model.addAdminAccount(firstName, lastName, username, password, phoneNumber);

            } else if (userType.equals("Student")) {
                model.addStudentAccount(firstName, lastName, username, password, phoneNumber, specialization,
                        Availability, assignedProjectID);

            } else if (userType.equals("Lecturer")) {
                model.addLecturerAccount(firstName, lastName, username, password, phoneNumber, specialization);
            }
            JOptionPane.showMessageDialog(creatView,
                    "The account with username { " + username + " } has been created successfully", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            creatView.dispose();
            new AccountManagementView();
        }
    }
}
