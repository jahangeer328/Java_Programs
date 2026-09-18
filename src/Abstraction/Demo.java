package Abstraction;

interface Payment{
    void pay();
}


class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Pay Via Credit Card /");
    }
}

class DebitCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Pay Via Debit Card /");
    }
}
//class EasyPaisa implements Payment{
//
//    private int no;
//    EasyPaisa(int no){
//        this.no = no;
//    }
//
//    public int getNo(){
//        return no;
//    }
//    @Override
//    public void pay(){
//        System.out.println("Pay Via EasyPaisa");
//    }
//}
//
//
//class JazzCash implements Payment{
//
//    private int no;
//    JazzCash(int no){
//        this.no = no;
//    }
//
//    public int getNo(){
//        return no;
//    }
//    @Override
//    public void pay(){
//        System.out.println("Pay Via JazzCash");
//    }
//}
//
//class Buy{
//    String item;
//    Payment p;
//    Buy(String item ,Payment p){
//        this.item = item;
//        this.p = p;
//    }
//
//    public String getItem(){
//        return item;
//    }
//
//    public void paidBill(){
//        System.out.println(item + " ,Bill Paid With  : ");
//        p.pay();
//    }
//}
public class Demo {
    public static void main(String[] args) {


//        EasyPaisa easyPaisa = new EasyPaisa(345084512);
//        JazzCash jazzCash = new JazzCash(325084512);
//
//        Buy buy = new Buy("Vivo phones", jazzCash);
//        buy.paidBill();


//        Payment pay = new Payment() {
//            @Override
//            public void pay() {
//                System.out.println("Paid with EasyPaisa ");
//            }
//        };

        Payment pay = null;

        String ref = "DebitCard";

        if(ref.equals("CreditCard")){
            pay = new CreditCard();
        }else if("DebitCard".equals(ref)){
            pay = new DebitCard();
        }else{
            System.out.println("PLEASE CORRECT YOUR PAYMENT METHOD");
            return;
        }
        pay.pay();
    }
}
