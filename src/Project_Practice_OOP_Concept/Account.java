package Project_Practice_OOP_Concept;

public class Account{
    private final User owner;
    private final int id;
    private final String name;
    private final String accountNo;
    private final String phone;
    private final String cnic;
    private double balance;

    public Account(User owner, int id, String name ,String accountNo, String phone, String cnic, double balance) {
        this.owner = owner;
        this.id = id;
        this.name = name;
        this.accountNo = accountNo;
        this.phone = phone;
        this.cnic = cnic;
        this.balance = balance;
    }


    public void deposit(double amount){

        if(owner.isLoggedIn()){
            System.out.println("Please Login first");
            return;
        }

        if (amount > 0) balance  +=amount;
    }

    public void withdraw(double amount){

        if(owner.isLoggedIn()){
            System.out.println("Please Login first");
            return;
        }

        if (amount <= this.balance)  balance  -=amount;
    }

    public void checkBalance(){

        if(!owner.isLoggedIn()){
            System.out.println("Please Login first");
            return;
        }

        System.out.println("Your Balance is : " + getBalance());
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }
    public String getAccountNo() {
        return accountNo;
    }

    public String getPhone() {
        return phone;
    }

    public double getBalance() {
        return balance;
    }

    public String getCnic() {
        return cnic;
    }

    public void printReport(){

        if(owner.isLoggedIn()){
            System.out.println("Please Login first");
            return;
        }

        System.out.println("<<========= Modern Bank===========>");
        System.out.println("Account No : " + getAccountNo());
        System.out.println("Name is  :" + getName());
        System.out.println("PH: " + getPhone());
        System.out.println("Current Balance is : " + getBalance());
        System.out.println("<====================================>");
    }
}