package MY_PROJECTS_JUN;

public class User {
    private final int userID;
    private final String name;
    private final String email;
    private final boolean isActive;

    public User(int userID, String name, String email, boolean isActive) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.isActive = isActive;
    }

    public void login(){

    }

    public void logout(){

    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public String getProfileDetails(){
        return toString();
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return isActive;
    }
}
