package ChatGpt;

public class PaymentFactory {

    public static Payment getPayment(PaymentType type) {

        Payment p = null;
        switch (type) {
            case CREDIT_CARD -> p = new CreditCardPayment();

            case DEBIT_CARD -> p =new DebitCardPayment();

            case UPI ->  p = new UPIPayment();

            case PAYPAL -> p = new PaypalPayment();

            default -> System.out.println("Give Payment Type ..");
        }
        return p;
    }
}
