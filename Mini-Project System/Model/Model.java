/**
 * Model.java
 * 
 * 
 * The model class in the MVC (Model-View-Controller) pattern this class is responsible
 * for dealing with the data in the system such as projects , users , specialization and validate the data 
 * 
 * 
 * used design : MVC pattern , and singleton design pattern to make sure there is only one instance of the model class in the system
 * 
 */

package Model;
import java.util.ArrayList;
import Objects.Admin;
import Objects.Comment;
import Objects.Lecturer;
import Objects.Project;
import Objects.Specialization;
import Objects.Student;

public class Model {
    private Initializer singleton;
    private String userID;
    private static Model instance;

    public Model() {
        singleton = Initializer.getInstance();
    }

    public static Model getModel() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public void addProject(String title, String content, String specialization,
            String active, String lecturerID, String isassigned, String assignedStudentID) {
        String id = getLastProjectId();
        Project p = new Project(id, title, content, specialization, active, lecturerID, isassigned, assignedStudentID);
        singleton.insertProject(p);
    }

    public Admin getAdmin(String username, String password) {
        Admin admin = null;
        for (Admin value : Initializer.getInstance().getadminsList()) {
            if (value.getUserName().equals(username) && value.getPassword().equals(password)) {
                admin = value;
            }
        }
        return admin;
    }

    public Student getStudent(String username, String password) {
        Student student = null;
        for (Student value : Initializer.getInstance().getstudentsList()) {
            if (value.getUserName().equals(username) && value.getPassword().equals(password)) {
                student = value;
            }
        }
        return student;
    }

    public Lecturer getLecturer(String username, String password) {
        Lecturer lecturer = null;
        for (Lecturer value : Initializer.getInstance().getlecturersList()) {
            if (value.getUserName().equals(username) && value.getPassword().equals(password)) {
                lecturer = value;
            }
        }
        return lecturer;
    }

    public String getUserType(String id) {
        String type = "";
        for (Admin value : Initializer.getInstance().getadminsList()) {
            if (value.getId().equals(id))
                type = "Admin";
        }
        for (Student value : Initializer.getInstance().getstudentsList()) {
            if (value.getId().equals(id))
                type = "Student";
        }
        for (Lecturer value : Initializer.getInstance().getlecturersList()) {
            if (value.getId().equals(id))
                type = "Lecturer";
        }
        return type;
    }


