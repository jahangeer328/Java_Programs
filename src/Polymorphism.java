
class A{

    private  void fun(){
        System.out.println("Having fun A");
    }

    void hello(){
        fun();
    }
}

class B extends A{


    private void fun(){
        System.out.println("Having fun B");
    }
}
public class Polymorphism {
    public static void main(String[] args) {

        A a = new B();
        a.hello();
    }
}
