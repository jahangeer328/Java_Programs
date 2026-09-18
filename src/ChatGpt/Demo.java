package ChatGpt;


interface Vehicle{

    int startSpeed = 5;
    default void start(){
        System.out.println("Start with silub at speed = " + startSpeed);
    }
    void stop();
}

class Car implements Vehicle{

    @Override
    public void stop(){
        System.out.println("Car Stopped");
    }
}

class Bike implements Vehicle{

    @Override
    public void stop(){
        System.out.println("Bike Stopped");
    }
}

class Truck implements Vehicle{

    @Override
    public void stop(){
        System.out.println("Truck Stopped");

    }
}
public class Demo {
    public static void main(String[] args) {

        Vehicle vehicle = new Bike();
        vehicle.start();

        vehicle.stop();
    }
}
