package Strings;

import java.time.LocalDateTime;


public class Demo1 {
    public static void main(String[] args) {

        String string = "";
        String s = " ";

        System.out.println(string.isEmpty());//true
        System.out.println(s.isEmpty()); //false b/c space exists

        int a = 10;
        String s3 = String.valueOf(a);
        System.out.println(s3);

        LocalDateTime l;
        System.out.println();

//        for (int i = 0; i < 10 ; i++){
//
//            s += i;
//            System.out.println(s);
//        }

    }
}
