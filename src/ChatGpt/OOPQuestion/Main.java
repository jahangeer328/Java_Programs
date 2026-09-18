package ChatGpt.OOPQuestion;

//class Employee{
//
//    private int id;
//    private String name;
//    private String pno;
//    private long CNIC;
//}

class BankAccount{

    private int accountNo;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNo , String accountHolderName , double balance){
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double withdraw(double amount){
       return (this.balance -=amount);
    }

    public double deposit(double amount){
        return (this.balance +=amount);
    }

    public int getAccountNo(){
        return accountNo;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
//
//        BankAccount bankAccount = new BankAccount(101,"Jahangeer",20000);
//        System.out.println(bankAccount.getAccountNo());
//        System.out.println(bankAccount.getAccountHolderName());
//        System.out.println(bankAccount.getBalance());
//        bankAccount.withdraw(17000);
//        System.out.println(bankAccount.getBalance());
//        bankAccount.deposit(30000);
//        System.out.println(bankAccount.getBalance());

        Student1 person  =new Student1("jahangeer", 21,101);

        System.out.println(person);
    }
}

class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age;
    }
}

class Student1 extends Person{

    private int id;
    Student1(String name, int age,int id) {
        super(name, age);
        this.id = id;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + '\''+"id=" + id +
                '}';
    }
}
