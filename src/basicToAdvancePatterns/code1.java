package basicToAdvancePatterns;

public class code1 {

    public static void main(String[] args) {

        square(5);
        rightTraingle(5);
        leftTraingle(5);
    }

    public static void square(int n){

        //outer loop
        for (int i = 1; i <= n ; i++) {

            //print stars
            for (int j = 1 ; j <= n; j++){
                System.out.print("*");
            }
            // for nextLine for every iteration
            System.out.println();
        }
    }

    public static void rightTraingle(int n){

        //outer loop
        for (int i = 1; i <= n ; i++) {

            //printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftTraingle(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {

            // for print spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
