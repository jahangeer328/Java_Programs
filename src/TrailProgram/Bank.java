package TrailProgram;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String bankName;
    private final String location;
    private final String branch;
    private final int dial;
    private List<Account> accounts;

    public Bank(String bankName, String location, String branch, int dial) {
        this.bankName = bankName;
        this.location = location;
        this.branch = branch;
        this.dial = dial;
        this.accounts = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public String getLocation() {
        return location;
    }

    public String getBranch() {
        return branch;
    }

    public int getDial() {
        return dial;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(int id){
        boolean isRemoved = false;
        for (int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getId() == id){
                accounts.remove(i);
                isRemoved = true;
                return;
            }
            System.out.println("Removed : " + (!isRemoved));
        }
    }

    public void search(String name){

        for (Account a : accounts){
            if(a.getName().equalsIgnoreCase(name)){
                System.out.println(a);
            }
        }
    }
    public void printList(){
        System.out.println("<<==" + getBankName() + "==>>");
        System.out.println("<<==" + getBranch() + "==>>");
       for (Account a : accounts){
           System.out.println(a);
       }
    }
}
