package CreateAccount;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * CreateAccountView.java
 * 
 * This class implements the GUI componets related to the Create account page in the system.
 * 
 * Used design : MVC pattern
 * 
 */
public class CreateAccountView extends JFrame {
    private JLabel labelFirstName;
    private JLabel labelLastName;
    private JLabel labelUsername;
    private JLabel labelPassword;
    private JLabel labelPhone;
    private JLabel labelSpecialization;
    private JLabel labelUserType;

    private JTextField TextFieldFirstName;
    private JTextField TextFieldLastName;
    private JTextField TextFieldUsername;
    private JTextField TextFieldPassword;
    private JTextField TextFieldPhone;

    private JButton buttonCreate;
    private JPanel mainPanel;
    private JPanel contentPanel;
    private JButton buttonBack;
    private JLabel title;
    private JLabel mainTitle;
    private JComboBox<String> accountType;
    private JComboBox<String> spcyType;
    private CreateAccountController controller;

    public CreateAccountView() {
        initComponents();
        controller = new CreateAccountController(this);
        accountType.addActionListener(e -> controller.getType((String) accountType.getSelectedItem()));
        buttonBack.addActionListener(controller);
        buttonCreate.addActionListener(controller);


    }

    private void initComponents() {

        mainPanel = new JPanel();
        mainTitle = new JLabel();
        contentPanel = new JPanel();
        title = new JLabel();
        buttonCreate = new JButton();
        spcyType = new JComboBox<>();
        labelSpecialization = new JLabel();
        labelLastName = new JLabel();
        labelPassword = new JLabel();
        labelFirstName = new JLabel();
        labelUsername = new JLabel();
        TextFieldFirstName = new JTextField();
        TextFieldLastName = new JTextField();
        TextFieldPhone = new JTextField();
        TextFieldUsername = new JTextField();
        TextFieldPassword = new JTextField();
        labelPhone = new JLabel();
        accountType = new JComboBox<>();
        labelUserType = new JLabel();
        buttonBack = new JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setVisible(true);

        mainPanel.setBackground(new java.awt.Color(51, 102, 255));
        mainPanel.setMaximumSize(new java.awt.Dimension(800, 800));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 800));

        mainTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(255, 255, 255));
        mainTitle.setText("MMU Mini-Project");

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contentPanel.setForeground(new java.awt.Color(255, 255, 255));
        contentPanel.setPreferredSize(new java.awt.Dimension(600, 331));

        title.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        title.setText("Create Account");

        buttonCreate.setText("Create");


        labelSpecialization.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelSpecialization.setText("Specialization");

        labelLastName.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelLastName.setText("Last Name");

        labelPassword.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelPassword.setText("Password ");

        labelFirstName.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelFirstName.setText("First Name");

        labelUsername.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelUsername.setText("Username");

        labelPhone.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelPhone.setText("Phone Number");

        String[] usersType = {"Student", "Lecturer","Admin"};
        accountType = new JComboBox<>(usersType);
        accountType.setSelectedIndex(0);
     

        labelUserType.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelUserType.setText("User Type ");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(title)
                                .addGap(276, 276, 276))
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(contentPanelLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(labelUsername,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 116,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(TextFieldUsername,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 161,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(accountType, 0,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addComponent(labelUserType,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 116,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(85, 85, 85)
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(contentPanelLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                .addComponent(labelSpecialization,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 161,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(spcyType, 0,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addGroup(contentPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(TextFieldFirstName,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                161,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(labelFirstName,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                116,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(labelPassword,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                116,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TextFieldPassword,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                161,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(110, 110, 110)
                                                                .addGroup(contentPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(TextFieldPhone,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                161,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TextFieldLastName,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                161,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(labelLastName,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                116,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(labelPhone,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                148,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(305, 305, 305)
                                                .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 98,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        contentPanelLayout.setVerticalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(title)
                                                .addGap(116, 116, 116)
                                                .addComponent(labelFirstName)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TextFieldFirstName,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(accountType,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(158, 158, 158)
                                                .addComponent(labelUserType)
                                                .addGap(115, 115, 115)
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelUsername)
                                                        .addComponent(labelPassword))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TextFieldUsername,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TextFieldPassword,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addComponent(labelLastName)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(TextFieldLastName,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addGap(144, 144, 144)
                                                                .addComponent(labelPhone)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(TextFieldPhone,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(51, 51, 51)
                                .addComponent(labelSpecialization)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spcyType, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE)));

        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

    public JLabel getLabelFirstName() {
        return this.labelFirstName;
    }

    public void setLabelFirstName(JLabel labelFirstName) {
        this.labelFirstName = labelFirstName;
    }

    public JLabel getLabelLastName() {
        return this.labelLastName;
    }

    public void setLabelLastName(JLabel labelLastName) {
        this.labelLastName = labelLastName;
    }

    public JLabel getLabelUsername() {
        return this.labelUsername;
    }

    public void setLabelUsername(JLabel labelUsername) {
        this.labelUsername = labelUsername;
    }

    public JLabel getLabelPassword() {
        return this.labelPassword;
    }

    public void setLabelPassword(JLabel labelPassword) {
        this.labelPassword = labelPassword;
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

    public JLabel getLabelUserType() {
        return this.labelUserType;
    }

    public void setLabelUserType(JLabel labelUserType) {
        this.labelUserType = labelUserType;
    }

    public JTextField getTextFieldFirstName() {
        return this.TextFieldFirstName;
    }

    public void setTextFieldFirstName(JTextField TextFieldFirstName) {
        this.TextFieldFirstName = TextFieldFirstName;
    }

    public JTextField getTextFieldLastName() {
        return this.TextFieldLastName;
    }

    public void setTextFieldLastName(JTextField TextFieldLastName) {
        this.TextFieldLastName = TextFieldLastName;
    }

    public JTextField getTextFieldUsername() {
        return this.TextFieldUsername;
    }

    public void setTextFieldUsername(JTextField TextFieldUsername) {
        this.TextFieldUsername = TextFieldUsername;
    }

    public JTextField getTextFieldPassword() {
        return this.TextFieldPassword;
    }

    public void setTextFieldPassword(JTextField TextFieldPassword) {
        this.TextFieldPassword = TextFieldPassword;
    }

    public JTextField getTextFieldPhone() {
        return this.TextFieldPhone;
    }

    public void setTextFieldPhone(JTextField TextFieldPhone) {
        this.TextFieldPhone = TextFieldPhone;
    }

    public JButton getButtonCreate() {
        return this.buttonCreate;
    }

    public void setButtonCreate(JButton buttonCreate) {
        this.buttonCreate = buttonCreate;
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

    public JComboBox<String> getAccountType() {
        return this.accountType;
    }

    public void setAccountType(JComboBox<String> accountType) {
        this.accountType = accountType;
    }

    public JComboBox<String> getSpcyType() {
        return this.spcyType;
    }

    public void setSpcyType(JComboBox<String> spcyType) {
        this.spcyType = spcyType;
    }

}
