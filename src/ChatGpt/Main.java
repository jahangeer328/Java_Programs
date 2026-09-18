package ChatGpt;

class CreditCardPayment implements Payment,TransactionLogger{

    //by default public
    //interface you can declare field which is by default private final static
    @Override
    public void pay(double amount){
        System.out.println("Credit Card Payment of : " + (int)amount + " successful");
        if(amount > 0){
            logTransaction("Completed");
        }else{
            logTransaction("Not Yet Done");
        }
    }

    @Override
    public void logTransaction(String message){
        System.out.println("Payment is  : " +message + " ." );
    }
}

class DebitCardPayment implements Payment,TransactionLogger{

    @Override
    public void pay(double amount){
        System.out.println("Debit Card Payment of : " + amount + " successful");
        if(amount > 0){
            logTransaction("Completed");
        }else{
            logTransaction("Not Yet Done");
        }
    }

    @Override
    public void logTransaction(String message){
        System.out.println("Payment is  : " +message + " ." );
    }
}

class UPIPayment implements Payment,TransactionLogger{

    @Override
    public void pay(double amount){
        System.out.println("UPI Payment of : " + amount + " successful");

        if(amount > 0){
            logTransaction("Completed");
        }else{
            logTransaction("Not Yet Done");
        }
    }

    @Override
    public void logTransaction(String message){
        System.out.println("Payment is  : " +message + " ." );
    }
}

class PaypalPayment implements Payment,TransactionLogger{

    @Override
    public void pay(double amount){
        System.out.println("Paypal Payment of : " + (int)amount + " successful");
        if(amount > 0){
            logTransaction("Completed");
        }else{
            logTransaction("Not Yet Done");
        }
    }

    @Override
    public void logTransaction(String message){
        System.out.println("Payment is  : " +message + " ." );
    }
}
public class Main {
    public static void main(String[] args) {

      Payment payment = PaymentFactory.getPayment(PaymentType.CREDIT_CARD);

       // System.out.println(PaymentFactory.getPayment(PaymentType.DEBIT_CARD));
        payment.pay(5000);
        payment.refund();

        System.out.println("Selected  Payment : " + PaymentType.PAYPAL.name());
        System.out.println("Code :  " + PaymentType.PAYPAL.getData());
        PaymentType [] paymentTypes = PaymentType.values();

        for (PaymentType p : paymentTypes){
            System.out.println(p.ordinal()+  " - >"+ p.name());
        }


    }
}
