package Generics;

//before generic
/*
no type safety,lots of manual casting , Runtime errors,
 */
//after java 5
/*
Type safety,reduce manual casting,error checked at compile time , you can pass any data of all types
no writing more code
 */
class Bottle <T>{
    private T value;

    Bottle(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}
public class Problem {
    public static void main(String[] args) {

        Bottle<Integer> b = new Bottle<>(10);
        Bottle<String> b1  =new Bottle<>("Jahangeer");
        Bottle<Boolean> b3 = new Bottle<>(true);

        System.out.println(b.getValue() + 5);
        System.out.println(b1.getValue() + 5);
        System.out.println(b3.getValue());
//        Bottle b = new Bottle(10);
//        Bottle b1 = new Bottle("Hello");
//        Bottle b3 = new Bottle(true);

//        System.out.println(b.getValue() + 5);
//        System.out.println(b1.getValue() + 5);
//        System.out.println(b3.getValue());
        //we can not perform any operation
        //we should typecast

//        Integer x = (Integer) b.getValue();
//        String y = (String) b1.getValue();
//        Boolean z = (Boolean) b3.getValue();
//
//        System.out.println(x + 5);
//        System.out.println(y + 5);
//        System.out.println(z);



        //why generics come to solve problem what was the problem

        //upcasting
        /*
        we can easily convert short data type to broader data types
         */
        int i = 10;
        long l = i;
        System.out.println(l);
//-------------------------------------------------
        String s = "Hello";

        Object obj = s;

        System.out.println(s);

        //down-casting
        /*
        we should cast the data type, or we should tell the compiler , I want to do it is my purpose
        when we want to convert broader data type to the shortest data type
         */
        long l1 = 1203297346;
        //int i2 = l1; //that was the problem on compile time
        int i3 = (int) l1;
        System.out.println(i3);
        //--------------------------------

        Object obj1 = "Hello";
       // String s2 = obj1; // that was the problem
        String s3 = (String) obj1;
        System.out.println(s3);




    }
}
