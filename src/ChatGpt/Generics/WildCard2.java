package ChatGpt.Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard2 {
    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account());
        accountList.add(new Account());

        List<SavingAccount> savingAccountList = new ArrayList<>();
        savingAccountList.add(new SavingAccount());
        savingAccountList.add(new SavingAccount());

        List<CurrentAccount> currentAccountList = new ArrayList<>();
        currentAccountList.add(new CurrentAccount());
        currentAccountList.add(new CurrentAccount());

        createAccount(accountList);
     // accountList.add(new SavingAccount());

        printAccount(accountList);

    }

    static void printAccount(List<? extends Account> accounts){

        for (Account ac : accounts){
            ac.details();
        }

    }

    static void createAccount(List<? super Account> accounts){
       // accounts.add(new SalaryAccount());

        accounts.add(new SavingAccount());
        accounts.add(new Account());
     //   accounts.add(new SavingAccount());
     //  accounts.add(new CurrentAccount());

    }
}

class Account{

    void details(){
        System.out.println("Account detail is Available!!");
    }
}

class SavingAccount extends Account{
    @Override
    void details(){
        System.out.println("SavingAccount detail is Available!!");
    }
}

class CurrentAccount extends Account{
    @Override
    void details(){
        System.out.println("CurrentAccount detail is Available!!");
    }
}

class SalaryAccount extends CurrentAccount{

}
