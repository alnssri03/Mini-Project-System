/**
 * SpecielizationCreatController.java
 * 
 * 
 * this class is responsible for handling the Specielization in the system
 * 
 * ProjectAssignController.java the view class associated with Specielization controller
 * 
 * used design : MVC pattern
 * 
 */

package SpecielizationManagment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import AdminPanel.AdminPanelView;
import Model.Model;
import SpecielizationCreat.SpecielizationCreatView;
import SpecielizationEdit.SpecielizationEditView;

public class SpecielizationManagementController implements ActionListener {

    private Model model;
    private String specialization;
    private int selectedRow;
    private SpecielizationManagementView spManagementView;

    public SpecielizationManagementController(SpecielizationManagementView spManagementView) {
        this.spManagementView = spManagementView;
        this.model = Model.getModel();
        String[] columnNames = { "Specialization" };
        spManagementView.getSpTable().setModel(new DefaultTableModel(model.dataSp(), columnNames));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        selectedRow = spManagementView.getSpTable().getSelectedRow();
        if (e.getSource() == spManagementView.getButtonCreat()) {
            spManagementView.dispose();
            new SpecielizationCreatView();
        } else if (e.getSource() == spManagementView.getButtonBack()) {
            spManagementView.dispose();
            new AdminPanelView();
        } else if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Error: No specialization selected.", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            specialization = (String) spManagementView.getSpTable().getValueAt(selectedRow, 0);
            if (e.getSource() == spManagementView.getButtonDelete()) {
                buttonDelete();
            } else if (e.getSource() == spManagementView.getButtonEdit()) {
                spManagementView.dispose();
                new SpecielizationEditView(selectedRow);
            }
        }

    }

    public void buttonDelete() {
        int confirm = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete this Specialization : " + specialization + " ? ", "Confirm Delete",
                JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            model.deleteSpecialization(selectedRow);
            spManagementView.dispose();
            new SpecielizationManagementView();
        } else {
            JOptionPane.showMessageDialog(null, "Delete operation had been canceled.", null,
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
