package SpecielizationManagment;

import javax.swing.JFrame;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;


import java.awt.Color;
/*
 * SpecielizationManagmentView.java
 * 
 * This class implements the GUI componets related to the Specielization Managment page in the system.
 * 
 * Used design : MVC pattern
 * 
 */
public class SpecielizationManagementView extends JFrame {
    
    private JButton buttonCreat;
    private JButton buttonEdit;
    private JTable spTable;
    private JButton buttonDelete;
    private JButton buttonBack;
    private JPanel mainPanel;
    private JPanel contentPanel;
    private JLabel title;
    private JLabel mainTitle;
    private JScrollPane scrollPane;
    SpecielizationManagementController controller;



    public SpecielizationManagementView() {
        initComponents();
         controller = new SpecielizationManagementController(this);
         buttonBack.addActionListener(controller);
         buttonCreat.addActionListener(controller);
         buttonDelete.addActionListener(controller);
         buttonEdit.addActionListener(controller);
    }                       
    private void initComponents() {

         mainPanel = new javax.swing.JPanel();
         mainTitle = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
         spTable = new javax.swing.JTable();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonCreat = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();

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

        title.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); 
        title.setText("Specielization Managment");

        spTable = new JTable();
        spTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        spTable.setGridColor(Color.BLACK);
        spTable.setBackground(Color.lightGray);
        spTable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        spTable.setBounds(100, 300, 570, 370);
        spTable.setDefaultEditor(Object.class, null);
        scrollPane = new JScrollPane(spTable);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        scrollPane.setBounds(100, 300, 570, 370);

        buttonEdit.setText("Edit");
        buttonDelete.setText("Delete");
        buttonCreat.setText("Create New ");
       

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(title))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCreat)
                            .addComponent( scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(52, 52, 52)
                .addComponent(buttonCreat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent( scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        buttonBack.setText("Back");
       

        javax.swing.GroupLayout  mainPanelLayout = new javax.swing.GroupLayout( mainPanel);
         mainPanel.setLayout( mainPanelLayout);
         mainPanelLayout.setHorizontalGroup(
             mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,  mainPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup( mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup( mainPanelLayout.createSequentialGroup()
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent( mainTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,  mainPanelLayout.createSequentialGroup()
                        .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
         mainPanelLayout.setVerticalGroup(
             mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup( mainPanelLayout.createSequentialGroup()
                .addGroup( mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup( mainPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent( mainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup( mainPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent( mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent( mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }     

    public JButton getButtonCreat() {
        return this.buttonCreat;
    }

    public void setButtonCreat(JButton buttonCreat) {
        this.buttonCreat = buttonCreat;
    }

    public JButton getButtonEdit() {
        return this.buttonEdit;
    }

    public void setButtonEdit(JButton buttonEdit) {
        this.buttonEdit = buttonEdit;
    }

    public JTable getSpTable() {
        return this.spTable;
    }

    public void setSpTable(JTable spTable) {
        this.spTable = spTable;
    }


    public JButton getButtonDelete() {
        return this.buttonDelete;
    }

    public void setButtonDelete(JButton buttonDelete) {
        this.buttonDelete = buttonDelete;
    }

  

    public JButton getButtonBack() {
        return this.buttonBack;
    }

    public void setButtonBack(JButton buttonBack) {
        this.buttonBack = buttonBack;
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

    public void setTitle(JLabel title) {
        this.title = title;
    }

    public JLabel getMainTitle() {
        return this.mainTitle;
    }

    public void setMainTitle(JLabel mainTitle) {
        this.mainTitle = mainTitle;
    }

    public JScrollPane getScrollPane() {
        return this.scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

}