    public int getAdminIndexById(String id) {
        int index = -1;
        for (int i = 0; i < getallAdmins().size(); i++) {
            if (getallAdmins().get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int getStudentIndexById(String id) {
        int index = -1;
        for (int i = 0; i < getallStudents().size(); i++) {
            if (getallStudents().get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int getLecturerIndexById(String id) {
        int index = -1;
        for (int i = 0; i < getallLectrurs().size(); i++) {
            if (getallLectrurs().get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Admin getAdminByUsername(String Username) {
        Admin admin = null;
        for (Admin value : Initializer.getInstance().getadminsList()) {
            if (value.getUserName().equals(Username)) {
                admin = value;
            }
        }
        return admin;
    }

    public Student getStudentByUsername(String Username) {
        Student student = null;
        for (Student value : Initializer.getInstance().getstudentsList()) {
            if (value.getUserName().equals(Username)) {
                student = value;
            }
        }
        return student;
    }

    public int getprojectIndexById(String id) {
        int index = -1;
        for (int i = 0; i < getallProjects().size(); i++) {
            if (getallProjects().get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Lecturer getLecturerByUsername(String Username) {
        Lecturer lecturer = null;
        for (Lecturer value : Initializer.getInstance().getlecturersList()) {
            if (value.getUserName().equals(Username)) {
                lecturer = value;
            }
        }
        return lecturer;
    }

    public Admin getAdminById() {
        Admin admin = null;
        for (Admin value : Initializer.getInstance().getadminsList()) {
            if (value.getId().equals(userID)) {
                admin = value;
            }
        }
        return admin;
    }

    public Student getStudentById() {
        Student student = null;
        for (Student value : Initializer.getInstance().getstudentsList()) {
            if (value.getId().equals(userID)) {
                student = value;
            }
        }
        return student;
    }

    public Lecturer getLecturerById() {
        Lecturer lecturer = null;
        for (Lecturer value : Initializer.getInstance().getlecturersList()) {
            if (value.getId().equals(userID)) {
                lecturer = value;
            }
        }
        return lecturer;
    }

    public Project getProjectById(String id) {
        Project project = null;
        for (Project value : Initializer.getInstance().getProjectsList()) {
            if (value.getId().equals(id)) {
                project = value;
            }
        }
        return project;
    }

    public void assignStudent(int studentIndex, int projectIndex) {
        singleton.assignStudent(studentIndex, projectIndex);
    }

    public void unAssignStudent(int projectIndex) {
        int studentIndex = getStudentIndexById(getallProjects().get(projectIndex).getAssignedStudentID());
        singleton.UnAssignStudent(studentIndex, projectIndex);
    }

    public void activeProject(int index) {
        String status = "Active";
        singleton.updateProjectStatus(index, status);
    }

    public void hideProject(int index) {
        String status = "Hidden";
        singleton.updateProjectStatus(index, status);
    }

    public void addComment(String username, String text, String projectId) {
        Comment comment = new Comment(username, text, projectId);
        singleton.insertComment(comment);
    }

    public void addStudentAccount(String firstName, String lastName, String username,
            String password, String phoneNumber, String specialization, String isAssigned, String assignedProjectID) {
        String id = getLastStudentId();
        Student s = new Student(id, firstName, lastName, username, password, phoneNumber, specialization, isAssigned,
                assignedProjectID);
        singleton.insertStudent(s);
    }

    public void addLecturerAccount(String firstName, String lastName, String username,
            String password, String phoneNumber, String specialization) {
        String id = getLastLectrurId();
        Lecturer s = new Lecturer(id, firstName, lastName, username, password, phoneNumber, specialization);
        singleton.insertLecturer(s);
    }

    public void addAdminAccount(String firstName, String lastName, String username,
            String password, String phoneNumber) {
        String id = getLastAdminId();
        Admin s = new Admin(id, firstName, lastName, username, password, phoneNumber);
        singleton.insertAdmin(s);
    }

    public void editSpecialization(int index, String text) {
        Specialization s = new Specialization(text);
        singleton.updateSpecialization(index, s);
    }

    public void editAdminAccount(String id,
            String firstName, String lastName, String username, String password, String phone) {

        int index = getAdminIndexById(id);
        Admin admin = new Admin(id, firstName, lastName, username, password, phone);
        singleton.updateAdmin(index, admin);
    }

    public void editPrject(String id, String title, String content, String specialization,
            String Status, String creatorId, String availability, String assignedStudentID) {

        Project project = new Project(id, title, content, specialization, Status,
                creatorId, availability,
                assignedStudentID);
        int index = getprojectIndexById(id);
        singleton.updateProject(index, project);
    }

    public void editStudentAccount(String id,
            String firstName, String lastName, String username, String password, String phone,
            String Specialization, String isAssigned, String assignedProjectID) {
        Student student = new Student(id, firstName, lastName, username, password, phone, Specialization, isAssigned,
                assignedProjectID);
        int index = getStudentIndexById(id);
        singleton.updateStudent(index, student);
    }

    public void editLecturerAccount(String id,
            String firstName, String lastName, String username, String password, String phone, String specialization) {
        Lecturer lecturer = new Lecturer(id, firstName, lastName, username, password, phone, specialization);
        int index = getLecturerIndexById(id);
        singleton.updateLecturer(index, lecturer);
    }

    public void deleteSpecialization(int index) {
        singleton.deleteSpecialization(index);
    }

    public void deleteStudent(int index) {
        singleton.deleteStudent(index);
    }

    public void deleteLecturer(int index) {
        singleton.deleteLecturer(index);
    }

    public void deleteAdmin(int index) {
        singleton.deleteAdmin(index);
    }

    public void deleteProject(int index) {
        singleton.deleteProject(index);
    }

    public void addSpecialization(String text) {
        Specialization s = new Specialization(text);
        singleton.insertSpecialization(s);
    }

    public ArrayList<Admin> getallAdmins() {
        ArrayList<Admin> admins = Initializer.getInstance().getadminsList();
        return admins;
    }

    public ArrayList<Student> getallStudents() {
        ArrayList<Student> student = Initializer.getInstance().getstudentsList();
        return student;
    }

    public ArrayList<Lecturer> getallLectrurs() {
        ArrayList<Lecturer> lecturer = Initializer.getInstance().getlecturersList();
        return lecturer;
    }

    public ArrayList<Specialization> getallSpecializations() {
        ArrayList<Specialization> specialization = Initializer.getInstance().getspecializationList();
        return specialization;
    }

    public ArrayList<Project> getallProjects() {
        ArrayList<Project> projects = Initializer.getInstance().getProjectsList();
        return projects;

    }

    public ArrayList<Comment> getallComments() {
        ArrayList<Comment> comments = Initializer.getInstance().getCommentList();
        return comments;

    }

    public int numberOfPeopleSp(String sp) {
        int count = 0;
        for (int i = 0; i < getallStudents().size(); i++) {
            if (getallStudents().get(i).getSpecialization().equals(sp)) {
                count++;
            }
        }
        return count;
    }

    public int numberOfProjects() {
        int count = 0;
        for (int i = 0; i < getallProjects().size(); i++) {
            if (getallProjects().get(i).getCreatorId().equals(userID)) {
                count++;
            }
        }
        return count;
    }

    public int numberOfSpProjects(String sp) {
        int count = 0;
        for (int i = 0; i < getallProjects().size(); i++) {
            if (getallProjects().get(i).getSpecialization().equals(sp)) {
                count++;
            }
        }
        return count;
    }

    public boolean userValidation(String username) {
        boolean found = false;
        for (Admin value : Initializer.getInstance().getadminsList()) {
            if (value.getUserName().equals(username)) {
                found = true;
                break;
            }
        }
        for (Student value : Initializer.getInstance().getstudentsList()) {
            if (value.getUserName().equals(username)) {
                found = true;
                break;
            }
        }
        for (Student value : Initializer.getInstance().getstudentsList()) {
            if (value.getUserName().equals(username)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public boolean spValidation(String text) {
        boolean found = false;
        for (Specialization value : Initializer.getInstance().getspecializationList()) {
            if (value.getSpecialization().equals(text)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public String[] getSpCombox() {
        String[] usersSpecialization = new String[getallSpecializations().size()];
        for (int i = 0; i < getallSpecializations().size(); i++) {
            usersSpecialization[i] = getallSpecializations().get(i).getSpecialization();
        }
        return usersSpecialization;
    }

    public Object[][] dataAdmins() {
        Object[][] data = new Object[getallAdmins().size()][3];
        for (int i = 0; i < getallAdmins().size(); i++) {
            data[i][0] = getallAdmins().get(i).getId();
            data[i][1] = getallAdmins().get(i).getFirstName();
            data[i][2] = getallAdmins().get(i).getUserName();
        }
        return data;
    }

    public Object[][] dataStudents() {
        Object[][] data = new Object[getallStudents().size()][5];
        for (int i = 0; i < getallStudents().size(); i++) {
            data[i][0] = getallStudents().get(i).getId();
            data[i][1] = getallStudents().get(i).getFirstName();
            data[i][2] = getallStudents().get(i).getUserName();
            data[i][3] = getallStudents().get(i).getSpecialization();
            data[i][4] = getallStudents().get(i).getAvailability();

        }
        return data;
    }

    public Object[][] dataLectrures() {
        Object[][] data = new Object[getallLectrurs().size()][4];
        for (int i = 0; i < getallLectrurs().size(); i++) {
            data[i][0] = getallLectrurs().get(i).getId();
            data[i][1] = getallLectrurs().get(i).getFirstName();
            data[i][2] = getallLectrurs().get(i).getUserName();
            data[i][3] = getallLectrurs().get(i).getSpecialization();

        }
        return data;
    }

    public Object[][] dataSp() {
        Object[][] data = new Object[getallSpecializations().size()][1];
        for (int i = 0; i < getallSpecializations().size(); i++) {
            data[i][0] = getallSpecializations().get(i).getSpecialization();
        }
        return data;
    }

    public Object[][] dataProjects() {
        Object[][] data = new Object[getallProjects().size()][5];
        for (int i = 0; i < getallProjects().size(); i++) {
            data[i][0] = getallProjects().get(i).getId();
            data[i][1] = getallProjects().get(i).getTitle();
            data[i][2] = getallProjects().get(i).getSpecialization();
            data[i][3] = getallProjects().get(i).getCreatorId();
            data[i][4] = getallProjects().get(i).getStatus();
        }
        return data;
    }

    public Object[][] dataStudentAssign(String sp) {
        Object[][] data = new Object[numberOfPeopleSp(sp)][3];
        int j = 0;
        for (int i = 0; i < getallStudents().size(); i++) {
            if (getallStudents().get(i).getSpecialization().equals(sp)
                    && getallStudents().get(i).getAvailability().equals("Available")) {
                data[j][0] = getallStudents().get(i).getId();
                data[j][1] = getallStudents().get(i).getFirstName();
                data[j][2] = getallStudents().get(i).getUserName();
                j++;
            }
        }
        return data;
    }

    public Object[][] dataUnAssignedProjects() {
        Object[][] data = new Object[getallProjects().size()][5];
        int j = 0;
        for (int i = 0; i < getallProjects().size(); i++) {
            if (getallProjects().get(i).getAvailability().equals("Available")) {
                data[j][0] = getallProjects().get(i).getId();
                data[j][1] = getallProjects().get(i).getTitle();
                data[j][2] = getallProjects().get(i).getSpecialization();
                data[j][3] = getallProjects().get(i).getCreatorId();
                data[j][4] = getallProjects().get(i).getStatus();
                j++;
            }
        }
        return data;
    }

    public Object[][] dataAssignedProjects() {
        Object[][] data = new Object[getallProjects().size()][5];
        int j = 0;
        for (int i = 0; i < getallProjects().size(); i++) {
            if (getallProjects().get(i).getAvailability().equals("Not Available")) {
                data[j][0] = getallProjects().get(i).getId();
                data[j][1] = getallProjects().get(i).getTitle();
                data[j][2] = getallProjects().get(i).getSpecialization();
                data[j][3] = getallProjects().get(i).getCreatorId();
                data[j][4] = getallProjects().get(i).getStatus();
                j++;
            }
        }
        return data;
    }

    public Object[][] dataAactiveProjects() {
        Object[][] data = new Object[getallProjects().size()][5];
        int j = 0;
        for (int i = 0; i < getallProjects().size(); i++) {
            if (getallProjects().get(i).getStatus().equals("Active")) {
                data[j][0] = getallProjects().get(i).getId();
                data[j][1] = getallProjects().get(i).getTitle();
                data[j][2] = getallProjects().get(i).getSpecialization();
                data[j][3] = getallProjects().get(i).getCreatorId();
                data[j][4] = getallProjects().get(i).getStatus();
                j++;
            }
        }
        return data;
    }

    public Object[][] dataInAactiveProjects() {
        Object[][] data = new Object[getallProjects().size()][5];
        int j = 0;
        for (int i = 0; i < getallProjects().size(); i++) {
            if (getallProjects().get(i).getStatus().equals("Hidden")) {
                data[j][0] = getallProjects().get(i).getId();
                data[j][1] = getallProjects().get(i).getTitle();
                data[j][2] = getallProjects().get(i).getSpecialization();
                data[j][3] = getallProjects().get(i).getCreatorId();
                data[j][4] = getallProjects().get(i).getStatus();
                j++;
            }
        }
        return data;
    }

    public Object[][] dataProjectsStudentPanel() {
        String sp = getStudentById().getSpecialization();
        Object[][] data = new Object[numberOfSpProjects(sp)][5];
        int j = 0;
        for (int i = 0; i < getallProjects().size(); i++) {
            if (getallProjects().get(i).getSpecialization().equals(sp) &&
                    getallProjects().get(i).getStatus().equals("Active") &&
                    getallProjects().get(i).getAvailability().equals("Available")) {
                data[j][0] = getallProjects().get(i).getId();
                data[j][1] = getallProjects().get(i).getTitle();
                data[j][2] = getallProjects().get(i).getSpecialization();
                data[j][3] = getallProjects().get(i).getCreatorId();
                data[j][4] = getallProjects().get(i).getStatus();
                j++;
            }

        }
        return data;
    }
    
    public Object[][] dataProjectsOfUserID() {
        Object[][] data = new Object[numberOfProjects()][5];
        int j = 0;
        for (int i = 0; i < getallProjects().size(); i++) {
            if (getallProjects().get(i).getCreatorId().equals(getUserID())) {
                data[j][0] = getallProjects().get(i).getId();
                data[j][1] = getallProjects().get(i).getTitle();
                data[j][2] = getallProjects().get(i).getSpecialization();
                data[j][3] = getallProjects().get(i).getCreatorId();
                data[j][4] = getallProjects().get(i).getStatus();
                j++;
            }
        }
        return data;
    }

    public String getLastAdminId() {
        int index = getallAdmins().size() + 1;
        String userId = "Admin" + index;
        return userId;
    }

    public String getLastStudentId() {
        int index = getallStudents().size() + 1;
        String userId = "Student" + index;
        return userId;
    }

    public String getLastLectrurId() {
        int index = getallLectrurs().size() + 1;
        String userId = "Lecturer" + index;
        return userId;
    }

    public String getLastProjectId() {
        int index = getallProjects().size() + 1;
        String ProjectID = "Project" + index;
        return ProjectID;
    }

    public String getUserID() {
        return this.userID;
    }

    public void setUserIDAdmin(String username, String password) {
        this.userID = getAdmin(username, password).getId();
    }

    public void setUserIDStudent(String username, String password) {
        this.userID = getStudent(username, password).getId();
    }

    public void setUserIDLecturer(String username, String password) {
        this.userID = getLecturer(username, password).getId();
    }

}
