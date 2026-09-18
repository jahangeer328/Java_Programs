package Strings;

import Abstraction.Main;
public class Demo {
    public static void main(String[] args) {

        Main main = new Main();
        String str ="Hello";
        str.concat("World!!");
        System.out.println(str);

        String str2 = "Hello";

        System.out.println(str + " , " + str.hashCode());
        System.out.println(str2 + " , " + str2.hashCode());

        //timestamp 21:20

        //compile time constant == String pool memory is heap memory Special place reserve for leterel method
        String s1 = "ja" + "va";
        String s2 = "java";


        System.out.println(s1 == s2);
        //  Runtime constant


        String s3 = s1 + "va";//it will use String builder internally

        String s4 = "Hello";
        String s5 = s4 + " World"; // this resolve dynamically
        System.out.println(s5);
        String s6 = "Hello World";
        System.out.println(s6 == s5);

        String s7 = "Hello";
        String s8 = s7;
        System.out.println(s7 == s8);

        String s9 = "Hello";

        s9 = "World";
        System.out.println(s9);

        String s10 = new String("Hello");
        String s11 = "Hello";

        //String pool ==> Hello CompileTime
        //Heap ==> Hello Runtime

        String r = "Bye";
        String r1 = new String("Bye");
        System.out.println(r.equals(r1));//
    }
}
//STRINGS
//String is sequence of character
/*
- > String is immutable we already studied immutable classes.
- > we can not modify them.
- > immutable is vast use in every thing also db,login and more.
- > once we create object of String we can not modify the String
- > if you change with concat() method but original String remain same.
- > we implement String using 2 ways 1st is literal(using double quote) method and 2nd is( new keyword )
- > 1st one unlock String pool which help to optimize the String
- > basically in literal method which use String pool
- > String pool reserved special place in heap memory which is called string pool.
- > which reuse the Same String
GOLDEN RULE
compile time constant create which goes to String pool and Runtime String Created which in heap
-> everything in double quotes will store in String pool
->>>>>>>>>>>>>>
STRING METHODS |
->>>>>>>>>>>>>>

 */