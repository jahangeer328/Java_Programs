package ChatGpt;

interface A{
    void fun();
}

interface B{
    void fun();
}

class C implements A,B{
    @Override
    public void fun(){
        System.out.println("IT IS RUNTIME !!!!");
    }
}
public class Demo1 {
    public static void main(String[] args) {

        A a = new C();
        a.fun();

       B b= new C();

        b.fun();
    }
}
