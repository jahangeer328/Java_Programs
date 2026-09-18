package ChatGpt.Generics;


import java.util.ArrayList;

class Pair<T ,U>{

    T first;
    U second;

    Pair(T first , U second){
        this.first = first;
        this.second = second;
    }
}
class Box <T>{
    private T value;

    Box(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {

        Pair<String , Integer> p = new Pair<>("Jahangeer " , 21);
        System.out.println(p.first +  " , " + p.second);
//        Box<Integer> b1 = new Box<>(10);
//        Box<String> b2 = new Box<>("jahangeer");
//        Box<Double> b3 = new Box<>(10000.33);
//
//        //Also we can perform Operation on this
//        System.out.println(b1.getValue());
//        System.out.println(b2.getValue());
//        System.out.println(b3.getValue());
//
//        print(1000);
//        print("Jahangeer");
//        print(true);
//        print(102.234);
//
//        /*
//        tyre safety,less typeCasting, no Runtime error,increase code reusability
//         */
//
//        ArrayList<Integer> list = new ArrayList<>();
//        //list.add("ali");
//        list.add(100);
//
//        Integer name =  list.getFirst();
//        System.out.println(name);
    }

    public static  <T> void print(T value){

        System.out.println("Value : " + value);
    }

    public static <T , K> void max(T value1, K value2){


    }
}
