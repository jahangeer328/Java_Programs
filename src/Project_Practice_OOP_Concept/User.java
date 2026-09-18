package Project_Practice_OOP_Concept;

public final class User {
    private final String userId;
    private final String password;
    private final String role;
    private boolean isLoggedIn;

    User(String userId ,String password , String role){
        this.userId = userId;
        this.password = hashPassword(password);
        this.role = role;
        this.isLoggedIn = false;

    }

    public boolean login(String inputPassword){
        if(verifyPassword(inputPassword,this.password)){
            this.isLoggedIn = true;
            System.out.println("<< ==Welcome To The Banking System ==>> ");
            return true;
        }
        System.out.println("Please check Your Given Password");
        return false;
    }

    public void logout(){

        this.isLoggedIn = false;
        System.out.println("You Successfully Logout from System!!");
    }

    //dummy hashing which convert String to hashcode in Integer
    private String hashPassword(String pass){
        return Integer.toString(pass.hashCode());
    }

    public boolean verifyPassword(String input, String stored ){
        return hashPassword(input).equals(stored);
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}
