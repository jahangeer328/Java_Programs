package Task;

public class Task2GenericsMethods {
    public static void main(String[] args) {

      Integer a =   printX(10);
        System.out.println(a);

        pair("Jahangeer" ,45.24);
    }

    static <T> T printX(T x) {
        return x;
    }


    static <T,U> void pair(T x , U y){
        System.out.println(x + " , " + y);
    }
}
