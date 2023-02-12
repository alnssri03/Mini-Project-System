/**
 * Initializer.java
 * 
 * 
 * The Initializer class this class is responsible for handling 
 * the arraylists of the data in the system and responsible of reading and writing the data from/to the files 
 * 
 * used design :  singleton design pattern to make sure there is only one instance of the Initializer class in the system
 * 
 */

package Model;

import java.util.ArrayList;

import Objects.Admin;
import Objects.Lecturer;
import Objects.Project;
import Objects.Specialization;
import Objects.Student;
import Objects.Comment;

import java.io.*;

public class Initializer {
    private static Initializer instance;
    private ArrayList<Admin> adminsList;
    private ArrayList<Lecturer> lecturersList;
    private ArrayList<Student> studentsList;
    private ArrayList<Project> projectsList;
    private ArrayList<Specialization> specializationList;
    private ArrayList<Comment> commentsList;

    private FileReader AdminFile;
    private FileReader StudentFile;
    private FileReader LecturerFile;
    private FileReader ProjectFile;
    private FileReader specializationFile;
    private FileReader commentFile;

    private Initializer() {
        adminsList = new ArrayList<>();
        lecturersList = new ArrayList<>();
        studentsList = new ArrayList<>();
        projectsList = new ArrayList<>();
        specializationList = new ArrayList<>();
        commentsList = new ArrayList<>();

        try {
            AdminFile = new FileReader("Admins.csv");
            StudentFile = new FileReader("Students.csv");
            LecturerFile = new FileReader("Lecturers.csv");
            ProjectFile = new FileReader("Projects.csv");
            specializationFile = new FileReader("Specializations.csv");
            commentFile = new FileReader("Comments.csv");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        loadAllAdmins();
        loadAllStudents();
        loadAllLecturers();
        loadAllProjects();
        loadAllSpecialization();
        loadAllComments();

    }

    public static Initializer getInstance() {
        if (instance == null) {
            instance = new Initializer();
        }
        return instance;
    }

    public ArrayList<Admin> getadminsList() {
        return adminsList;
    }

    public ArrayList<Lecturer> getlecturersList() {
        return lecturersList;
    }

    public ArrayList<Student> getstudentsList() {
        return studentsList;
    }

    public ArrayList<Project> getProjectsList() {
        return projectsList;
    }

    public ArrayList<Specialization> getspecializationList() {
        return specializationList;
    }

    public ArrayList<Comment> getCommentList() {
        return commentsList;
    }


    public void insertSpecialization(Specialization specialization) { // write to file.
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Specializations.csv", true))) {
            bufwriter.write(specialization.toCsv());
            specializationList.add(specialization);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void insertStudent(Student student) { 
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Students.csv", true))) {
            bufwriter.write(student.toCsv());
            studentsList.add(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void insertComment(Comment comment) { 
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Comments.csv", true))) {
            bufwriter.write(comment.toCsv());
            commentsList.add(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public void insertLecturer(Lecturer lecturer) { // write to file.
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Lecturers.csv", true))) {
            bufwriter.write(lecturer.toCsv());
            lecturersList.add(lecturer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    public void insertProject(Project project) { 
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Projects.csv", true))) {
            bufwriter.write(project.toCsv());
            projectsList.add(project);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void insertAdmin(Admin admin) { 
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Admins.csv", true))) {
            bufwriter.write(admin.toCsv());
            adminsList.add(admin);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadAllSpecialization() {
        specializationList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("Specializations.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                specializationList.add(Specialization.fromCsv(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadAllComments() {
        commentsList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("Comments.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                commentsList.add(Comment.fromCsv(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void loadAllAdmins() {
        adminsList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("Admins.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                adminsList.add(Admin.fromCsv(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void loadAllStudents() {
        studentsList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("Students.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                studentsList.add(Student.fromCsv(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void loadAllLecturers() {
        lecturersList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("Lecturers.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lecturersList.add(Lecturer.fromCsv(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadAllProjects() {
        projectsList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("Projects.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                projectsList.add(Project.fromCsv(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Student getStudent(String username, String password) {
        Student student = null;
        for (Student value : studentsList) {
            if (value.getUserName().equals(username) && value.getPassword().equals(password)) {
                student = value;
            }
        }
        return student;
    }

    public Lecturer getLecturer(String username, String password) {
        Lecturer lecturer = null;
        for (Lecturer value : lecturersList) {
            if (value.getUserName().equals(username) && value.getPassword().equals(password)) {
                lecturer = value;
            }
        }
        return lecturer;
    }

    public void updateSpecialization(int index, Specialization specialization) {
        specializationList.remove(index);
        specializationList.add(index, specialization);
        clearFile("Specializations.csv");
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Specializations.csv", true))) {
            for (int i = 0; i < specializationList.size(); i++) {
                bufwriter.write(specializationList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateProjectStatus(int index, String status) {
        projectsList.get(index).setStatus(status);
        clearFile("Projects.csv");
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Projects.csv", true))) {
            for (int i = 0; i < projectsList.size(); i++) {
                bufwriter.write(projectsList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateAdmin(int index, Admin admin) {
        adminsList.remove(index);
        adminsList.add(index, admin);
        clearFile("Admins.csv");
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Admins.csv", true))) {
            for (int i = 0; i < adminsList.size(); i++) {
                bufwriter.write(adminsList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateProject(int index, Project project) {
        projectsList.remove(index);
        projectsList.add(index, project);
        clearFile("Projects.csv");
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Projects.csv", true))) {
            for (int i = 0; i < projectsList.size(); i++) {
                bufwriter.write(projectsList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int index, Student student) {
        studentsList.remove(index);
        studentsList.add(index, student);
        clearFile("Students.csv");
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Students.csv", true))) {
            for (int i = 0; i < studentsList.size(); i++) {
                bufwriter.write(studentsList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateLecturer(int index, Lecturer lecturer) {
        lecturersList.remove(index);
        lecturersList.add(index, lecturer);
        clearFile("Lecturers.csv");
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Lecturers.csv", true))) {
            for (int i = 0; i < lecturersList.size(); i++) {
                bufwriter.write(lecturersList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteSpecialization(int index) {
        specializationList.remove(index);
        clearFile("Specializations.csv");
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Specializations.csv", true))) {
            for (int i = 0; i < specializationList.size(); i++) {
                bufwriter.write(specializationList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int index) {
        studentsList.remove(index);
        clearFile("Students.csv");
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Students.csv", true))) {
            for (int i = 0; i < studentsList.size(); i++) {
                bufwriter.write(studentsList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteAdmin(int index) {
        adminsList.remove(index);
        clearFile("Admins.csv");
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Admins.csv", true))) {
            for (int i = 0; i < adminsList.size(); i++) {
                bufwriter.write(adminsList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteProject(int index) {
        projectsList.remove(index);
        clearFile("Projects.csv");
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Projects.csv", true))) {
            for (int i = 0; i < projectsList.size(); i++) {
                bufwriter.write(projectsList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteLecturer(int index) {
        lecturersList.remove(index);
        clearFile("Lecturers.csv");
        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Lecturers.csv", true))) {
            for (int i = 0; i < lecturersList.size(); i++) {
                bufwriter.write(lecturersList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clearFile(String filePath) {
        try {
            File file = new File(filePath);
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void assignStudent(int studentIndex, int projectIndex) {
        getstudentsList().get(studentIndex).setAvailability("Not Available");
        getProjectsList().get(projectIndex).setAvailability("Not Available");

        getstudentsList().get(studentIndex).setAssignedProjectID(getProjectsList().get(projectIndex).getId());
        getProjectsList().get(projectIndex).setAssignedStudentID(getstudentsList().get(studentIndex).getId());
        clearFile("Projects.csv");
        clearFile("students.csv");

        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Projects.csv", true));
                BufferedWriter studentBufwriter = new BufferedWriter(new FileWriter("Students.csv", true))) {
            for (int i = 0; i < projectsList.size(); i++) {
                bufwriter.write(projectsList.get(i).toCsv());
            }

            for (int i = 0; i < studentsList.size(); i++) {
                studentBufwriter.write(studentsList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void UnAssignStudent(int studentIndex, int projectIndex) {
        getstudentsList().get(studentIndex).setAvailability("Available");
        getProjectsList().get(projectIndex).setAvailability("Available");
        getstudentsList().get(studentIndex).setAssignedProjectID("null");
        getProjectsList().get(projectIndex).setAssignedStudentID("null");
        clearFile("Projects.csv");
        clearFile("students.csv");

        try (BufferedWriter bufwriter = new BufferedWriter(new FileWriter("Projects.csv", true));
                BufferedWriter studentBufwriter = new BufferedWriter(new FileWriter("Students.csv", true))) {
            for (int i = 0; i < projectsList.size(); i++) {
                bufwriter.write(projectsList.get(i).toCsv());
            }

            for (int i = 0; i < studentsList.size(); i++) {
                studentBufwriter.write(studentsList.get(i).toCsv());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}