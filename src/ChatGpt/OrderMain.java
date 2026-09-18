package ChatGpt;

enum OrderStatus{
    PENDING,PROCESSING,SHIPPED,DELIVERED,CANCELLED;
}


public class OrderMain {
    public static void main(String[] args) {

        OrderStatus orderStatus = OrderStatus.SHIPPED;

        System.out.println(orderStatus.name());

    }
}