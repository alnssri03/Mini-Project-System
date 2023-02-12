package ProjectViewDetails;

import javax.swing.*;
/*
 * ProjectViewDetailsView.java
 * 
 * This class implements the GUI componets related to the Project View details page in the system.
 * 
 * Used design : MVC pattern
 * 
 */
public class ProjectViewDetailsView extends JFrame {

        private JButton backButton;
        private JLabel commentLabel;
        private JTextArea commentsArea;
        private JPanel contentPanel;
        private JLabel labelAssignedStudentID;
        private JLabel labelProjectAvailability;
        private JLabel labelProjectContent;
        private JLabel labelProjectCreatorID;
        private JLabel labelProjectID;
        private JLabel labelProjectSpecialization;
        private JLabel labelProjectStatus;
        private JLabel labelProjectTitle;
        private JPanel mainPanel;
        private JLabel mainTitle;
        private JScrollPane scrollPane;
        private JTextField textAssignedStudentID;
        private JTextField textProjectAvailability;
        private JTextField textProjectContent;
        private JTextField textProjectCreatorID;
        private JTextField textProjectID;
        private JTextField textProjectSpecialization;
        private JTextField textProjectStatus;
        private JTextField textProjectTitle;
        private JLabel title;
        private String selectedID;
        private ProjectViewDetailsController controller;

        public ProjectViewDetailsView(String selectedID) {
                this.selectedID = selectedID;
                initComponents();
                controller = new ProjectViewDetailsController(this);
                backButton.addActionListener(controller);
        }

