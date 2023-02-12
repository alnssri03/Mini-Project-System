/**
 * EditAccountController.java
 * 
 * 
 * This class controls the behavior of editing accounts in the system 
 * by handling the user inputs and updating the view accordingly.
 * 
 *  EditAccountView.java the view class associated with editing accounts
 * 
 * used design : MVC pattern
 * 
 */




package EditAccount;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import AccountManagement.AccountManagementView;
import Model.Model;


public class EditAccountController implements ActionListener {

    private Model model;
    private EditAccountView editView;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phone;
    private String specialization;
    private String availability;
    private String assignedProjectID;
    private String userType;
    private int index;
    
    public EditAccountController(EditAccountView editView) {
        this.editView = editView;
        this.model =  Model.getModel();
        userType = model.getUserType(editView.getSelectedID());
        getType(userType);
        if (userType.equals("Admin")) 
        {
            index = model.getAdminIndexById(editView.getSelectedID());
            editView.setTextFieldFirstName(model.getallAdmins().get(index).getFirstName());
            editView.setTextFieldLastName(model.getallAdmins().get(index).getLastName());
            editView.setTextFieldUsername(model.getallAdmins().get(index).getUserName());
            editView.setTextFieldPassword(model.getallAdmins().get(index).getPassword());
            editView.setTextFieldPhone(model.getallAdmins().get(index).getPhoneNumber());
        } else if (userType.equals("Student")) {
            index = model.getStudentIndexById(editView.getSelectedID());
            editView.setTextFieldFirstName(model.getallStudents().get(index).getFirstName());
            editView.setTextFieldLastName(model.getallStudents().get(index).getLastName());
            editView.setTextFieldUsername(model.getallStudents().get(index).getUserName());
            editView.setTextFieldPassword(model.getallStudents().get(index).getPassword());
            editView.setTextFieldPhone(model.getallStudents().get(index).getPhoneNumber());
            editView.setComboBoxSpIndex(model.getallStudents().get(index).getSpecialization());
        } else if (userType.equals("Lecturer")) {
            index = model.getLecturerIndexById(editView.getSelectedID());
            editView.setTextFieldFirstName(model.getallLectrurs().get(index).getFirstName());
            editView.setTextFieldLastName(model.getallLectrurs().get(index).getLastName());
            editView.setTextFieldUsername(model.getallLectrurs().get(index).getUserName());
            editView.setTextFieldPassword(model.getallLectrurs().get(index).getPassword());
            editView.setTextFieldPhone(model.getallLectrurs().get(index).getPhoneNumber());
            editView.setComboBoxSpIndex(model.getallLectrurs().get(index).getSpecialization());
            editView.setComboBoxSpIndex(model.getallLectrurs().get(index).getSpecialization());
        }
        editView.getSpcyType().setModel(new DefaultComboBoxModel<>(model.getSpCombox()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == editView.getButtonEdit()) {
            buttonEdit();
        }
        editView.dispose();
        new AccountManagementView();
    }

   

    public void buttonEdit() {
        String id = editView.getSelectedID();
        firstName = editView.getTextFieldFirstName().getText();
        lastName = editView.getTextFieldLastName().getText();
        username = editView.getTextFieldUsername().getText();
        password = editView.getTextFieldPassword().getText();
        phone = editView.getTextFieldPhone().getText();
        specialization = (String) editView.getSpcyType().getSelectedItem();

        if (firstName.equals("") || lastName.equals("") || username.equals("")
                || password.equals("")
                || phone.equals("")) {
            JOptionPane.showMessageDialog(null, "Error: Empty input detected. Please enter valid inputs.");
        } else if (!model.userValidation(username)) {
            if (userType.equals("Admin")) {
                model.editAdminAccount(id,firstName, lastName, username, password, phone);
            } else if (userType.equals("Student")) {
                availability = model.getallStudents().get(index).getAvailability();
                assignedProjectID = model.getallStudents().get(index).getAssignedProjectID();
                model.editStudentAccount(id, firstName, lastName, username, password, phone, specialization,
                        availability, assignedProjectID);
            } else if (userType.equals("Lecturer")) {
                model.editLecturerAccount(id, firstName, lastName, username, password, phone, specialization);
            }
            JOptionPane.showMessageDialog(editView,
            "The account has been edited successfully", "Success",
            JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Username already exists. Please enter a different one.");
        }
    }

    // to hide or show the specialization based on the user type
    public void getType(String type) {
        this.userType = type;
        if (userType.equals("Admin")) {
            editView.getSpcyType().setVisible(false);
            editView.getLabelSpecialization().setVisible(false);
            editView.invalidate();
            editView.validate();
            editView.repaint();
        } else {
            editView.getSpcyType().setVisible(true);
            editView.getLabelSpecialization().setVisible(true);
            editView.invalidate();
            editView.validate();
            editView.repaint();
        }
    }
}
