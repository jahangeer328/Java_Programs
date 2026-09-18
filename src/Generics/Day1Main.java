package Generics;

//class Practice <T>{
//
//    private T value;
//
//    Practice(T value){
//        this.value = value;
//    }
//
//    public T getValue(){
//        return value;
//    }
//}


class Pair <T,U>{
    T first;
    U second;


    Pair(T first , U second){
        this.first = first;
        this.second = second;
    }
}
public class Day1Main {
    public static void main(String[] args) {

        Pair<String , Integer> pair = new Pair("jahangeer", 10);

        System.out.println(pair.first + " , " + pair.second);
//        Practice<Integer> practice = new Practice<>(10);
//        Practice<String> practice1 = new Practice<>("jahangeer");
//        Practice<Boolean> practice2 = new Practice<>(true);
//
//        /*Integer i = (Integer) practice.getValue();
//        String s = (String) practice1.getValue();
//        Boolean b = (Boolean) practice2.getValue();*/
//        System.out.println(practice.getValue()+5);
//        System.out.println(practice1.getValue()+ 5);
//        System.out.println(practice2.getValue());

        System.out.println(getX("jahangeer"));

        pair("jahangeer" , 10);

        //type inference
    }

    public static <T> T getX(T x){
        return x;
    }

    public static <T, U> void pair(T x, U y){
        System.out.println(x + " , " + y);
    }
}