        private void initComponents() {

                mainPanel = new JPanel();
                mainTitle = new JLabel();
                contentPanel = new JPanel();
                title = new JLabel();
                labelProjectSpecialization = new JLabel();
                labelProjectContent = new JLabel();
                labelAssignedStudentID = new JLabel();
                labelProjectTitle = new JLabel();
                labelProjectCreatorID = new JLabel();
                labelProjectStatus = new JLabel();
                labelProjectAvailability = new JLabel();
                labelProjectID = new JLabel();
                scrollPane = new JScrollPane();
                commentsArea = new JTextArea();
                commentLabel = new JLabel();
                textProjectStatus = new JTextField();
                textProjectID = new JTextField();
                textProjectTitle = new JTextField();
                textProjectCreatorID = new JTextField();
                textAssignedStudentID = new JTextField();
                textProjectContent = new JTextField();
                textProjectAvailability = new JTextField();
                textProjectSpecialization = new JTextField();
                backButton = new JButton();

                textAssignedStudentID.setEditable(false);
                textProjectAvailability.setEditable(false);
                textProjectContent.setEditable(false);
                textProjectCreatorID.setEditable(false);
                textProjectID.setEditable(false);
                textProjectSpecialization.setEditable(false);
                textProjectStatus.setEditable(false);
                textProjectTitle.setEditable(false);

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
                title.setText("Project Details");

                labelProjectSpecialization.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
                labelProjectSpecialization.setText("Specialization");

                labelProjectContent.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
                labelProjectContent.setText("Content");

                labelAssignedStudentID.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
                labelAssignedStudentID.setText("Assigned Student ID");

                labelProjectTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
                labelProjectTitle.setText("Title");

                labelProjectCreatorID.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
                labelProjectCreatorID.setText("Creator ID");

                labelProjectStatus.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
                labelProjectStatus.setText("Status");

                labelProjectAvailability.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
                labelProjectAvailability.setText("Availability");

                labelProjectID.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
                labelProjectID.setText("Project ID");

                commentsArea.setColumns(20);
                commentsArea.setRows(5);
                scrollPane.setViewportView(commentsArea);

                commentLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
                commentLabel.setText("Comments");

                javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(contentPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                contentPanelLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(scrollPane,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                332,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(196, 196,
                                                                                                                                196))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                contentPanelLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(commentLabel,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                116,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(295, 295,
                                                                                                                                295))))
                                                .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addGroup(contentPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(contentPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(contentPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(labelProjectID,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                130,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(labelProjectStatus,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                116,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(labelProjectCreatorID,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                116,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(contentPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(contentPanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(contentPanelLayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addGroup(contentPanelLayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                125,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addGroup(contentPanelLayout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                                .addGroup(contentPanelLayout
                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                .addComponent(title)
                                                                                                                                                                                                .addGap(235, 235,
                                                                                                                                                                                                                235))
                                                                                                                                                                                .addGroup(contentPanelLayout
                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                contentPanelLayout
                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                labelProjectAvailability,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                116,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                contentPanelLayout
                                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                labelProjectContent)
                                                                                                                                                                                                                                                                .addGap(164,
                                                                                                                                                                                                                                                                                164,
                                                                                                                                                                                                                                                                                164)
                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                textProjectAvailability,
                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                116,
                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                                                                                                .addGap(14, 14, 14))))
                                                                                                                                                .addGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                contentPanelLayout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addGap(188, 188,
                                                                                                                                                                                                188)
                                                                                                                                                                                .addComponent(labelProjectTitle,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                49,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                .addGroup(contentPanelLayout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                textProjectSpecialization,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                116,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                labelProjectSpecialization))))
                                                                                                                                .addGap(26, 26, 26))
                                                                                                                .addGroup(contentPanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                                                .addComponent(textProjectContent,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                274,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(labelAssignedStudentID)
                                                                                                                                .addGap(14, 14, 14))))
                                                                                .addGroup(contentPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(contentPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(textProjectID,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                116,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(textProjectStatus,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                116,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(180, 180, 180)
                                                                                                .addComponent(textProjectTitle,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                95,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap())
                                                                                .addGroup(contentPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(textProjectCreatorID,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                116,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(textAssignedStudentID,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                116,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(34, 34, 34)))));
                contentPanelLayout.setVerticalGroup(
                                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(contentPanelLayout.createSequentialGroup()
                                                                .addGroup(contentPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(contentPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(80, 80, 80)
                                                                                                .addComponent(labelProjectSpecialization))
                                                                                .addGroup(contentPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(78, 78, 78)
                                                                                                .addComponent(labelProjectID))
                                                                                .addGroup(contentPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(title)
                                                                                                .addGap(41, 41, 41)
                                                                                                .addComponent(labelProjectTitle)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(contentPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(textProjectID,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(textProjectTitle,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(textProjectSpecialization,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(38, 38, 38)
                                                                .addGroup(contentPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(labelProjectStatus)
                                                                                .addComponent(labelProjectAvailability))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(contentPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(textProjectStatus,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(textProjectAvailability,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(labelProjectContent))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(contentPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(textProjectContent,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                107,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(labelProjectCreatorID,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(labelAssignedStudentID,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(contentPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(textProjectCreatorID,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(textAssignedStudentID,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                7, Short.MAX_VALUE)
                                                                .addComponent(commentLabel)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(scrollPane,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                180,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(29, 29, 29)));

                backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
                backButton.setText("Back");

                javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
                mainPanel.setLayout(mainPanelLayout);
                mainPanelLayout.setHorizontalGroup(
                                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(32, Short.MAX_VALUE)
                                                                .addGroup(mainPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(mainPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(backButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                82,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(107, 107, 107)
                                                                                                .addComponent(mainTitle)
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                mainPanelLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(contentPanel,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                734,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(34, 34, 34)))));
                mainPanelLayout.setVerticalGroup(
                                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addGroup(mainPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(mainPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(27, 27, 27)
                                                                                                .addComponent(mainTitle,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                62,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(mainPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(45, 45, 45)
                                                                                                .addComponent(backButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                33,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(contentPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                637,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(68, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(mainPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(mainPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));

                pack();
        }

        public JButton getBackButton() {
                return this.backButton;
        }

        public void setBackButton(JButton backButton) {
                this.backButton = backButton;
        }

        public void setTextAssignedStudentID(String text) {
                textAssignedStudentID.setText(text);
        }

        public void setTextProjectAvailability(String text) {
                textProjectAvailability.setText(text);
        }

        public void setTextProjectContent(String text) {
                textProjectContent.setText(text);
        }

        public void setTextProjectCreatorID(String text) {
                textProjectCreatorID.setText(text);
        }

        public void setTextProjectID(String text) {
                textProjectID.setText(text);
        }

        public void setTextProjectSpecialization(String text) {
                textProjectSpecialization.setText(text);
        }

        public void setTextProjectStatus(String text) {
                textProjectStatus.setText(text);
        }

        public void setTextProjectTitle(String text) {
                textProjectTitle.setText(text);
        }

        public JLabel getCommentLabel() {
                return this.commentLabel;
        }

        public void setCommentLabel(JLabel commentLabel) {
                this.commentLabel = commentLabel;
        }

        public JTextArea getCommentsArea() {
                return this.commentsArea;
        }

        public void setCommentsArea(JTextArea commentsArea) {
                this.commentsArea = commentsArea;
        }

        public JPanel getContentPanel() {
                return this.contentPanel;
        }

        public void setContentPanel(JPanel contentPanel) {
                this.contentPanel = contentPanel;
        }

        public JLabel getLabelAssignedStudentID() {
                return this.labelAssignedStudentID;
        }

        public void setLabelAssignedStudentID(JLabel labelAssignedStudentID) {
                this.labelAssignedStudentID = labelAssignedStudentID;
        }

        public JLabel getLabelProjectAvailability() {
                return this.labelProjectAvailability;
        }

        public void setLabelProjectAvailability(JLabel labelProjectAvailability) {
                this.labelProjectAvailability = labelProjectAvailability;
        }

        public JLabel getLabelProjectContent() {
                return this.labelProjectContent;
        }

        public void setLabelProjectContent(JLabel labelProjectContent) {
                this.labelProjectContent = labelProjectContent;
        }

        public JLabel getLabelProjectCreatorID() {
                return this.labelProjectCreatorID;
        }

        public void setLabelProjectCreatorID(JLabel labelProjectCreatorID) {
                this.labelProjectCreatorID = labelProjectCreatorID;
        }

        public JLabel getLabelProjectID() {
                return this.labelProjectID;
        }

        public void setLabelProjectID(JLabel labelProjectID) {
                this.labelProjectID = labelProjectID;
        }

        public JLabel getLabelProjectSpecialization() {
                return this.labelProjectSpecialization;
        }

        public void setLabelProjectSpecialization(JLabel labelProjectSpecialization) {
                this.labelProjectSpecialization = labelProjectSpecialization;
        }

        public JLabel getLabelProjectStatus() {
                return this.labelProjectStatus;
        }

        public void setLabelProjectStatus(JLabel labelProjectStatus) {
                this.labelProjectStatus = labelProjectStatus;
        }

        public JLabel getLabelProjectTitle() {
                return this.labelProjectTitle;
        }

        public void setLabelProjectTitle(JLabel labelProjectTitle) {
                this.labelProjectTitle = labelProjectTitle;
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

        public JScrollPane getScrollPane() {
                return this.scrollPane;
        }

        public void setScrollPane(JScrollPane scrollPane) {
                this.scrollPane = scrollPane;
        }

        public JTextField getTextAssignedStudentID() {
                return this.textAssignedStudentID;
        }

        public void setTextAssignedStudentID(JTextField textAssignedStudentID) {
                this.textAssignedStudentID = textAssignedStudentID;
        }

        public JTextField getTextProjectAvailability() {
                return this.textProjectAvailability;
        }

        public void setTextProjectAvailability(JTextField textProjectAvailability) {
                this.textProjectAvailability = textProjectAvailability;
        }

        public JTextField getTextProjectContent() {
                return this.textProjectContent;
        }

        public void setTextProjectContent(JTextField textProjectContent) {
                this.textProjectContent = textProjectContent;
        }

        public JTextField getTextProjectCreatorID() {
                return this.textProjectCreatorID;
        }

        public void setTextProjectCreatorID(JTextField textProjectCreatorID) {
                this.textProjectCreatorID = textProjectCreatorID;
        }

        public JTextField getTextProjectID() {
                return this.textProjectID;
        }

        public void setTextProjectID(JTextField textProjectID) {
                this.textProjectID = textProjectID;
        }

        public JTextField getTextProjectSpecialization() {
                return this.textProjectSpecialization;
        }

        public void setTextProjectSpecialization(JTextField textProjectSpecialization) {
                this.textProjectSpecialization = textProjectSpecialization;
        }

        public JTextField getTextProjectStatus() {
                return this.textProjectStatus;
        }

        public void setTextProjectStatus(JTextField textProjectStatus) {
                this.textProjectStatus = textProjectStatus;
        }

        public JTextField getTextProjectTitle() {
                return this.textProjectTitle;
        }

        public void setTextProjectTitle(JTextField textProjectTitle) {
                this.textProjectTitle = textProjectTitle;
        }

        public void setTitle(JLabel title) {
                this.title = title;
        }

        public String getSelectedID() {
                return this.selectedID;
        }

        public void setSelectedID(String selectedID) {
                this.selectedID = selectedID;
        }

}
