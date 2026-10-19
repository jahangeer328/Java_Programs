package Revise_Work.Practice_Simple_Projects;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer{
    private String name;
    private String phone;
    private int age;
    private String fname;

    public Customer(String name, String phone, int age, String fname) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.fname = fname;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getFname() {
        return fname;
    }

    @Override
    public String toString(){
        return "|Name :" + name + "| Phone :" + phone +"| Age :" + age + "| Father's Name : " + fname + "|";
    }
}

class Account{
    private Customer customer;
    private int accountId;
    private double balance;

    public Account(Customer customer, int accountId, double balance) {
        this.customer = customer;
        this.accountId = accountId;
        if(balance > 0.0)
            this.balance = balance;

    }

    public void withdraw(double amount){
        if(this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawal Successful of : " + amount);
        }
        else{
            System.out.println("Sorry insufficient Balance");

        }

    }

    public double deposit(double amount){
        return this.balance += amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString(){
        return " Account ID :" + accountId+ " " +customer.toString() + " Balance : "  + balance + " |";
    }
}

class Bank{
    private final String BankName;
    private final String branch;
    List<Account> accountList;

    public Bank(String bankName , String branch){
        accountList = new ArrayList<>();
        this.BankName = bankName;
        this.branch = branch;
    }

    public void createAccount(Scanner sc,Customer customer){
        System.out.print("Enter ID  : ");
        int id = sc.nextInt();
        System.out.print("\nEnter the initial balance : ");
        double bal = sc.nextDouble();

        accountList.add(new Account(customer,id,bal));
        System.out.println("Your Account is Created, Mr." + customer.getName());
    }

    public void deleteByID(){

        boolean isDeleted = false;
        if(accountList.isEmpty()){
            System.out.println("List is empty!!!");
        }
        java.util.Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter ID : ");
        int id = scanner.nextInt();

        for (int i = 0; i < accountList.size(); i++) {
            if(accountList.get(i).getAccountId() == id){
                accountList.remove(i);
                    isDeleted = true;
            }
        }
        if(isDeleted){
            System.out.println("Removed  : " + id);
        }else{
            System.out.println("Not Founde");
        }
    }

    public  void deleteByName(){

        boolean isDeleted = false;
        if(accountList.isEmpty()){
            System.out.println("List is empty!!!");
            return;
        }
        java.util.Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = scanner.next();

        for (int i = 0; i < accountList.size(); i++) {
            if(accountList.get(i).getCustomer().getName().equalsIgnoreCase(name)){
                accountList.remove(i);
                isDeleted = true;
            }
        }
        if(isDeleted){
            System.out.println("Removed  : " + name);
        }else{
            System.out.println("Not Founde");
        }

    }

    public  void search(){

        if(accountList.isEmpty()){
            System.out.println("Not found");
        }
        java.util.Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = scanner.next();

        for (Account ac : accountList){
            if(ac.getCustomer().getName().equalsIgnoreCase(name)){
                System.out.println("Found  : \n" +ac.toString());
            }
        }


    }

    public void display(){

        if(accountList.isEmpty()){
            System.out.println("Empty");
        }
        for (Account ac : accountList){
            System.out.println(ac);
        }
    }

    public void menu(Customer customer){
        java.util.Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1 for create an account in bank");
            System.out.println("2 for deleteById");
            System.out.println("3 for deleteByName");
            System.out.println("4 for search");
            System.out.println("5 for display");
            System.out.println("6 for exit");
            System.out.print("Enter choice : ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    createAccount(scanner, customer);
                    break;
                case 2 :
                    deleteByID();
                    break;
                case 3:
                    deleteByName();
                    break;
                case 4 :
                    search();
                    break;
                case 5 :
                    display();
                    break;

                case 6:
                    System.out.println("Bye");
                    return;

                default:
                    System.out.println("Invalid Choice ");

            }
        }


    }
}
public class BankMain {
    public static void main(String[] args) {

        Customer customer = new Customer("Jahangeer","0345-2134",21,"Nisar Ali");

//        Account account = new Account(customer,101,2000);
//        account.deposit(300);
//        account.withdraw(200);
//        System.out.println(account);
        Bank bank = new Bank("Modern Bank","Talhar Branch");
        bank.menu(customer);

    }
}
