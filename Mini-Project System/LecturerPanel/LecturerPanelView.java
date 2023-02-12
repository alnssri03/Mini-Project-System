package LecturerPanel;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.Color;
/*
 * LecturerPanelView.java
 * 
 * This class implements the GUI componets related to the Lecturer panel page in the system.
 * 
 * Used design : MVC pattern
 * 
 */

public class LecturerPanelView extends JFrame {
    private JTable ProjectsTable;
    private JButton buttonActive;
    private JButton buttonAssign;
    private JButton buttonCreate;
    private JButton buttonDelete;
    private JButton buttonEdit;
    private JButton buttonHide;
    private JButton buttonLogout;
    private JButton buttonUnAssigned;
    private JButton buttonView;
    private JPanel contentPanel;
    private JPanel dashboardPanel;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JLabel labelID;
    private JLabel labelName;
    private JLabel labelPhone;
    private JLabel labelSpecialization;
    private JLabel labelUsername;
    private JLabel labelWelcome;
    private JLabel labelWelcomeLecturer;
    private JPanel mainPanel;
    private JLabel mainTitle;
    private JLabel textID;
    private JLabel textName;
    private JLabel textPhone;
    private JLabel textSpecialaztion;
    private JLabel textUsername;
    private JLabel title;
    private JLabel userImage;
    private JLabel viewboardLabel;
    private LecturerPanelController controller;

    public LecturerPanelView() {
        initComponents();
      controller = new LecturerPanelController(this);
      buttonLogout.addActionListener(controller);
      buttonActive.addActionListener(controller);
      buttonAssign.addActionListener(controller);
      buttonHide.addActionListener(controller);
      buttonCreate.addActionListener(controller);
      buttonDelete.addActionListener(controller);
      buttonUnAssigned.addActionListener(controller);
      buttonEdit.addActionListener(controller);
      buttonView.addActionListener(controller);
    }

    private void initComponents() {

        jSeparator1 = new JSeparator();
        mainPanel = new JPanel();
        mainTitle = new JLabel();
        contentPanel = new JPanel();
        title = new JLabel();
        dashboardPanel = new JPanel();
        userImage = new JLabel();
        labelWelcome = new JLabel();
        labelWelcomeLecturer = new JLabel();
        labelID = new JLabel();
        textID = new JLabel();
        labelName = new JLabel();
        textName = new JLabel();
        labelPhone = new JLabel();
        textPhone = new JLabel();
        labelUsername = new JLabel();
        textUsername = new JLabel();
        labelSpecialization = new JLabel();
        textSpecialaztion = new JLabel();
        jScrollPane1 = new JScrollPane();
        ProjectsTable = new JTable();
        viewboardLabel = new JLabel();
        buttonCreate = new JButton();
        buttonUnAssigned = new JButton();
        buttonView = new JButton();
        buttonDelete = new JButton();
        buttonAssign = new JButton();
        buttonEdit = new JButton();
        buttonActive = new JButton();
        buttonHide = new JButton();
        buttonLogout = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        title.setText("Lecturer Panel");

        userImage.setFont(new java.awt.Font("Segoe UI", 0, 36)); 
        userImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/userimage.png"))); // NOI18N
        userImage.setMaximumSize(new java.awt.Dimension(300, 480));

        labelWelcome.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
        labelWelcome.setText("Welcome");

        labelWelcomeLecturer.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
        labelWelcomeLecturer.setText("Lecturer name!");

        labelID.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); 
        labelID.setText("ID:");

        textID.setText("ID");

