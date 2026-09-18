package ChatGpt;

public enum PaymentType {
    CREDIT_CARD("CC"),
    DEBIT_CARD("DC"),
    UPI("UPI"),
    PAYPAL("PP");

    private String data;
    PaymentType (String data){
        this.data = data;

    }

    public  String getData(){
        return data;
    }
}
