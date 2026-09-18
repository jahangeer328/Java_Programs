package Abstraction;
//Tightly coupled classes
//loose
//class PetrolEngin{
//
//    void show(){
//        System.out.println("petrol Engin");
//    }
//}
//
//
//class DieselEngin{
//
//    void show(){
//        System.out.println("Diesel Engin");
//    }
//}

//class Car1{
//    PetrolEngin e;
//    Car1(){
//        e = new PetrolEngin();
//    }
//
//    void move(){
//        System.out.println("Car Moves with : ");
//        e.show();
//    }
//}

//LOOse coupled Classes
interface Engin{
    void show();
}
class PetrolCar1 implements Engin{

    @Override
    public void show(){
        System.out.println("Petrol Engin .. ");
    }
}

class DieselCar implements Engin{

    @Override
    public void show(){
        System.out.println("Diesel Engin .. ");
    }
}

class Car1{

    Engin e;
    Car1(Engin e){
        this.e = e;
    }

    void move(){
        System.out.println("Car moves with  : ");
        e.show();
    }
}
public class Main {
    public static void main(String[] args) {


        Car1 c = new Car1(new PetrolCar1());
        c.move();




    }
}