        labelName.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); 
        labelName.setText("Name:");

        textName.setText("Name");

        labelPhone.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); 
        labelPhone.setText("Phone:");

        textPhone.setText("Phone");

        labelUsername.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); 
        labelUsername.setText("Username:");

        textUsername.setText("User Name");

        labelSpecialization.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); 
        labelSpecialization.setText("Specialization");

        textSpecialaztion.setText("Specialization");

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(userImage, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashboardPanelLayout.createSequentialGroup()
                                .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanelLayout.createSequentialGroup()
                                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                                        .addComponent(labelUsername)
                                        .addGap(26, 26, 26)
                                        .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                                        .addComponent(labelSpecialization)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textSpecialaztion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelWelcomeLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addGap(68, 68, 68))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userImage, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelWelcomeLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelID)
                            .addComponent(textID)
                            .addComponent(labelUsername)
                            .addComponent(textUsername))
                        .addGap(21, 21, 21)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelName)
                            .addComponent(textName)
                            .addComponent(labelSpecialization)
                            .addComponent(textSpecialaztion))
                        .addGap(18, 18, 18)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPhone)
                            .addComponent(textPhone))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProjectsTable = new JTable();
        ProjectsTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        ProjectsTable.setGridColor(Color.BLACK);
        ProjectsTable.setBackground(Color.lightGray);
        ProjectsTable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ProjectsTable.setBounds(100, 300, 570, 370);
        ProjectsTable.setDefaultEditor(Object.class, null);
        jScrollPane1.setViewportView(ProjectsTable);

        viewboardLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
        viewboardLabel.setText("Viewboard");

        buttonCreate.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        buttonCreate.setText("Create New Project");


        buttonUnAssigned.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        buttonUnAssigned.setText("UnAssign");

        buttonView.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        buttonView.setText("View");


        buttonDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        buttonDelete.setText("Delete");

        buttonAssign.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        buttonAssign.setText("Assign");

        buttonEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        buttonEdit.setText("Edit");

        buttonActive.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        buttonActive.setText("Active");
        buttonActive.setActionCommand("");

        buttonHide.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        buttonHide.setText("Hide");
   
        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonAssign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonUnAssigned, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(110, 110, 110)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonHide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonActive, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addGap(120, 120, 120)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonView, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dashboardPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(title))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
                                .addComponent(buttonCreate)
                                .addGap(148, 148, 148)
                                .addComponent(viewboardLabel))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(viewboardLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonActive, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonHide, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonView, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(buttonUnAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        buttonLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        buttonLogout.setForeground(new java.awt.Color(204, 0, 0));
        buttonLogout.setText("Logout");
        buttonLogout.setActionCommand("");


        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(mainTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    public JTable getProjectsTable() {
        return this.ProjectsTable;
    }

    public void setProjectsTable(JTable ProjectsTable) {
        this.ProjectsTable = ProjectsTable;
    }

    public JButton getButtonActive() {
        return this.buttonActive;
    }

    public void setButtonActive(JButton buttonActive) {
        this.buttonActive = buttonActive;
    }

    public JButton getButtonAssign() {
        return this.buttonAssign;
    }

    public void setButtonAssign(JButton buttonAssign) {
        this.buttonAssign = buttonAssign;
    }

    public JButton getButtonCreate() {
        return this.buttonCreate;
    }

    public void setButtonCreate(JButton buttonCreate) {
        this.buttonCreate = buttonCreate;
    }

    public JButton getButtonDelete() {
        return this.buttonDelete;
    }

    public void setButtonDelete(JButton buttonDelete) {
        this.buttonDelete = buttonDelete;
    }

    public JButton getButtonEdit() {
        return this.buttonEdit;
    }

    public void setButtonEdit(JButton buttonEdit) {
        this.buttonEdit = buttonEdit;
    }

    public JButton getButtonHide() {
        return this.buttonHide;
    }

    public void setButtonHide(JButton buttonHide) {
        this.buttonHide = buttonHide;
    }

    public JButton getButtonLogout() {
        return this.buttonLogout;
    }

    public void setButtonLogout(JButton buttonLogout) {
        this.buttonLogout = buttonLogout;
    }

    public JButton getButtonUnAssigned() {
        return this.buttonUnAssigned;
    }

    public void setButtonUnAssigned(JButton buttonUnAssigned) {
        this.buttonUnAssigned = buttonUnAssigned;
    }

    public JButton getButtonView() {
        return this.buttonView;
    }

    public void setButtonView(JButton buttonView) {
        this.buttonView = buttonView;
    }

    public JPanel getContentPanel() {
        return this.contentPanel;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public JPanel getDashboardPanel() {
        return this.dashboardPanel;
    }

    public void setDashboardPanel(JPanel dashboardPanel) {
        this.dashboardPanel = dashboardPanel;
    }

    public JScrollPane getJScrollPane1() {
        return this.jScrollPane1;
    }

    public void setJScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JSeparator getJSeparator1() {
        return this.jSeparator1;
    }

    public void setJSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JLabel getLabelID() {
        return this.labelID;
    }

    public void setLabelID(JLabel labelID) {
        this.labelID = labelID;
    }

    public JLabel getLabelName() {
        return this.labelName;
    }

    public void setLabelName(JLabel labelName) {
        this.labelName = labelName;
    }

    public JLabel getLabelPhone() {
        return this.labelPhone;
    }

    public void setLabelPhone(JLabel labelPhone) {
        this.labelPhone = labelPhone;
    }

    public JLabel getLabelSpecialization() {
        return this.labelSpecialization;
    }

    public void setLabelSpecialization(JLabel labelSpecialization) {
        this.labelSpecialization = labelSpecialization;
    }

    public JLabel getLabelUsername() {
        return this.labelUsername;
    }

    public void setLabelUsername(JLabel labelUsername) {
        this.labelUsername = labelUsername;
    }

    public JLabel getLabelWelcome() {
        return this.labelWelcome;
    }

    public void setLabelWelcome(JLabel labelWelcome) {
        this.labelWelcome = labelWelcome;
    }

    public JLabel getLabelWelcomeLecturer() {
        return this.labelWelcomeLecturer;
    }

    public void setLabelWelcomeLecturer(JLabel labelWelcomeLecturer) {
        this.labelWelcomeLecturer = labelWelcomeLecturer;
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

    public JLabel getTextID() {
        return this.textID;
    }

    public void setTextID(JLabel textID) {
        this.textID = textID;
    }

    public JLabel getTextName() {
        return this.textName;
    }

    public void setTextName(JLabel textName) {
        this.textName = textName;
    }

    public JLabel getTextPhone() {
        return this.textPhone;
    }

    public void setTextPhone(JLabel textPhone) {
        this.textPhone = textPhone;
    }

    public JLabel getTextSpecialaztion() {
        return this.textSpecialaztion;
    }

    public void setTextSpecialaztion(JLabel textSpecialaztion) {
        this.textSpecialaztion = textSpecialaztion;
    }

    public JLabel getTextUsername() {
        return this.textUsername;
    }

    public void setTextUsername(JLabel textUsername) {
        this.textUsername = textUsername;
    }


    public void setTitle(JLabel title) {
        this.title = title;
    }

    public JLabel getUserImage() {
        return this.userImage;
    }

    public void setUserImage(JLabel userImage) {
        this.userImage = userImage;
    }

    public JLabel getViewboardLabel() {
        return this.viewboardLabel;
    }

    public void setViewboardLabel(JLabel viewboardLabel) {
        this.viewboardLabel = viewboardLabel;
    }
    public void setTextID(String text) {
        textID.setText(text);
    }

    public void setTextName(String text) {
        textName.setText(text);
    }

    public void setTextPhone(String text) {
        textPhone.setText(text);
    }

    public void setTextUsername(String text) {
        textUsername.setText(text);
    }
    public void setTextWelcomeAdmin(String text) {
        labelWelcomeLecturer.setText(text);
    }
    public void setTextSpecialization(String text) {
        textSpecialaztion.setText(text);
    }
}
