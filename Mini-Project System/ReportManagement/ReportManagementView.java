package ReportManagement;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import java.awt.Color;
/*
 * ReportManagmentView.java
 * 
 * This class implements the GUI componets related to the Report managment page in the system.
 * 
 * Used design : MVC pattern
 * 
 */
public class ReportManagementView extends JFrame {

    private JTable reportTable;
    private JButton buttonView;
    private JPanel mainPanel;
    private JPanel contentPanel;
    private JButton buttonBack;
    private JLabel title;
    private JLabel mainTitle;
    private JComboBox<String> reportCatagory;
    private ReportsController controller;

    public ReportManagementView() {
        initComponents();
        controller = new ReportsController(this);
        reportCatagory
                .addActionListener(e -> controller.updateCatagoryTable((String) reportCatagory.getSelectedItem()));
        buttonBack.addActionListener(controller);
        buttonView.addActionListener(controller);
    }

    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainTitle = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        reportTable = new javax.swing.JTable();
        buttonView = new javax.swing.JButton();
        reportCatagory = new javax.swing.JComboBox<>();
        buttonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setVisible(true);

        mainPanel.setBackground(new java.awt.Color(51, 102, 255));
        mainPanel.setMaximumSize(new java.awt.Dimension(800, 800));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 800));

        mainTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); 
        mainTitle.setForeground(new java.awt.Color(255, 255, 255));
        mainTitle.setText("MMU Mini-Project");

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contentPanel.setForeground(new java.awt.Color(255, 255, 255));
        contentPanel.setPreferredSize(new java.awt.Dimension(600, 331));

        title.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); 
        title.setText("Report Managment");

        reportTable.setBackground(new java.awt.Color(204, 204, 204));
        reportTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        reportTable.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); 
        reportTable = new JTable();
        reportTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        reportTable.setGridColor(Color.BLACK);
        reportTable.setBackground(Color.lightGray);
        reportTable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        reportTable.setBounds(100, 300, 570, 370);
        reportTable.setDefaultEditor(Object.class, null);
        JScrollPane scrollPane = new JScrollPane(reportTable);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        scrollPane.setBounds(100, 300, 570, 370);
        add(scrollPane);

        buttonView.setText("View");

        String[] reportCatagorys = { "All_projects", "inactive_projects", "active_projects", "assigned_to_students",
                "unAssigned_to_students" };
        reportCatagory = new JComboBox<>(reportCatagorys);
        reportCatagory.setSelectedIndex(0);
        this.add(reportCatagory);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(314, 314, 314)
                                                .addComponent(buttonView, javax.swing.GroupLayout.PREFERRED_SIZE, 98,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(238, 238, 238)
                                                .addComponent(title))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(scrollPane,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 697,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addGroup(contentPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        
                                                                        )
                                                                .addGap(340, 340, 340)
                                                                .addComponent(reportCatagory,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(16, Short.MAX_VALUE)));
        contentPanelLayout.setVerticalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title)
                                .addGap(76, 76, 76)
                                .addGroup(contentPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(reportCatagory, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                )
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 397,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(buttonView, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE)));

        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        buttonBack.setText("Back");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(107, 107, 107)
                                                .addComponent(mainTitle)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout
                                                .createSequentialGroup()
                                                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 734,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)))));
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(mainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 637,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(68, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        pack();
    }

    public JTable getReportTable() {
        return this.reportTable;
    }

    public void setReportTable(JTable reportTable) {
        this.reportTable = reportTable;
    }

    public JButton getButtonView() {
        return this.buttonView;
    }

    public void setButtonView(JButton buttonView) {
        this.buttonView = buttonView;
    }

    public JPanel getMainPanel() {
        return this.mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JPanel getContentPanel() {
        return this.contentPanel;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public JButton getButtonBack() {
        return this.buttonBack;
    }

    public void setButtonBack(JButton buttonBack) {
        this.buttonBack = buttonBack;
    }

    public void setTitle(JLabel title) {
        this.title = title;
    }

    public JLabel getMainTitle() {
        return this.mainTitle;
    }

    public void setMainTitle(JLabel mainTitle) {
        this.mainTitle = mainTitle;
    }

    public JComboBox<String> getReportCatagory() {
        return this.reportCatagory;
    }

    public void setReportCatagory(JComboBox<String> reportCatagory) {
        this.reportCatagory = reportCatagory;
    }



}
