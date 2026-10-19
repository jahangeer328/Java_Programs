package Revise_Work.Generics.WildCards;

public class GenericsUsedInMethods {
    public static void main(String[] args) {

     String res1 = getFirst("Java" , 20);
    Integer res2 =   getFirst(20 , 45);
     Double res3 =  getFirst(45.3, 56.2);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

    static <T , U> T getFirst(T  a , U b){

       return a;
    }
}
