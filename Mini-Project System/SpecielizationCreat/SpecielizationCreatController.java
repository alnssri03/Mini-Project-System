/**
 * SpecielizationCreatController.java
 * 
 * 
 * this class is responsible for handling creating of a new Specielization in the system
 * 
 * ProjectAssignController.java the view class associated with Specielization controller
 * 
 * used design : MVC pattern
 * 
 */

package SpecielizationCreat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.Model;
import SpecielizationManagment.SpecielizationManagementView;


public class SpecielizationCreatController implements ActionListener {

    private Model model;
private SpecielizationCreatView createView;
    public SpecielizationCreatController(SpecielizationCreatView createView) {
        this.createView = createView;
        this.model = Model.getModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createView.getCreateButton()){
            createButton();
        }else if (e.getSource() == createView.getCloseButton()){
            createView.dispose();
        }
    }

    public void createButton() {
        String newText = createView.getTextFieldContent().getText();
        if (newText.isEmpty()) {
            JOptionPane.showMessageDialog(createView, "Text field is empty. Please enter a value.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (model.spValidation(newText)) {
            JOptionPane.showMessageDialog(createView, "Specialization already exist. Please enter a diffrenet one.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            model.addSpecialization(newText);
            JOptionPane.showMessageDialog(createView, "Specialization created successfully.", "Success",
            JOptionPane.INFORMATION_MESSAGE);
            createView.dispose();
            new SpecielizationManagementView();
        }
    }


}
