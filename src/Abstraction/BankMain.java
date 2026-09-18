package Abstraction;

interface Interestable{
    void interest();
}

class HBL implements Interestable{
    @Override
    public void interest(){
        System.out.println("HBL BANK INTEREST RATE IS 15%");
    }
}

class UBL implements Interestable{

    @Override
    public void interest(){
        System.out.println("UBL BANK INTEREST RATE IS 10%");
    }
}
public class BankMain {
    public static void main(String[] args) {

        Interestable interestable;

        String type = "UBL";

        if(type.contentEquals("UBL")){
            interestable = new UBL();
        } else{
            interestable = new HBL();
        }

        interestable.interest();
    }
}
