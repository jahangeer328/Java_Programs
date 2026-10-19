package july;

public class PatternsMain {
    public static void main(String[] args) {

        pattern1(4);
        System.out.println("///////////////");
        patter2(3);
        System.out.println("///////////////");
        pattern3(5);
        System.out.println("///////////////");
        pattern4(4);
        System.out.println("///////////////");
        pattern5(5);
        System.out.println("///////////////");
        pattern6(5);
        System.out.println("///////////////");
        pattern7(4);
        System.out.println("///////////////");
        pattern8(10);
        System.out.println("///////////////");
        pattern9(5);
        System.out.println("///////////////");
    }

    static void pattern9(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {

            //printing space
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("  ");
            }
            //printing stars at i = 1, i = n
            if(i == 1 || i == n){
                for (int j = 1; j <= 2*i-1 ; j++) {
                    System.out.print("* ");
                }
            }else{
                System.out.print("*");
                for (int j = 1; j <= 2*i-2 ; j++) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
            //..
        }
    }
    static void pattern8(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {

            if(i == 1 || i == 2 || i == n){

                for (int j = 1; j <= i ; j++) {
                    System.out.print("* ");
                }
            }else{

                System.out.print("* ");
                for (int j = 1; j <= (i-2) ; j++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }

            System.out.println();
            //..
        }
    }
    static void pattern7(int n){

        //outer loop
        for (int i = 1; i <= n ; i++) {

            //printing stars
            for (int j = 1; j <= 6 ; j++) {

                if(i == 1 || i == n){
                    System.out.print("* ");
                } else if (j == 1 || j == 6 ) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //both right , and inverted
    static void pattern6(int n){
        //outer loop
        for (int i = n; i >= 1 ; i--) {

            //for spacing
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            //for printing stars

            for (int j = 1; j <= i+i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
    static void pattern5(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {

            //for printing stars
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //static keyword link with class not object
     static void pattern1(int n){

         for (int i = 1; i <= n ; i++) {

             for (int j = 1; j <= n ; j++) {

                 System.out.print(" * ");
             }
             System.out.println();
         }
    }

    static void patter2(int n){

        for (int i = 0; i < n  ; i++) {

            for (int j = 0; j < 5 ; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {

            //for spacing
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            //printing stars
            for (int j = 1; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
