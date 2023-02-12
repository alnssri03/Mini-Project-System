package ProjectManagement;

import java.awt.Font;

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
 * ProjectManagmentView.java
 * 
 * This class implements the GUI componets related to the Project Managment page in the system.
 * 
 * Used design : MVC pattern
 * 
 */
public class ProjectmanagementView extends JFrame {
    private JButton buttonCreat;
    private JButton buttonView;
    private JButton buttonDelete;
    private JButton buttonComment;
    private JButton buttonAssign;
    private JButton buttonActive;
    private JButton buttonHide;
    private JButton buttonUnAssign;
    private JComboBox<String> ProjectCatagory;
    private JTable projectsTable;
    private JButton buttonBack;
    private JButton buttonEdit;
    private JPanel mainPanel;
    private JPanel contentPanel;
    private JLabel title;
    private JLabel mainTitle;

    public ProjectmanagementView() {
        initComponents();
        ProjectmanagementController controller = new ProjectmanagementController(this);
        buttonBack.addActionListener(controller);
        ProjectCatagory.addActionListener(e -> controller.updateTable((String) ProjectCatagory.getSelectedItem()));
        buttonActive.addActionListener(controller);
        buttonAssign.addActionListener(controller);
        buttonHide.addActionListener(controller);
        buttonCreat.addActionListener(controller);
        buttonDelete.addActionListener(controller);
        buttonUnAssign.addActionListener(controller);
        buttonEdit.addActionListener(controller);
        buttonComment.addActionListener(controller);

        buttonView.addActionListener(controller);

    }

    private void initComponents() {

        mainPanel = new JPanel();
        mainTitle = new JLabel();
        contentPanel = new JPanel();
        title = new JLabel();
        projectsTable = new JTable();
        ProjectCatagory = new JComboBox<>();
        buttonEdit = new JButton();
        buttonView = new JButton();
        buttonDelete = new JButton();
        buttonCreat = new JButton();
        buttonActive = new JButton();
        buttonHide = new JButton();
        buttonUnAssign = new JButton();
        buttonAssign = new JButton();
        buttonComment = new JButton();
        buttonBack = new JButton();

        buttonAssign.setVisible(false);
        buttonUnAssign.setVisible(false);

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

        title.setFont(new Font("Segoe UI Black", 1, 24)); 
        title.setText("Project Managment");

        String[] ProjectCatagorys = { "All projects", "My Projects" };
        ProjectCatagory = new JComboBox<>(ProjectCatagorys);
        ProjectCatagory.setSelectedIndex(0);
        ProjectCatagory.setBounds(565, 80, 100, 30);
        this.add(ProjectCatagory);

        projectsTable = new JTable();
        projectsTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        projectsTable.setGridColor(Color.BLACK);
        projectsTable.setBackground(Color.lightGray);
        projectsTable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        projectsTable.setBounds(100, 300, 570, 370);
        projectsTable.setDefaultEditor(Object.class, null);
        JScrollPane scrollPane = new JScrollPane(projectsTable);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        scrollPane.setBounds(100, 120, 570, 370);
        add(scrollPane);
        buttonEdit.setText("Edit");

        buttonView.setText("View");

        buttonDelete.setText("Delete");

        buttonCreat.setText("Create New Project");

        buttonActive.setText("Active");

        buttonHide.setText("Hide");

        buttonUnAssign.setText("UnAssign");

        buttonAssign.setText("Assign");

        buttonComment.setText("Comment");

        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        buttonBack.setText("Back");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(232, 232, 232)
                                                .addComponent(title))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addComponent(buttonCreat)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(ProjectCatagory,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 119,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(scrollPane,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 697,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addComponent(buttonActive,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(buttonAssign,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addComponent(buttonHide,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(39, 39, 39)
                                                                .addComponent(buttonDelete,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 98,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(buttonEdit,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 96,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(buttonView,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 98,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(buttonComment,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(41, 41, 41)
                                                                .addComponent(buttonUnAssign,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(16, Short.MAX_VALUE)));
        contentPanelLayout.setVerticalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout
                                                .createSequentialGroup()
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addComponent(title)
                                                                .addGap(45, 45, 45)
                                                                .addGroup(contentPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(ProjectCatagory,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(buttonCreat,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(scrollPane,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 397,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(contentPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(buttonActive)
                                                                        .addComponent(buttonAssign))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(buttonHide))
                                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(buttonUnAssign)))
                                                .addContainerGap())
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(569, 569, 569)
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(buttonEdit,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(buttonView,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(buttonDelete,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(buttonComment,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(15, Short.MAX_VALUE)))));

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

    public JButton getButtonCreat() {
        return this.buttonCreat;
    }

    public void setButtonCreat(JButton buttonCreat) {
        this.buttonCreat = buttonCreat;
    }

    public JButton getButtonView() {
        return this.buttonView;
    }

    public void setButtonView(JButton buttonView) {
        this.buttonView = buttonView;
    }

    public JButton getButtonDelete() {
        return this.buttonDelete;
    }

    public void setButtonDelete(JButton buttonDelete) {
        this.buttonDelete = buttonDelete;
    }

    public JButton getButtonAssign() {
        return this.buttonAssign;
    }

    public void setButtonAssign(JButton buttonAssign) {
        this.buttonAssign = buttonAssign;
    }

    public JButton getButtonActive() {
        return this.buttonActive;
    }

    public void setButtonActive(JButton buttonActive) {
        this.buttonActive = buttonActive;
    }

    public JButton getButtonHide() {
        return this.buttonHide;
    }

    public void setButtonHide(JButton buttonHide) {
        this.buttonHide = buttonHide;
    }

    public JButton getButtonUnAssign() {
        return this.buttonUnAssign;
    }

    public void setButtonUnAssign(JButton buttonUnAssign) {
        this.buttonUnAssign = buttonUnAssign;
    }

    public JComboBox<String> getProjectCatagory() {
        return this.ProjectCatagory;
    }

    public void setProjectCatagory(JComboBox<String> ProjectCatagory) {
        this.ProjectCatagory = ProjectCatagory;
    }

    public JTable getProjectsTable() {
        return this.projectsTable;
    }

    public void setProjectsTable(JTable projectsTable) {
        this.projectsTable = projectsTable;
    }

    public JButton getButtonBack() {
        return this.buttonBack;
    }

    public void setButtonBack(JButton buttonBack) {
        this.buttonBack = buttonBack;
    }

    public JButton getButtonComment() {
        return this.buttonComment;
    }

    public void setButtonComment(JButton buttonComment) {
        this.buttonComment = buttonComment;
    }

    public JButton getButtonEdit() {
        return this.buttonEdit;
    }

    public void setButtonEdit(JButton buttonEdit) {
        this.buttonEdit = buttonEdit;
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

}
