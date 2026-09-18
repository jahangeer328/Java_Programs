package Strings;

public class revise {
    public static void main(String[] args) {

        //Constructor method to define String

        String s1 = new String();

        String s2 = new String("Hello");

        //char array [ ]

        char [] arr = {'j','a','n','g','i','r',' ','l','a','s','h','a','r','i'};

        String s3 = new String(arr);

        //subset of char array []

        String s4 = new String(arr,0,6);

        //Byte array [] which takes Unicode values

        byte [] arr1 = {97,98,99,100};

        String s5 = new String(arr1);

        //subset of byte array [ ]

        String s6 = new String(arr1,0,3);

        //two more classes which is immutable
        //1st One // 2nd is StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        String s7 = new String(sb);
        //also can pass sb in string constructor
        System.out.println(s7);


        // Methods in String all to all

        //1 length //Emptiness
        String s9 = new String("Jahangeer");

        System.out.println(s9);

    }
}
