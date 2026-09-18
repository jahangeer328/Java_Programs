package Generics;

public class Demo2 {
    public static void main(String[] args) {

        Box b1 = new Box(10);

        Box1 obj = new Box1("Hello");
        Box1 obj1 = new Box1(10);
        Box1 obj2 = new Box1(true);

        System.out.println(obj.getValue());
        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());
    }
}

class Box{
    private int value;

    Box(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}

class Box1{
    private Object value;

    Box1(Object value){
        this.value = value;
    }

    public Object getValue(){
        return this.value;
    }
}
