package Enum;
//Enum > Enumeration / type
//Enum is predefined constant
//using enum keyword we can create enum
//name,ordinal, compile time values for enum array, valuesOf handled String when pass
enum PaymentType{

    CREDITCARD,
    DEBITCARD,
    EASYPAISA,
    JAZZCASH;
}


public class ReviseEnum {
    public static void main(String[] args) {

        PaymentType [] type = PaymentType.values();

        for (PaymentType p  : type){
            System.out.println(p.name());
        }


    }
}
