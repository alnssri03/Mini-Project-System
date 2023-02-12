package ProjectAssign;

import javax.swing.*;
/*
 * ProjectAssignView.java
 * 
 * This class implements the GUI componets related to the Project assign page in the system.
 * 
 * Used design : MVC pattern
 * 
 */
public class ProjectAssignView extends javax.swing.JFrame {

    private JButton backButton;
    private JPanel contentPanel;
    private JButton assignButton;
    private JScrollPane jScrollPane1;
    private JPanel mainPanel;
    private JLabel mainTitle;
    private JLabel noteLabel;
    private JTable studentTable;
    private JLabel title;
    private String selectedIDProject;
    private String selectedIDStudent;

    private ProjectAssignController controller;

    public ProjectAssignView(String selectedIDProject) {
        this.selectedIDProject = selectedIDProject;
        initComponents();
        controller = new ProjectAssignController(this);
        assignButton.addActionListener(controller);
        backButton.addActionListener(controller);
    }

    private void initComponents() {

        mainPanel = new JPanel();
        mainTitle = new JLabel();
        contentPanel = new JPanel();
        title = new JLabel();
        assignButton = new JButton();
        jScrollPane1 = new JScrollPane();
        studentTable = new JTable();
        noteLabel = new JLabel();
        backButton = new JButton();

        setBackground(new java.awt.Color(0, 102, 102));
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
        title.setText("Assign Project to Student ");

        assignButton.setText("Assign");

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jScrollPane1.setViewportView(studentTable);

        noteLabel.setForeground(new java.awt.Color(204, 0, 51));
        noteLabel.setText("*Please choose student to assign the project to ");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addGroup(contentPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(contentPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        contentPanelLayout.createSequentialGroup()
                                                                .addComponent(title)
                                                                .addGap(198, 198, 198))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        contentPanelLayout.createSequentialGroup()
                                                                .addComponent(assignButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 103,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(307, 307, 307))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        contentPanelLayout.createSequentialGroup()
                                                                .addComponent(jScrollPane1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 631,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(46, 46, 46))))));
        contentPanelLayout.setVerticalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56,
                                        Short.MAX_VALUE)
                                .addComponent(noteLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)));

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        backButton.setText("Back");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
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
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
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

    public JButton getBackButton() {
        return this.backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public JPanel getContentPanel() {
        return this.contentPanel;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public JButton getAssignButton() {
        return this.assignButton;
    }

    public void setAssignButton(JButton assignButton) {
        this.assignButton = assignButton;
    }

    public JScrollPane getJScrollPane1() {
        return this.jScrollPane1;
    }

    public void setJScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JPanel getMainPanel() {
        return this.mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JLabel getMainTitle() {
        return this.mainTitle;
    }

    public void setMainTitle(JLabel mainTitle) {
        this.mainTitle = mainTitle;
    }

    public JLabel getNoteLabel() {
        return this.noteLabel;
    }

    public void setNoteLabel(JLabel noteLabel) {
        this.noteLabel = noteLabel;
    }

    public JTable getStudentTable() {
        return this.studentTable;
    }

    public void setStudentTable(JTable studentTable) {
        this.studentTable = studentTable;
    }

    public void setTitle(JLabel title) {
        this.title = title;
    }

    public String getSelectedIDProject() {
        return this.selectedIDProject;
    }

    public void setSelectedIDProject(String selectedIDProject) {
        this.selectedIDProject = selectedIDProject;
    }

    public String getSelectedIDStudent() {
        return this.selectedIDStudent;
    }

    public void setSelectedIDStudent(String selectedIDStudent) {
        this.selectedIDStudent = selectedIDStudent;
    }

    public ProjectAssignController getController() {
        return this.controller;
    }

    public void setController(ProjectAssignController controller) {
        this.controller = controller;
    }

}
