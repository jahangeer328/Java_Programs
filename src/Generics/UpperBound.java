package Generics;

class Bird {
    void display(){
        System.out.println("Bird Displayed...");
    }
}

interface Flyable{
    void fly();
}
class Hen extends Bird{

}

class Dove extends Bird implements Flyable{
    @Override
    public void fly(){
        System.out.println("fly//////");
    }
}

class Example <T extends Bird & Flyable>{

}
public class UpperBound {
    public static void main(String[] args) {
        Example<Dove> example = new Example<>();

    }
}
