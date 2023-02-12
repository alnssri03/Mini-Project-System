package Objects;

public class Lecturer extends User {
    // Declare additional attributes for the Lecturer subclass
    private String specialization;
  
    public Lecturer(String id, String firstName, String lastName, String userName, String password, String phoneNumber,
       String specialization) {
      super(id, firstName, lastName, userName, password, phoneNumber);
      this.specialization = specialization;
    }
  
    public Lecturer() {
    }
  
    public Lecturer(String specialization) {
      this.specialization = specialization;
    }
  
    public String getSpecialization() {
      return this.specialization;
    }
  
    public void setSpecialization(String specialization) {
      this.specialization = specialization;
    }
  
    public Lecturer specialization(String specialization) {
      setSpecialization(specialization);
      return this;
    }
  
    @Override
    public String toString() {
      return "{" +
          " specialization='" + getSpecialization() + "'" +
          "}";
    }
  
    /**
     * @return String to generate the all information about the lecturer to be
     *         stored in a file.
     */
    // Method to convert object of Lecturer to CSV format
    public String toCsv() {
      return "-ID: " + super.getId()
          + "-First Name: " + super.getFirstName()
          + "-Last Name: " + super.getLastName()
          + "-Username: " + super.getUserName()
          + "-Password: " + super.getPassword()
          + "-Phone: " + super.getPhoneNumber()
          + "-Specialization: " + this.specialization
          + "\r\n";
    }
  
    // Method to convert a CSV formatted string to object of Lecturer
    public static Lecturer fromCsv(String csv) {
      String[] row = csv.split("-");
      String id = row[1].split(": ")[1];
      String firstName = row[2].split(": ")[1];
      String lastName = row[3].split(": ")[1];
      String userName = row[4].split(": ")[1];
      String password = row[5].split(": ")[1];
      String phoneNumber = row[6].split(": ")[1];
      String specialization = row[7].split(": ")[1];
  
      return new Lecturer(id, firstName, lastName, userName, password, phoneNumber, specialization);
    }
  }