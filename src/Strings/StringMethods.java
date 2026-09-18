package Strings;

public class StringMethods {
    public static void main(String[] args) {

        //Constructor of String
//        String s = new String();
//        String s1 = new String("");
//        String s2 = new String("Hello");
//
//        //Using Arrays
//
//        //Char
//        char [] arr = {'j','a','n','g','i','r'};
//        //String s3 = new String(arr);
//
//        String s4 = new String(arr,0,4);
//        System.out.println(s4);
//
//
//        byte [] arr3 = {97,98,99,100};
//        String s5 = new String(arr3,0,2);
//        System.out.println(s5);

        //-->Length / Emptiness
        String s = new String("Jahangir");


//        System.out.println(s.length());
//        System.out.println(s.isBlank());
//        System.out.println(s.isEmpty());

        //--> Character access

        System.out.println(s.charAt(2));
        char [] arr = s.toCharArray();
        System.out.println(arr);


        //matches

        String ss  ="abc";
        System.out.println("Hello: "+ss.matches("a-z"));

    }
}
