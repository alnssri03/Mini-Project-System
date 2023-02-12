package AccountManagement;
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
 * AccountManagmentView.java
 * 
 * This class implements the GUI componets related to the account Managment page in the system.
 * 
 * Used design : MVC pattern
 * 
 */
public class AccountManagementView extends JFrame {
    
    private JButton buttonCreate;
    private JButton buttonView;
    private JButton buttonDelete;
    private JButton buttonEdit;
    private JButton buttonBack; 
    private JComboBox<String> usersType;
    private JTable usersTable;
    private JLabel labelTitle;
    private JLabel labelMainTitle;
    private JPanel mainPanel;
    private JPanel containerPanel;
    private AccountManagementController controller;

    public AccountManagementView() {
        initComponents();
        controller = new AccountManagementController(this);
        buttonCreate.addActionListener(controller);
        buttonView.addActionListener(controller);
        buttonDelete.addActionListener(controller);
        buttonEdit.addActionListener(controller);
        buttonBack.addActionListener(controller);
        usersType.addActionListener(e -> controller.updateTable((String) usersType.getSelectedItem()));

    }   

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setVisible(true);

        mainPanel = new JPanel();
        mainPanel.setBackground(new java.awt.Color(51, 102, 255));
        mainPanel.setMaximumSize(new java.awt.Dimension(800, 800));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 800));

        labelMainTitle = new JLabel();
        labelMainTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); 
        labelMainTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelMainTitle.setText("MMU Mini-Project");

        containerPanel = new JPanel();
        containerPanel.setBackground(new java.awt.Color(255, 255, 255));
        containerPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        containerPanel.setForeground(new java.awt.Color(255, 255, 255));
        containerPanel.setPreferredSize(new java.awt.Dimension(600, 331));

        labelTitle = new JLabel();
        labelTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); 
        labelTitle.setText("Account Managment");


        usersTable = new JTable();
        usersTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        usersTable.setGridColor(Color.BLACK);
        usersTable.setBackground(Color.lightGray);
        usersTable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        usersTable.setDefaultEditor(Object.class, null);
        JScrollPane scrollPane = new JScrollPane(usersTable);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(scrollPane);


        
        String[] usersTypes = { "Admin", "Student",
        "Lecturer" };
        usersType = new JComboBox<>(usersTypes);
        usersType.setSelectedIndex(0);
        add(usersType);

        buttonEdit = new JButton();
        buttonEdit.setText("Edit");

        buttonView = new JButton();
        buttonView.setText("View");

        buttonDelete = new JButton();
        buttonDelete.setText("Delete");

        buttonCreate = new JButton();
        buttonCreate.setText("Create New Account");

        buttonBack = new JButton();
        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        buttonBack.setText("Back");

  

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(labelTitle))
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(buttonView, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addComponent(buttonCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usersType, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonView, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addGap(45, 45, 45)
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usersType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addContainerGap(15, Short.MAX_VALUE))
        );


        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(labelMainTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labelMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public JButton getButtonCreate() {
        return this.buttonCreate;
    }

    public void setButtonCreate(JButton buttonCreate) {
        this.buttonCreate = buttonCreate;
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

    public JButton getButtonEdit() {
        return this.buttonEdit;
    }

    public void setButtonEdit(JButton buttonEdit) {
        this.buttonEdit = buttonEdit;
    }

    public JButton getButtonBack() {
        return this.buttonBack;
    }

    public void setButtonBack(JButton buttonBack) {
        this.buttonBack = buttonBack;
    }

    public JComboBox<String> getUsersType() {
        return this.usersType;
    }

    public void setUsersType(JComboBox<String> usersType) {
        this.usersType = usersType;
    }

    public JTable getUsersTable() {
        return this.usersTable;
    }

    public void setUsersTable(JTable usersTable) {
        this.usersTable = usersTable;
    }

    public JLabel getLabelTitle() {
        return this.labelTitle;
    }

    public void setLabelTitle(JLabel labelTitle) {
        this.labelTitle = labelTitle;
    }

    public JLabel getLabelMainTitle() {
        return this.labelMainTitle;
    }

    public void setLabelMainTitle(JLabel labelMainTitle) {
        this.labelMainTitle = labelMainTitle;
    }

    public JPanel getMainPanel() {
        return this.mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JPanel getContainerPanel() {
        return this.containerPanel;
    }

    public void setContainerPanel(JPanel containerPanel) {
        this.containerPanel = containerPanel;
    }
       
}
