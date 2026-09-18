package ChatGpt;

interface INotification{
    void send(String message);
}

class EmailNotification implements INotification{

    @Override
    public void send(String message){
        System.out.println("Email Notification ~~ " + message);
    }
}

class SMSNotification implements INotification{

    @Override
    public void send(String message){
        System.out.println("SMS Notification ~~ " + message);
    }
}

class PushNotification implements INotification{

    @Override
    public void send(String message){
        System.out.println("Push Notification ~~ " + message);
    }
}
public class SentNotification {
    public static void main(String[] args) {

        INotification notification = new PushNotification();
        notification.send("Hello from ali");
    }
}
