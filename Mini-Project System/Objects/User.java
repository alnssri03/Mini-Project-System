package Objects;

public class User {
     // Declare attributes for the User superclass
  private String id;
  private String firstName;
  private String lastName;
  private String userName;
  private String password;
  private String phoneNumber;


  public User() {
  }

  public User(String id, String firstName, String lastName, String userName, String password, String phoneNumber) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.password = password;
    this.phoneNumber = phoneNumber;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setphoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", firstName='" + getFirstName() + "'" +
      ", lastName='" + getLastName() + "'" +
      ", userName='" + getUserName() + "'" +
      ", password='" + getPassword() + "'" +
      ", phineNymber='" + getPhoneNumber() + "'" +
      "}";
  }
}
