/**
 * SpecielizationCreatController.java
 * 
 * 
 * this class is responsible for handling editng of a  Specielization in the system
 * 
 * ProjectAssignController.java the view class associated with Specielization controller
 * 
 * used design : MVC pattern
 * 
 */


package SpecielizationEdit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Model.Model;
import SpecielizationManagment.SpecielizationManagementView;


public class SpecielizationEditController implements ActionListener {

    private Model model;
private SpecielizationEditView editView;
    public SpecielizationEditController(SpecielizationEditView editView) {
        this.editView = editView;
        this.model = Model.getModel();
        editView.setTextField(model.getallSpecializations().get(editView.getSelected()).getSpecialization());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == editView.getEditButton()){
            editButton();
        }else if (e.getSource() == editView.getCloseButton()){
            editView.dispose();
        }
    }

    public void editButton() {
        String newText = editView.getTextFieldContent().getText();
        if (newText.isEmpty()) {
            JOptionPane.showMessageDialog(editView, "Text field is empty. Please enter a value.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (model.spValidation(newText)) {
            JOptionPane.showMessageDialog(editView, "Specialization already exist. Please enter a diffrenet one.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            model.editSpecialization(editView.getSelected(),newText);
            JOptionPane.showMessageDialog(editView, "Specialization edited successfully.", "Success",
            JOptionPane.INFORMATION_MESSAGE);
            editView.dispose();
            new SpecielizationManagementView();

        }
    }


}
