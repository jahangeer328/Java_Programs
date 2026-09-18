package Abstraction;
//in old java interface provided 100 pure abstraction
//but in modern java implements also default method
// old java interfaces tell  pure what
//it can't instantiate
//by default interface is public we can deprecate her visibility but can extend
//it use as contract between classes which implements interface
//it responsibility of that class to implements her all method
interface IFlyable{

    void fly();

    default void name(){
        System.out.println("Interface");
    }
}

class Bird implements IFlyable{
     @Override
    public void fly(){
         System.out.println("Bird opening her wing for fly ..");
     }

}

class AirPlane implements IFlyable{

    @Override
    public void fly(){
        System.out.println("Air plane take of for fly ...");
    }
}
public class Fly {

    public static void main(String[] args) {

        IFlyable go = new AirPlane();
        go.fly();
    }

}
