package Generics;

public class GenericsMethods {
    public static void main(String[] args) {

       getX("3",11);
    }

    public static <T ,U> void getX(T x , U y){
        System.out.println(x + "  , " + y);

    }
}
