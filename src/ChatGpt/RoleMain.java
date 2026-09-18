package ChatGpt;

import MY_PROJECTS_JUN.User;

enum UserRole{
    ADMIN("watch,edit"),MANAGER("watch"),CUTOMER("Nothing");

    private String perm;
    UserRole(String perm){
        this.perm = perm;
    }

    public String getPerm(){
        return perm;
    }
}
public class RoleMain {
    public static void main(String[] args) {

        UserRole [ ] user = UserRole.values();

        System.out.println("\t Permission series wise");
        for (UserRole u : user){
            System.out.println(u.ordinal() + " -> " + u.name() + " -> " + u.getPerm());
        }
    }
}
