package AdminPanel;

import javax.swing.JFrame;

import javax.swing.*;
/*
 * AdminPanelView.java
 * 
 * This class implements the GUI componets related to the Admin panel page in the system.
 * 
 * Used design : MVC pattern
 * 
 */
public class AdminPanelView extends JFrame {
    private JButton buttonAccountManagment;
    private JButton buttonLogout;
    private JButton buttonProjectManagment;
    private JButton buttonReports;
    private JButton buttonSpecialization;
    private JPanel contentPanel;
    private JPanel jPanel1;
    private JSeparator jSeparator1;
    private JLabel labelID;
    private JLabel labelName;
    private JLabel labelPhone;
    private JLabel labelUsername;
    private JLabel labelWelcome;
    private JLabel textWelcomeAdmin;
    private JPanel mainPanel;
    private JLabel mainTitle;
    private JLabel textID;
    private JLabel textName;
    private JLabel textPhone;
    private JLabel textUsername;
    private JLabel title;
    private JLabel userImage;
    private AdminPanelControler controller ;


    public AdminPanelView() {
        
        initComponents();
        controller = new AdminPanelControler(this);
        buttonProjectManagment.addActionListener(controller);
        buttonLogout.addActionListener(controller);
        buttonSpecialization.addActionListener(controller);
        buttonAccountManagment.addActionListener(controller);
        buttonReports.addActionListener(controller);
    }

    private void initComponents() {
        jSeparator1 = new JSeparator();
        mainPanel = new JPanel();
        mainTitle = new JLabel();
        contentPanel = new JPanel();
        title = new JLabel();
        buttonProjectManagment = new JButton();
        buttonSpecialization = new JButton();
        buttonAccountManagment = new JButton();
        buttonLogout = new JButton();
        buttonReports = new JButton();
        jPanel1 = new JPanel();
        userImage = new JLabel();
        labelWelcome = new JLabel();
        textWelcomeAdmin = new JLabel();
        labelID = new JLabel();
        textID = new JLabel();
        labelName = new JLabel();
        textName = new JLabel();
        labelPhone = new JLabel();
        textPhone = new JLabel();
        labelUsername = new JLabel();
        textUsername = new JLabel();

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
        title.setText("Admin Panel");

        buttonProjectManagment.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        buttonProjectManagment.setText("Project Managments");

        buttonSpecialization.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        buttonSpecialization.setText("Specialization Managments");

        buttonAccountManagment.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        buttonAccountManagment.setText("Accounts Managments");

        buttonLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        buttonLogout.setForeground(new java.awt.Color(204, 0, 0));
        buttonLogout.setText("Logout");
        buttonLogout.setActionCommand("");

        buttonReports.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        buttonReports.setText("Reports");

        userImage.setFont(new java.awt.Font("Segoe UI", 0, 36)); 
        userImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/userimage.png"))); 
        userImage.setMaximumSize(new java.awt.Dimension(300, 480));

        labelWelcome.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
        labelWelcome.setText("Welcome");

        textWelcomeAdmin.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
        textWelcomeAdmin.setText("Admin name!");

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
        
       

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(userImage, javax.swing.GroupLayout.PREFERRED_SIZE, 209,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelPhone,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 56,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(textPhone,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(textName,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(textID,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(labelUsername)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(textUsername,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 110,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 94,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textWelcomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(45, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(userImage, javax.swing.GroupLayout.PREFERRED_SIZE, 203,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelWelcome,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textWelcomeAdmin,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelID)
                                                        .addComponent(textID)
                                                        .addComponent(labelUsername)
                                                        .addComponent(textUsername))
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelName)
                                                        .addComponent(textName))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelPhone)
                                                        .addComponent(textPhone))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(contentPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(buttonAccountManagment,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(buttonSpecialization,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 214,
                                                                Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(buttonReports,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(buttonProjectManagment,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 223,
                                                                Short.MAX_VALUE))))
                                .addGap(31, 31, 31))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(contentPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                contentPanelLayout.createSequentialGroup()
                                                        .addComponent(title)
                                                        .addGap(282, 282, 282))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout
                                                .createSequentialGroup()
                                                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(317, 317, 317)))));
        contentPanelLayout.setVerticalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title)
                                .addGap(50, 50, 50)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(40, 40, 40)
                                .addGroup(contentPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonAccountManagment, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonProjectManagment, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(contentPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonReports, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainTitle)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 734,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)));
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(mainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public JButton getButtonAccountManagment() {
        return this.buttonAccountManagment;
    }

    public void setButtonAccountManagment(JButton buttonAccountManagment) {
        this.buttonAccountManagment = buttonAccountManagment;
    }

    public JButton getButtonLogout() {
        return this.buttonLogout;
    }

    public void setButtonLogout(JButton buttonLogout) {
        this.buttonLogout = buttonLogout;
    }

    public JButton getButtonProjectManagment() {
        return this.buttonProjectManagment;
    }

    public void setButtonProjectManagment(JButton buttonProjectManagment) {
        this.buttonProjectManagment = buttonProjectManagment;
    }

    public JButton getButtonReports() {
        return this.buttonReports;
    }

    public void setButtonReports(JButton buttonReports) {
        this.buttonReports = buttonReports;
    }

    public JButton getButtonSpecialization() {
        return this.buttonSpecialization;
    }

    public void setButtonSpecialization(JButton buttonSpecialization) {
        this.buttonSpecialization = buttonSpecialization;
    }

    public JPanel getContentPanel() {
        return this.contentPanel;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public JPanel getJPanel1() {
        return this.jPanel1;
    }

    public void setJPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
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

    public JLabel getLabelWelcomeAdmin() {
        return this.textWelcomeAdmin;
    }

    public void setLabelWelcomeAdmin(JLabel textWelcomeAdmin) {
        this.textWelcomeAdmin = textWelcomeAdmin;
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


    public JLabel getTextName() {
        return this.textName;
    }



    public JLabel getTextPhone() {
        return this.textPhone;
    }


    public JLabel getTextUsername() {
        return this.textUsername;
    }

   
    public JLabel getUserImage() {
        return this.userImage;
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
        textWelcomeAdmin.setText(text);
    }

}