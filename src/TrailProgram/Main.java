package TrailProgram;

public class Main {

    public static void main(String[] args) {

        Account account = new Account(101,"Jahangeer", "0345024234",30000);
        Account account1 = new Account(102,"Ali", "0345034534",50000);
        Bank bank = new Bank("Modern bank","Ali mohla","Talhar Branch",1133);

        bank.addAccount(account);
        bank.addAccount(account1);

       // bank.removeAccount(102);
      //  bank.printList();

        bank.search("jahangeer");
    }
}
