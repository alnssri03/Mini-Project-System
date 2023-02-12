package Objects;

public class Project {
    // Declare attributes for the Project class
    private String id;
    private String title;
    private String content;
    private String specialization;
    private String status;
    private String creatorId;
    private String availability;
    private String assignedStudentID;
  
    // Constructor for the Project class
    public Project(String id, String title, String content, String specialization, String creatorId) {
      this.id = id;
      this.title = title;
      this.content = content;
      this.specialization = specialization;
      this.creatorId = creatorId;
      this.status = "Active";
      this.availability = "Available";
      this.assignedStudentID = "null";
    }
  
    public Project(String id, String title, String content, String specialization, String status,
      String creatorId, String availability, String assignedStudentID) {
      this.id = id;
      this.title = title;
      this.content = content;
      this.specialization = specialization;
      this.status = status;
      this.creatorId = creatorId;
      this.availability = availability;
      this.assignedStudentID = assignedStudentID;
    }
  
    public String getId() {
      return this.id;
    }
  
    public void setId(String id) {
      this.id = id;
    }
  
    public String getTitle() {
      return this.title;
    }
  
    public void setTitle(String title) {
      this.title = title;
    }
  
    public String getContent() {
      return this.content;
    }
  
    public void setContent(String content) {
      this.content = content;
    }
  
    public String getSpecialization() {
      return this.specialization;
    }
  
    public void setSpecialization(String specialization) {
      this.specialization = specialization;
    }
  
    public String getAssignedStudentID() {
      return this.assignedStudentID;
    }
  
    public void setAssignedStudentID(String assignedStudentID) {
      this.assignedStudentID = assignedStudentID;
    }
  
    public String getStatus() {
      return this.status;
    }
  
    public void setStatus(String status) {
      this.status = status;
    }
  
    public String getCreatorId() {
      return this.creatorId;
    }
  
    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
  
    public String getAvailability() {
      return this.availability;
    }
  
    public void setAvailability(String availability) {
      this.availability = availability;
    }
  
  
  
    public String toCsv() {
      return "-ID: " + id
          + "-Title: " + title
          + "-Content: " + content
          + "-Specialization: " + specialization
          + "-Status: " + status
          + "-Creator ID: " + creatorId
          + "-Availability: " + availability
          + "-Assigned Student ID: " + assignedStudentID
          + "\r\n";
    }
  
  
    public static Project fromCsv(String csv) {
      String[] row = csv.split("-");
      String id = row[1].split(": ")[1];
      String title = row[2].split(": ")[1];
      String content = row[3].split(": ")[1];
      String specialization = row[4].split(": ")[1];
      String status = row[5].split(": ")[1];
      String leccreatorIdturerID = row[6].split(": ")[1];
      String availability = row[7].split(": ")[1];
      String assignedStudentID = row[8].split(": ")[1];
  
      return new Project(id, title, content, specialization, status, leccreatorIdturerID, availability, assignedStudentID);
    }
  }
  