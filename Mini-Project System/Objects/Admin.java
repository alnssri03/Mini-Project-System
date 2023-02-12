package Objects;

public class Admin extends User {
      // Constructor for the Admin subclass
      public Admin(String id, String firstName, String lastName, String userName, String password, String phoneNumber) {
        super(id, firstName, lastName, userName, password, phoneNumber);
      }
  
       /**
     * @return String to generate the all information about the admin to be stored in a file.
     */
  
  public String toCsv() {
    return "-ID: " + super.getId()
            + "-First Name: " + super.getFirstName()
            + "-Last Name: " + super.getLastName()
            + "-Username: " + super.getUserName()
            + "-Password: " + super.getPassword()
            + "-Phone: " + super.getPhoneNumber()
            + "\r\n";
  }
  
    /**
     * @return object of Admin, using this method is going to get a line from a file and filter it out each
     *         to get each information separated
     * @param csv the whole information in form of string
     */
    public static Admin fromCsv(String csv) {
      String[] row = csv.split("-");
      String id = row[1].split(": ")[1];
      String firstName = row[2].split(": ")[1];
      String lastName = row[3].split(": ")[1];
      String userName = row[4].split(": ")[1];
      String password = row[5].split(": ")[1];
      String phoneNumber = row[6].split(": ")[1];
  
      return new Admin(id, firstName, lastName, userName, password, phoneNumber);
      }
  
      
  
}

