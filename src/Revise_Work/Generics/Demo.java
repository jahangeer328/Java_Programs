package Revise_Work.Generics;

public class Demo {
    public static void main(String[] args) {

        //upcasting shorter data types convert easily in broader data types
        int x = 200;
        long l = x;

        //DownCasting broader data types can't convert into shorter data types easily
        //then using type casting means hey compiler I want to do it

        long l1 = 20000;
       // int x1 = l;//you should tell the compiler it is compulsory, I really want to do
        int x2 = (int) l1;

        String s = "Hello";
        String obj = s;

        Object obj2 = 10;

        String s1 =(String) obj2;// this will throw classCastException


    }
}
