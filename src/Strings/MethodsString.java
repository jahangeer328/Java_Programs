package Strings;

public class MethodsString {

    public static void main(String[] args) {



        String s1 = new String("jahangeer");
        String s2 = new String("Jahangeer");

        //1.Length / Emptiness
      //  System.out.println(s1.length());//9
      //  System.out.println(s1.isEmpty());//false
       // System.out.println(s1.isBlank());//false

        //2.character Access
//        System.out.println(s1.charAt(8));
//        char [] arr = s1.toCharArray();
//
//        for (int i = arr.length-1; i >= 0 ; i--) {
//            System.out.print(arr[i]);
//        }
//        System.out.println(s1);

        //3.Comparison
//        System.out.println(s1.equals(s2));//false
//        System.out.println(s1.equalsIgnoreCase(s2));//true
//        System.out.println(s1.compareTo(s2));

        //4.Searching
//        System.out.println(s1.contains("geer"));
//        System.out.println(s1.indexOf("geer"));//5
//        System.out.println(s1.lastIndexOf("geer"));//9
//
//        System.out.println(s1.startsWith("j"));//true
//        System.out.println(s1.endsWith("r"));//true

        //5.Extraction / Transformation
//        System.out.println(s2.substring(0,5));
//        System.out.println(s2.toUpperCase());
//        System.out.println(s2.toLowerCase());
//        System.out.println(s2.trim());
//        System.out.println(s2.strip());//unicode friendly
//        System.out.println(s2.repeat(3));
//        System.out.println(s1.replace('j','A'));
//        System.out.println(s1.replace("jahan","Alam"));
//
//        System.out.println(s1.replaceAll("a","x"));
//        String s3 = "Ali,Bhai,Khan";
//        String arr  [] = s3.split(",");
//
//        for (String s : arr){
//            System.out.println(s);
//        }


        //System.out.println(String .join("-","a","b","c"));

        //6.conversion

      //  String s4 = new String(String.valueOf(10));

        //Advance Methods -> intern(), format()

//        String s5 = new String("Hello");
//        String s6 = s5.intern();
//        System.out.println(s5 == s6);

        byte arr1 [] = s1.getBytes();

        for (byte i : arr1){
            System.out.print(i + " , ");
        }
        String name = "Jahangeer";
        int age = 21;

        System.out.printf("Hello %s,Your age is %s %n",name,age);


    }
}
