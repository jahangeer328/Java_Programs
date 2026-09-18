package Revise_Work.String;

public class Main {
    public static void main(String[] args) {

        String s1 = "Hello"; //resolved at C-T
        String s2 = s1 +  " World"; //resolved at R-T or dynamically
        //System.out.println(s1 == s2); // false
        String s3 = "Hello World";
        System.out.println(s3 == s2);//false

        //String pool -->"Hello","World","Hello World"
        //Heap        -->"Hello World"

        String name = "Alii";

        byte [] no = name.getBytes();
        System.out.println(name.length());
        for (byte b : no){

           // char c = b;


            System.out.println((char) b);
        }

    }
}



