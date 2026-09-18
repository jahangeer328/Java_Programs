package Task;

//if we want our class will work on particular type of data
// then we should extend in generics it parents to use subtype and parent also
public class Task3UpperBound {
    public static void main(String[] args) {

        Box1<ElectricCar> vehicleBox1 = new Box1<ElectricCar>();
    }
}

class Box1<T extends Vehicle & ChargeAble>{
    T value;


}
class Vehicle{

    void start(){
        System.out.println("Vehicle Started ..");
    }

    void brake(){
        System.out.println("Vehicle Stopped ..");
    }

}

interface ChargeAble{

    void charge();

}
class PetrolCar extends Vehicle{


}


class ElectricCar extends Vehicle implements ChargeAble{

    @Override
    public void charge(){
        System.out.println("ElectricCar is on Charge");
    }
}