package Login;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/*
 * LoginView.java
 * 
 * This class implements the GUI componets related to the Login page in the system.
 * 
 * Used design : MVC pattern
 * 
 */
public class LoginView extends javax.swing.JFrame {

    private JLabel labelTitle;
    private JLabel labelLogin;
    private JLabel labelPassword;
    private JLabel labelUsername;

    private JTextField textUsername;
    private JPasswordField textPassword;
    private JButton buttonLogin;
    private JPanel mainPanel;
    private JPanel loginPanel;

    public LoginView() {
        initComponents();
    }

    private void initComponents() {
        labelTitle = new JLabel();
        labelLogin = new JLabel();
        labelPassword = new JLabel();
        labelUsername = new JLabel();
        textUsername = new JTextField();
        textPassword = new JPasswordField();
        buttonLogin = new JButton();
        mainPanel = new JPanel();
        loginPanel = new JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setVisible(true);
        LoginController controller = new LoginController(this);

        mainPanel = new JPanel();
        mainPanel.setBackground(new java.awt.Color(51, 102, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 800));

        labelTitle = new JLabel();
        labelTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("MMU Mini-Project");

        loginPanel = new JPanel();
        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginPanel.setForeground(new java.awt.Color(255, 255, 255));
        loginPanel.setPreferredSize(new java.awt.Dimension(600, 331));

        textPassword = new JPasswordField();
        textPassword.setText("");

        textUsername = new JTextField();
        textUsername.setText("");

        labelUsername = new JLabel();
        labelUsername.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        labelUsername.setText("Username :");
        add(labelUsername);

        labelPassword = new JLabel();
        labelPassword.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        labelPassword.setText("Password :");
        add(labelPassword);

        labelLogin = new JLabel();
        labelLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        labelLogin.setText("Login");

        buttonLogin = new JButton();
        buttonLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(controller);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(loginPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(loginPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelLogin)
                                        .addGroup(loginPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textUsername)
                                                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 188,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(187, Short.MAX_VALUE)));
        loginPanelLayout.setVerticalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(labelLogin)
                                .addGap(82, 82, 82)
                                .addGroup(
                                        loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(labelPassword)
                                                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(124, 124, 124)));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(labelTitle)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGap(0, 103, Short.MAX_VALUE)
                                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 181,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(303, 303, 303)));
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118,
                                        Short.MAX_VALUE)
                                .addComponent(buttonLogin)
                                .addGap(99, 99, 99)));

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

    public JLabel getLabelTitle() {
        return this.labelTitle;
    }

    public void setLabelTitle(JLabel labelTitle) {
        this.labelTitle = labelTitle;
    }

    public JLabel getLabelLogin() {
        return this.labelLogin;
    }

    public void setLabelLogin(JLabel labelLogin) {
        this.labelLogin = labelLogin;
    }

    public JLabel getLabelPassword() {
        return this.labelPassword;
    }

    public void setLabelPassword(JLabel labelPassword) {
        this.labelPassword = labelPassword;
    }

    public JLabel getLabelUsername() {
        return this.labelUsername;
    }

    public void setLabelUsername(JLabel labelUsername) {
        this.labelUsername = labelUsername;
    }

    public JTextField getTextUsername() {
        return this.textUsername;
    }

    public void setTextUsername(JTextField textUsername) {
        this.textUsername = textUsername;
    }

    public JPasswordField getTextPassword() {
        return this.textPassword;
    }

    public void setTextPassword(JPasswordField textPassword) {
        this.textPassword = textPassword;
    }

    public JButton getButtonLogin() {
        return this.buttonLogin;
    }

    public void setButtonLogin(JButton buttonLogin) {
        this.buttonLogin = buttonLogin;
    }

    public JPanel getMainPanel() {
        return this.mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JPanel getLoginPanel() {
        return this.loginPanel;
    }

    public void setLoginPanel(JPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

}
