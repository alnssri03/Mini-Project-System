package Objects;

public class Student extends User {
    // Declare additional attributes for the Student subclass
    private String specialization;
    private String availability;
    private String assignedProjectID;
  
    public Student(String id, String firstName, String lastName, String userName, String password, String phoneNumber,
    String specialization, String availability, String assignedProjectID) {
      super(id, firstName, lastName, userName, password, phoneNumber);
      this.availability = availability;
      this.assignedProjectID = assignedProjectID;
      this.specialization = specialization;
    }
  
    public Student() {
    }
  
    public String getSpecialization() {
      return this.specialization;
    }
  
    public void setSpecialization(String specialization) {
      this.specialization = specialization;
    }
  
  
    public String getAvailability() {
      return this.availability;
    }
  
    public void setAvailability(String availability) {
      this.availability = availability;
    }
  
    public String getAssignedProjectID() {
      return this.assignedProjectID;
    }
  
    public void setAssignedProjectID(String assignedProjectID) {
      this.assignedProjectID = assignedProjectID;
    }
  
    @Override
    public String toString() {
      return "{" +
          " specialization='" + getSpecialization() + "'" +
          ", availability='" + getAvailability() + "'" +
          ", assignedProject='" + getAssignedProjectID() + "'" +
          "}";
    }
  
    /**
     * @return String to generate the all information about the student to be stored
     *         in a file.
     */
    public String toCsv() {
      return "-ID: " + super.getId()
          + "-First Name: " + super.getFirstName()
          + "-Last Name: " + super.getLastName()
          + "-Username: " + super.getUserName()
          + "-Password: " + super.getPassword()
          + "-Phone: " + super.getPhoneNumber()
          + "-Specialization: " + this.specialization
          + "-Availability: " + this.availability
          + "-Assigned Project ID: " + this.assignedProjectID
          + "\r\n";
    }
  
    public static Student fromCsv(String csv) {
      String[] row = csv.split("-");
      String id = row[1].split(": ")[1];
      String firstName = row[2].split(": ")[1];
      String lastName = row[3].split(": ")[1];
      String userName = row[4].split(": ")[1];
      String password = row[5].split(": ")[1];
      String phoneNumber = row[6].split(": ")[1];
      String specialization = row[7].split(": ")[1];
      String availability = row[8].split(": ")[1];
      String assignedProjectID = row[9].split(": ")[1];
  
      return new Student(id, firstName, lastName, userName, password, phoneNumber, specialization, availability,
          assignedProjectID);
    }
  
  }
