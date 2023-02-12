package ProjectEdit;

import javax.swing.*;

/*
 * ProjectEditView.java
 * 
 * This class implements the GUI componets related to the Project Edit page in the system.
 * 
 * Used design : MVC pattern
 * 
 */

public class ProjectEditView extends JFrame {

  
    private JTextField TextFieldContent;
    private JTextField TextFieldTitle;
    private JButton backButton;
    private JComboBox<String> comboBoxSp;
    private JPanel contentPanel;
    private JButton editButton;
    private JLabel labelContent;
    private JLabel labelSpecialization;
    private JLabel labelTitle;
    private JPanel mainPanel;
    private JLabel mainTitle;
    private JLabel title;
    private String selectedID;
    private ProjectEditController controller;
    
    public ProjectEditView(String selectedID) {
        initComponents();
        this.selectedID = selectedID;
        controller = new ProjectEditController(this);
        editButton.addActionListener(controller);
        backButton.addActionListener(controller);
    }
                         
    private void initComponents() {

        mainPanel = new JPanel();
        mainTitle = new JLabel();
        contentPanel = new JPanel();
        title = new JLabel();
        labelSpecialization = new JLabel();
        labelContent = new JLabel();
        labelTitle = new JLabel();
        TextFieldTitle = new JTextField();
        TextFieldContent = new JTextField();
        comboBoxSp = new JComboBox<>();
        editButton = new JButton();
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
        title.setText("Edit new Project ");

        labelSpecialization.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
        labelSpecialization.setText("Specialization");

        labelContent.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
        labelContent.setText("Content");

        labelTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
        labelTitle.setText("Title");

        comboBoxSp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        editButton.setText("Edit");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(TextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSpecialization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxSp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(241, 241, 241))))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(TextFieldContent, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 149, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelContent)
                .addGap(312, 312, 312))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(94, 94, 94)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitle)
                    .addComponent(labelSpecialization))
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(labelContent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldContent, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

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
    

    public JTextField getTextFieldContent() {
        return this.TextFieldContent;
    }
    public String getSelectedID() {
        return this.selectedID;
    }
    public void setSelecteID(String selectedID) {
        this.selectedID = selectedID;
    }

    public void setTextFieldContent(JTextField TextFieldContent) {
        this.TextFieldContent = TextFieldContent;
    }

    public JTextField getTextFieldTitle() {
        return this.TextFieldTitle;
    }

    public void setTextFieldTitle(JTextField TextFieldTitle) {
        this.TextFieldTitle = TextFieldTitle;
    }

    public JButton getBackButton() {
        return this.backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public JComboBox<String> getComboBoxSp() {
        return this.comboBoxSp;
    }

    public void setComboBoxSpIndex(String sp) {
        comboBoxSp.setSelectedItem(sp);
    }

    public JPanel getContentPanel() {
        return this.contentPanel;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

 
    public void setComboBoxSp(JComboBox<String> comboBoxSp) {
        this.comboBoxSp = comboBoxSp;
    }

    public JButton getEditButton() {
        return this.editButton;
    }

    public void setEditButton(JButton editButton) {
        this.editButton = editButton;
    }



    public void setSelectedID(String selectedID) {
        this.selectedID = selectedID;
    }



    public JLabel getLabelContent() {
        return this.labelContent;
    }

    public void setLabelContent(JLabel labelContent) {
        this.labelContent = labelContent;
    }

    public JLabel getLabelSpecialization() {
        return this.labelSpecialization;
    }

    public void setLabelSpecialization(JLabel labelSpecialization) {
        this.labelSpecialization = labelSpecialization;
    }

    public JLabel getLabelTitle() {
        return this.labelTitle;
    }

    public void setLabelTitle(JLabel labelTitle) {
        this.labelTitle = labelTitle;
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

    public void setTitle(JLabel title) {
        this.title = title;
    }
    public void setTextFieldContent(String text) {
    TextFieldContent.setText(text);
    }

    public void setTextFieldTitle(String text) {
        TextFieldTitle.setText(text);
    }


}
