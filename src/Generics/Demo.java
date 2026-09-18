package Generics;

public class Demo {
    public static void main(String[] args) {

        //UpCasting
        String s = "Hello";
        Object obj = s;
        System.out.println(obj);

        //DownCasting
        Object obj2 = "Hello";

        String s1 = (String) obj2;
        System.out.println(s1);

        //
        Object obj3 = 10;
        String s2 = (String) obj3;
        System.out.println(s2);
    }
}
