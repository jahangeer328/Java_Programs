package basicToAdvancePatterns;

public class Day1 {

    static void patter1(int n){

        //outer loop
        for (int i = 1; i <= n ; i++) {

            //for spacing
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    static void pattern2(int n){

        //outer loop
        for (int i = 1; i <= n ; i++) {

            //for spacing
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(". ");
            }

            //printing stars
            for (int j = 1; j <= n-1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n ){
        //outer loop
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i+1 ; j++) {
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

            for (int j = 1; j <= (i*2)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {

            //for spacing
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*n-2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {

            //for spacing
            for (int j = 1; j <= 6 ; j++) {

                if(i==1 || i == n){
                    System.out.print("* ");
                }else{
                    if( j == 1 || j == 6){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
    //remind 49:33

    static void pattern7(int n) {
        //outer loop
        for (int i = 1; i <= n ; i++) {
            if(i == 1 || i == 2 || i == n){
                for (int j = 1; j <= i ; j++) {
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                for (int j = 1; j <= i-2 ; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    //remind 1:00:39

    static void pattern8(int n){
        //outer loop
        for (int i = 1; i <= n ; i++) {
            //for spacing

            for (int j = 1; j <= n-i ; j++) {
                System.out.print("-");
            }

            if(i == 1 || i == n){
                for (int j = 1; j <= 2*i-1 ; j++) {
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for (int j = 1; j <= 2*i-3 ; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("pattern1");
        patter1(5);
        System.out.println("pattern2");
        pattern2(5);
        System.out.println("pattern3");
        pattern3(5);
        System.out.println("pattern4");
        pattern4(10);
        System.out.println("pattern5");
        pattern5(4);
        System.out.println("pattern6");
        pattern6(4);
        System.out.println("pattern7");
        pattern7(5);
        System.out.println("pattern7");
        pattern8(10);//solved this is power of focus and analyzing of problem step by step


    }
}
