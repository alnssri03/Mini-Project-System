package EditAccount;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * EditAccountView.java
 * 
 * This class implements the GUI componets related to the Edit account page in the system.
 * 
 * Used design : MVC pattern
 * 
 */
public class EditAccountView extends JFrame {
    private JLabel labelFirstName;
    private JLabel labelLastName;
    private JLabel labelUsername;
    private JLabel labelPassword;
    private JLabel labelPhone;
    private JLabel labelSpecialization;

    private JTextField TextFieldFirstName;
    private JTextField TextFieldLastName;
    private JTextField TextFieldUsername;
    private JTextField TextFieldPassword;
    private JTextField TextFieldPhone;

    private JButton buttonEdit;
    private JPanel mainPanel;
    private JPanel contentPanel;
    private JButton buttonBack;
    private JLabel title;
    private JLabel mainTitle;
    private JComboBox<String> spcyType;
    private String selectedID;

    public EditAccountView(String selectedID) {
        this.selectedID = selectedID;
        initComponents();
         EditAccountController controller = new EditAccountController(this);
         buttonBack.addActionListener(controller);
         buttonEdit.addActionListener(controller);
    }

    private void initComponents() {
        mainPanel = new JPanel();
        mainTitle = new JLabel();
        contentPanel = new JPanel();
        title = new JLabel();
        buttonEdit = new JButton();
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
        spcyType = new JComboBox<>();
        buttonBack = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        title.setText("Edit Account");

        buttonEdit.setText("Edit");

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

        spcyType.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                                                .addComponent(spcyType, 0,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addComponent(labelSpecialization,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 161,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(85, 85, 85)
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TextFieldFirstName,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 161,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelFirstName,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 116,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelPassword,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 116,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TextFieldPassword,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 161,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(title))
                                                .addGap(110, 110, 110)
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TextFieldPhone,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 161,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TextFieldLastName,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 161,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelLastName,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 116,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelPhone,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 148,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(305, 305, 305)
                                                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 98,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(19, Short.MAX_VALUE)));
        contentPanelLayout.setVerticalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout
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
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addComponent(title)
                                                .addGroup(contentPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addGap(116, 116, 116)
                                                                .addGroup(contentPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(labelFirstName)
                                                                        .addComponent(labelSpecialization))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(contentPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(TextFieldFirstName,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(spcyType,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addGap(260, 260, 260)
                                                                .addGroup(contentPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(labelUsername)
                                                                        .addComponent(labelPassword))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(contentPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(TextFieldUsername,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TextFieldPassword,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(210, 210, 210)
                                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
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

    public JTextField getTextFieldFirstName() {
        return this.TextFieldFirstName;
    }

   

    public JTextField getTextFieldLastName() {
        return this.TextFieldLastName;
    }

 

    public JTextField getTextFieldUsername() {
        return this.TextFieldUsername;
    }

    public JTextField getTextFieldPassword() {
        return this.TextFieldPassword;
    }



    public JTextField getTextFieldPhone() {
        return this.TextFieldPhone;
    }



    public JButton getButtonEdit() {
        return this.buttonEdit;
    }

    public void setButtonEdit(JButton buttonEdit) {
        this.buttonEdit = buttonEdit;
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

    public JComboBox<String> getSpcyType() {
        return this.spcyType;
    }

    public void setSpcyType(JComboBox<String> spcyType) {
        this.spcyType = spcyType;
    }

    public String getSelectedID() {
        return this.selectedID;
    }

    public void setSelectedID(String selectedID) {
        this.selectedID = selectedID;
    }
    public void setTextFieldFirstName(String firstName) {
        TextFieldFirstName.setText(firstName);
    }
    
    public void setTextFieldLastName(String lastName) {
        TextFieldLastName.setText(lastName);
    }
    
    public void setTextFieldUsername(String username) {
        TextFieldUsername.setText(username);
    }
    
    public void setTextFieldPassword(String password) {
        TextFieldPassword.setText(password);
    }
    
    public void setTextFieldPhone(String phone) {
        TextFieldPhone.setText(phone);
    }
    public void setComboBoxSpIndex(String sp) {
        spcyType.setSelectedItem(sp);
    }
}
