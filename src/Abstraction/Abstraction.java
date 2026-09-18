package Abstraction;


abstract class Car{

    private final String name;
    private final String color;

    Car(String name , String color){
        this.name = name;
        this.color =  color;
    }
      public void start(Car car){
          System.out.println("Started ...."  +name);
      }

      abstract void speed();
      abstract void brake();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}


class PetrolCar extends Car{

    private final int wheel;

    PetrolCar(String name , String color ,int wheel){
        super(name , color);
        this.wheel = wheel;
    }

    @Override
    public void speed(){
        System.out.println("PetrolCar Started ...");
    }

    @Override
    public void brake(){
        System.out.println("PetrolCar brake ....");
    }

    public int getWheel(){
        return wheel;
    }
}

class ElectricCar extends Car{

    private final int wheel;

    ElectricCar(String name , String color ,int wheel){
        super(name , color);
        this.wheel = wheel;
    }

    @Override
    public void speed(){
        System.out.println("ElectricCar Started ...");
    }

    @Override
    public void brake(){
        System.out.println("ElectricCar brake ....");
    }

    public int getWheel(){
        return wheel;
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Car car = new PetrolCar("toyota" , "red" , 4);

        car.start(car);

    }

}
