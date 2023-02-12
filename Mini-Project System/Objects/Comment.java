package Objects;

public class Comment {
    private String adminUsername;
    private String text;
    private String projectID;
  
    public Comment(String adminUsername, String text, String projectID) {
      this.text = text;
      this.adminUsername = adminUsername;
      this.projectID = projectID;
    }
  
    public String getAdminUsername() {
      return this.adminUsername;
    }
  
    public void setAdminUsername(String adminUsername) {
      this.adminUsername = adminUsername;
    }
  
    public String getText() {
      return this.text;
    }
  
    public void setText(String text) {
      this.text = text;
    }
  
    public String getProjectID() {
      return this.projectID;
    }
  
    public void setProjectID(String projectID) {
      this.projectID = projectID;
    }
  
    public static Comment fromCsv(String csv) {
      String[] row = csv.split("-");
      String adminUsername = row[1].split(": ")[1];
      String text = row[2].split(": ")[1];
      String projectID = row[3].split(": ")[1];
  
      return new Comment(adminUsername, text, projectID);
    }
  
    public String toCsv() {
      return "-Admin Username: " + adminUsername +
          "-Text: " + text
          + "-Project ID: " + projectID
          + "\r\n";
    }
  }
  
