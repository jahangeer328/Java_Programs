package Basic;

class BankAccount{

    private  int accountNumber;
    private  double balance;

    BankAccount(){}

    public double deposite(double amount){
        return this.balance +=amount;
    }

    public double withdraw(double amount){

        return
                this.balance -=amount;

    }

    public double getBalance(){
        return balance;
    }


}
public class BankMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposite(2000);
        account.withdraw(3000);
    System.out.println(account.getBalance());
    }
}
