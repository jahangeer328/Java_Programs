package Project_Practice_OOP_Concept;

public class TestMain {
    public static void main(String[] args) {


      //  boolean isLoggedIn = false;
        User user = new User("11AA", "Jahangeer123@","User");
        Account account = new Account(user,101,"Jahangeer","11AA","023242423","41106-131333-1",300000);

        user.login("Jahangeer123");

        account.checkBalance();
        account.withdraw(50000);
      //  account.checkBalance();
          account.printReport();
          user.logout();
        account.checkBalance();
//
//        String pass = user.getPassword();
//        System.out.println(user.verifyPassword("Jahangeer123@",pass));
//        System.out.println(user.getPassword());
//        System.out.println(pass.hashCode());
//
//        user.login("Jahangeer123@");
//
//        System.out.println(user.isLoggedIn());
//
//       // user.logout();
//
//        System.out.println(user.isLoggedIn());

    }
}
