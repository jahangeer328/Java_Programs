package Basic;

class Car{

    private final String brand;
    private final int model;
    private final double price;


    public Car(String brand, int model, double price){

        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
public class CarMain {
    public static void main(String[] args) {

        Car car = new Car("Toyota" , 2019 , 200000);

        System.out.println("Brand : " + car.getBrand());
        System.out.println("Model : " + car.getModel());
        System.out.println("Price : " + car.getPrice());

    }
}
