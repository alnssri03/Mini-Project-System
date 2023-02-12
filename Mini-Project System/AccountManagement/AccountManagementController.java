/**
 * AccountManagementController.java
 * 
 * 
 * This class controls the behavior of the Account Managment page by
 * handling user inputs and updating the view accordingly.
 * 
 * AccountManagementView.java the view class associated with Account Management page
 * 
 * used design : MVC pattern
 * 
 */

package AccountManagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import AccountDetails.AccountDetailsView;
import AdminPanel.AdminPanelView;
import CreateAccount.CreateAccountView;
import EditAccount.EditAccountView;
import Model.Model;

public class AccountManagementController implements ActionListener {

    private AccountManagementView accountView;

    private String userType;
    private int selectedRow;
    private Model model;
    private int index;

    public AccountManagementController(AccountManagementView accountView) {
        this.accountView = accountView;
        model = Model.getModel();
        String[] columnNames = { "ID", "First name", "Username" };
        accountView.getUsersTable().setModel(new DefaultTableModel(model.dataAdmins(), columnNames));
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // selectedRow : the selected row from the users table
        selectedRow = accountView.getUsersTable().getSelectedRow();

        if (e.getSource() == accountView.getButtonBack()) {
            accountView.dispose();
            new AdminPanelView();
        } else if (e.getSource() == accountView.getButtonCreate()) {
            accountView.dispose();
            new CreateAccountView();
        } else if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No row selected. Please select a row to edit.");
        } else {
            // selectedID : the id of the selected user
            String selectedID = (String) accountView.getUsersTable().getValueAt(selectedRow, 0);
            userType = (String) accountView.getUsersType().getSelectedItem();

            if (e.getSource() == accountView.getButtonEdit()) {
                new EditAccountView(selectedID);
                accountView.dispose();

            } else if (e.getSource() == accountView.getButtonView()) {
                new AccountDetailsView(selectedID);
                accountView.dispose();

            } else if (e.getSource() == accountView.getButtonDelete()) {
                buttonDelete();
            }
        }

    }

    // update the users table when change happens like deleting an account ..etc
    public void updateTable(String userType) {
        if (userType.equals("Admin")) {
            String[] columnNames = { "ID", "First name", "Username" };
            accountView.getUsersTable().setModel(new DefaultTableModel(model.dataAdmins(), columnNames));
        } else if (userType.equals("Student")) {
            String[] columnNames = { "ID", "First Name", "Username", "specialization", "Availability" };
            accountView.getUsersTable().setModel(new DefaultTableModel(model.dataStudents(), columnNames));
        } else if (userType.equals("Lecturer")) {
            String[] columnNames = { "ID", "First Name", "Username", "specialization" };
            accountView.getUsersTable().setModel(new DefaultTableModel(model.dataLectrures(), columnNames));
        }
    }

    // when the button delete account is pressed
    public void buttonDelete() {
        int confirm = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete ", "Confirm Delete",
                JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String selectedID = (String) accountView.getUsersTable().getValueAt(selectedRow, 0);

            if (userType.equals("Admin")) {
                index = model.getAdminIndexById(selectedID);
                model.deleteAdmin(index);
            } else if (userType.equals("Student")) {
                index = model.getStudentIndexById(selectedID);
                model.deleteStudent(index);
            } else if (userType.equals("Lecturer")) {
                index = model.getLecturerIndexById(selectedID);
                model.deleteLecturer(index);
            }
            updateTable(userType);

        } else {
            // If the user clicks No or closes the dialog, stop the code
            JOptionPane.showMessageDialog(null, "Delete operation had been canceled.", null,
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
