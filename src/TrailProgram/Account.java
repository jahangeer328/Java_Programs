package TrailProgram;

public final class Account {

    private   int id;
    private  String name;
    private  String phone;
    private  double balance;

    public Account(int id, String name, String  phone, double balance){

        if(id > 0)
            this.id = id;
        this.name = name;
        this.phone = phone;

        if(balance > 0.0)
            this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Amount is less than 0");

        }else{
            this.balance +=amount;
            System.out.println("Amount Deposited : " + amount);
        }

    }

    public void withdraw(double amount){
        if(this.balance <= amount){
            this.balance -=amount;
            System.out.println("Withdrawal Successful : " + amount);
        }else{
            System.out.println("Amount is less than current balance");
        }
    }

    @Override
    public String toString(){
        return "[ ID : " + getId() + "|"+"NAME : " + getName() + "|"+"PHONE : " + getPhone() + "|"+"BALANCE : " + getBalance() + "]";
    }
}
