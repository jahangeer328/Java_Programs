package Enum;

enum UserType{
    CUSTOMER,MANAGER;
}

interface Loginable {

   default void login(){
       System.out.println("User Login");
   }
    default void logout(){
        System.out.println("User Logout");
    }
    default void verifyPass(){
        System.out.println("Password Verified");
    }

}


class UserFactory{

    public static Loginable getUserFactory(UserType type){

//Loginable l= null;
        switch (type){
            case CUSTOMER -> {
                return new Customer();
            }
            case MANAGER -> {
                return new Manager();
            }

        }

       return null;

    }
}
public class ProjectModuleTestings {
    public static void main(String[] args) {

        String s = "Customer".toUpperCase();
        Loginable l = UserFactory.getUserFactory(UserType.valueOf(s));

        assert l != null;
        l.login();


    }


}

class Customer implements Loginable{

    @Override
    public  void login(){
        System.out.println("Customer Login");
    }

}

class Manager implements Loginable{

    @Override
    public  void login(){
        System.out.println("Manager Login");
    }

}

