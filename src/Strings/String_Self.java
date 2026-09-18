package Strings;

public class String_Self {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";
        //both will point same object in String pool which is special area in heap memory


        s1.concat("Developer");
        System.out.println(s1);
        StringBuilder b = new StringBuilder("Java");
        b.append("developer").append(" + SpringBoot");
        System.out.println(b);
    }
}
