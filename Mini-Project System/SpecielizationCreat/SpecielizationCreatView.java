package SpecielizationCreat;


import javax.swing.*;
/*
 * SpecielizationCreatView.java
 * 
 * This class implements the GUI componets related to the Specielization Create page in the system.
 * 
 * Used design : MVC pattern
 * 
 */
public class SpecielizationCreatView extends javax.swing.JFrame {

    private JTextField TextFieldContent;
    private JPanel contentPanel;
    private JButton createButton;
    private JButton closeButton;
    private JLabel labelContent;
    private JPanel mainPanel;
    private SpecielizationCreatController controller;


    public SpecielizationCreatView() {
        initComponents();
        controller = new SpecielizationCreatController(this);
        createButton.addActionListener(controller);
        closeButton.addActionListener(controller);
    }

                            
    private void initComponents() {

        mainPanel = new JPanel();
        contentPanel = new JPanel();
        labelContent = new JLabel();
        TextFieldContent = new JTextField();
        createButton = new JButton();
        closeButton = new JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setVisible(true);

        mainPanel.setBackground(new java.awt.Color(51, 102, 255));
        mainPanel.setMaximumSize(new java.awt.Dimension(800, 800));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 800));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contentPanel.setForeground(new java.awt.Color(255, 255, 255));
        contentPanel.setPreferredSize(new java.awt.Dimension(600, 331));

        labelContent.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        labelContent.setText("Enter the new Specialization name please");

        createButton.setText("Create");

        closeButton.setText("Close");
  
        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextFieldContent)
                        .addComponent(labelContent, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelContent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldContent, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }                

    public javax.swing.JTextField getTextFieldContent() {
        return this.TextFieldContent;
    }

    public void setTextFieldContent(javax.swing.JTextField TextFieldContent) {
        this.TextFieldContent = TextFieldContent;
    }

    public void setContentPanel(javax.swing.JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

 

    public void setCreateButton(javax.swing.JButton createButton) {
        this.createButton = createButton;
    }


    public void setLabelContent(javax.swing.JLabel labelContent) {
        this.labelContent = labelContent;
    }

    public javax.swing.JPanel getMainPanel() {
        return this.mainPanel;
    }

    public void setMainPanel(javax.swing.JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JPanel getContentPanel() {
        return this.contentPanel;
    }


    public JButton getCreateButton() {
        return this.createButton;
    }


    public JButton getCloseButton() {
        return this.closeButton;
    }

    public void setCloseButton(JButton closeButton) {
        this.closeButton = closeButton;
    }

    public JLabel getLabelContent() {
        return this.labelContent;
    }

    
  
}
