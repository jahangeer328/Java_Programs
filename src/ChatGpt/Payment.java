package ChatGpt;
//INTERFACE ALSO CONTAIN
/*
PRIVATE MEHTOD , STATIC METHOD
 */
public interface Payment {
    void pay(double amount);
  default void refund(){
      System.out.println("Money Not refunded ? ");
  }
}
