/**
 * ReportsManagementController.java
 * 
 * 
 * this class is responsible for handling the reports section in the system
 * 
 *  ReportsManagementView.java the view class associated with report controller
 * 
 * used design : MVC pattern
 * 
 */


package ReportManagement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import AdminPanel.AdminPanelView;
import Model.Model;
import ProjectViewDetails.ProjectViewDetailsView;

public class ReportsController implements ActionListener {

    private ReportManagementView reportView;
    private Model model;
    private int selectedRow;
    private String selectedID;


    public ReportsController(ReportManagementView reportView) {
        this.reportView = reportView;
        model = Model.getModel();
        String[] columnNames = { "ID", "First name", "Username" };
        reportView.getReportTable().setModel(new DefaultTableModel(model.dataProjects(), columnNames));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        selectedRow = reportView.getReportTable().getSelectedRow();
        if (e.getSource() == reportView.getButtonBack()) {
            reportView.dispose();
            new AdminPanelView();
        } else if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No row selected. Please select a row to view.");
        } else {
            selectedID = (String) reportView.getReportTable().getValueAt(selectedRow, 0);
            if (e.getSource() == reportView.getButtonView()) {
                new ProjectViewDetailsView(selectedID);
            }

        }
    }

    public void updateCatagoryTable(String type) {
        if (type.equals("All_projects")) {
            String[] columnNames = { "ID", "First name", "Username" };
            reportView.getReportTable().setModel(new DefaultTableModel(model.dataProjects(), columnNames));
        } else if (type.equals("inactive_projects")) {
            String[] columnNames = { "ID", "First Name", "Username", "specialization", "isAssigned" };
            reportView.getReportTable().setModel(new DefaultTableModel(model.dataInAactiveProjects(), columnNames));
        } else if (type.equals("active_projects")) {
            String[] columnNames = { "ID", "First Name", "Username", "specialization" };
            reportView.getReportTable().setModel(new DefaultTableModel(model.dataAactiveProjects(), columnNames));
        } else if (type.equals("assigned_to_students")) {
            String[] columnNames = { "ID", "First Name", "Username", "specialization" };
            reportView.getReportTable().setModel(new DefaultTableModel(model.dataAssignedProjects(), columnNames));

        } else if (type.equals("unAssigned_to_students")) {
            String[] columnNames = { "ID", "First Name", "Username", "specialization" };
            reportView.getReportTable().setModel(new DefaultTableModel(model.dataUnAssignedProjects(), columnNames));
        }
    }
}