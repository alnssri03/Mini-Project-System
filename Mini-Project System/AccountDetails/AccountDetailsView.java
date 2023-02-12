/*
 * AccountDetailsView.java
 * 
 * This class implements the GUI componets related to the account details page in the system.
 * 
 * Used design : MVC pattern
 * 
 */


package AccountDetails;
import javax.swing.*;

public class AccountDetailsView extends JFrame {

    private JButton backButton;
    private JPanel contentPanel;
    private JLabel labelAssignedProjectID;
    private JLabel labelProjectID;
    private JLabel labelUserSpecialization;
    private JLabel labelFirstName;
    private JLabel labelLastName;
    private JLabel labelPhone;
    private JLabel labelUsername;
    private JLabel labelPassword;
    private JLabel labelAvailability;
    private JPanel mainPanel;
    private JLabel mainTitle;
    private JTextField textAssignedProjectID;
    private JTextField textAvailability;
    private JTextField textFirstName;
    private JTextField textId;
    private JTextField textLastName;
    private JTextField textPassword;
    private JTextField textPhone;
    private JTextField textSpecialization;
    private JTextField textUsername;
    private JLabel title;
    private String selectedID; // the selected user id 
private AccountDetailsController controller;
   


    public AccountDetailsView(String selectedID) {
        this.selectedID = selectedID;
        initComponents();
        controller = new AccountDetailsController(this);
        backButton.addActionListener(controller);
    }

 
                           
    private void initComponents() {

        mainPanel = new JPanel();
        mainTitle = new JLabel();
        contentPanel = new JPanel();
        title = new JLabel();
        labelUserSpecialization = new JLabel();
        labelAssignedProjectID = new JLabel();
        labelFirstName = new JLabel();
        labelProjectID = new JLabel();
        textFirstName = new JTextField();
        textId = new JTextField();
        textAssignedProjectID = new JTextField();
        textSpecialization = new JTextField();
        labelLastName = new JLabel();
        textLastName = new JTextField();
        labelPhone = new JLabel();
        textPhone = new JTextField();
        labelUsername = new JLabel();
        textUsername = new JTextField();
        labelPassword = new JLabel();
        textPassword = new JTextField();
        labelAvailability = new JLabel();
        textAvailability = new JTextField();
        backButton = new JButton();

        textAssignedProjectID.setEditable(false);
        textAvailability.setEditable(false);
        textFirstName.setEditable(false);
        textId.setEditable(false);
        textLastName.setEditable(false);
        textPassword.setEditable(false);
        textPhone.setEditable(false);
        textSpecialization.setEditable(false);
        textUsername.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
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
        title.setText("Account Details");

        labelUserSpecialization.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelUserSpecialization.setText("Specialization");

        labelAssignedProjectID.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelAssignedProjectID.setText("Assigned Project ID");

        labelFirstName.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelFirstName.setText("First Name");

        labelProjectID.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelProjectID.setText("User ID");

  

        labelLastName.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelLastName.setText("Last Name");

        labelPhone.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelPhone.setText("Phone");

        labelUsername.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelUsername.setText("UserName");

        labelPassword.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelPassword.setText("Password");

        labelAvailability.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelAvailability.setText("Availability");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(267, 267, 267))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelAvailability, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textAvailability, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelAssignedProjectID)
                            .addComponent(textAssignedProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUserSpecialization))
                        .addGap(28, 28, 28))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(labelProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(title)
                        .addGap(261, 261, 261))))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(title)
                .addGap(61, 61, 61)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProjectID)
                    .addComponent(labelUserSpecialization))
                .addGap(8, 8, 8)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(labelFirstName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(labelLastName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(labelPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(labelUsername)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(labelPassword)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(labelAvailability)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addComponent(labelAssignedProjectID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAssignedProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setText("Back");
 

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(mainTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(mainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
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

    public JLabel getLabelAssignedProjectID() {
        return this.labelAssignedProjectID;
    }

    public void setLabelAssignedProjectID(JLabel labelAssignedProjectID) {
        this.labelAssignedProjectID = labelAssignedProjectID;
    }

    public JLabel getLabelProjectID() {
        return this.labelProjectID;
    }

    public void setLabelProjectID(JLabel labelProjectID) {
        this.labelProjectID = labelProjectID;
    }

    public JLabel getLabelUserSpecialization() {
        return this.labelUserSpecialization;
    }

    public void setLabelUserSpecialization(JLabel labelUserSpecialization) {
        this.labelUserSpecialization = labelUserSpecialization;
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

    public JLabel getLabelPassword() {
        return this.labelPassword;
    }

    public void setLabelPassword(JLabel labelPassword) {
        this.labelPassword = labelPassword;
    }

    public JLabel getLabelAvailability() {
        return this.labelAvailability;
    }

    public void setLabelAvailability(JLabel labelAvailability) {
        this.labelAvailability = labelAvailability;
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

    public JTextField getTextAssignedProjectID() {
        return this.textAssignedProjectID;
    }


    public JTextField getTextAvailability() {
        return this.textAvailability;
    }


    public JTextField getTextFirstName() {
        return this.textFirstName;
    }


    public JTextField getTextId() {
        return this.textId;
    }


    public JTextField getTextLastName() {
        return this.textLastName;
    }


    public JTextField getTextPassword() {
        return this.textPassword;
    }


    public JTextField getTextPhone() {
        return this.textPhone;
    }


    public JTextField getTextSpecialization() {
        return this.textSpecialization;
    }


    public JTextField getTextUsername() {
        return this.textUsername;
    }




    public void setTitle(JLabel title) {
        this.title = title;
    }
  

    public void setTextAssignedProjectID(String text) {
    textAssignedProjectID.setText(text);
}

public void setTextAvailability(String text) {
    textAvailability.setText(text);
}

public void setTextFirstName(String text) {
    textFirstName.setText(text);
}

public void setTextId(String text) {
    textId.setText(text);
}

public void setTextLastName(String text) {
    textLastName.setText(text);
}

public void setTextPassword(String text) {
    textPassword.setText(text);
}

public void setTextPhone(String text) {
    textPhone.setText(text);
}

public void setTextSpecialization(String text) {
    textSpecialization.setText(text);
}

public void setTextUsername(String text) {
    textUsername.setText(text);
}

public String getSelectedID() {
    return this.selectedID;
}

public void setSelectedID(String selectedID) {
    this.selectedID = selectedID;
}


}
