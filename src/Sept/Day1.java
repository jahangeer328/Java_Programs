package Sept;

public class Day1 {
    public static void main(String[] args) {


        pattern1(8);
        System.out.println("1================================");
        pattern2(3);
        System.out.println("2================================");
        pattern3(5);
        System.out.println("3================================");
        pattern4(4);
        System.out.println("4================================");
        pattern5(5);
        System.out.println("5================================");
        pattern6(5);
        System.out.println("6================================");
        pattern7(4);
        System.out.println("7================================");
        pattern8(4);
        System.out.println("8================================");
        pattern9(5);
        System.out.println("9================================");
        pattern10(5);
        System.out.println("10================================");
        pattern11(4);
        System.out.println("11================================");
        pattern18(4);
        System.out.println("18================================");
        pattern12(10);
        System.out.println("================================");
//        System.out.println("================================");
//        System.out.println("================================");
//        System.out.println("================================");
//        System.out.println("================================");
//        System.out.println("================================");
//        System.out.println("================================");
//        System.out.println("================================");



    }

    static void pattern1(int n){

        //outer loop for printing rows of n
        for (int i = 1; i <= n; i++) {

            //inner loop for printing start or columns

            for (int j = 1; j <= n ; j++) {

                System.out.print("* ");
            }

            //for nextLine
            System.out.println();

        }
    }

    static void pattern2(int n){

        //outer loop for rows of n
        for (int i = 1; i <= n; i++) {

            //printing stars

            for (int j = 1; j <= 5; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){

        //outer loop for rows of n
        for (int i = 1; i <= n; i++) {
            
            //printing stars
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){

        //outer loop for rows of n
        for (int i = 1; i <= n; i++) {

            //for printing spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("  ");
            }

            //for printing stars

            for (int j = 1; j <= 4 ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern5(int n){

        //outer loop for rows of n
        for (int i = n; i >= 1; i--) {

            //printing stars

            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){

        //outer loop for rows of n
        for (int i = 1; i <= n; i++) {

            //for printing spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("  ");
            }

            //for printing stars
            for (int j = 1; j <= (i*2)-1 ; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern7(int n){

        //outer loop for rows of n
        for (int i = 1; i <= n; i++) {

            //for printing spaces
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("  ");
            }
//(2*n-2*i+1)
            //for printing stars
            for (int j = 1; j <=  (n-i)*2+1; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){

        //outer loop for rows of n

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 6 ; j++) {

                if(i == 1 || i == n){
                    System.out.print("* ");
                }else{
                    if(j == 1 || j == 6){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void pattern9(int n){

        //outer loop for rows of n
        for (int i = 1; i <= n; i++) {

            //for printing stars
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

    static void pattern10(int n){

        //outer loop for rows of n
        for (int i = 1; i <= n; i++) {

            //for outer spacing
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            //for printing stars
            if(i == 1 || i == n) {
                for (int j = 1; j <= (2 * i - 1); j++) {

                    System.out.print("* ");

                }
            }else{
                System.out.print("* ");
                for (int j = 1; j <= (2*i-3) ; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern11(int n){

        //part1
        //outer loop for rows of n
        for (int i = 1; i <= n; i++) {

            //for printing spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("  ");
            }

            //for printing stars
            for (int j = 1; j <= (i*2)-1 ; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }

        //part2
        //outer loop for rows of n

        for (int i = 1; i <= n; i++) {

            if(i == 1){
                continue;
            }
            //for printing spaces
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("  ");
            }
//(2*n-2*i+1)

            //for printing stars
            for (int j = 1; j <=  (n-i)*2+1; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){

        //part 1
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            //part2
            for (int j = 1; j <= 2*(n-i) ; j++) {
                System.out.print("  ");
            }

            //part3
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }



            System.out.println();

        }

        //part4
        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= (n-i)+1 ; j++) {
                System.out.print("* ");
            }

            //part5
            for (int j = 1; j <= (i*2)-2 ; j++) {
                System.out.print("  ");
            }

            //part6
            for (int j = 1; j <= (n-i)+1 ; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }


    }

    static void pattern13(int n){

        for (int i = 1; i <= n ; i++) {

        }
    }

    static void pattern14(int n){

        for (int i = 1; i <= n ; i++) {

        }
    }

    static void pattern15(int n){

        for (int i = 1; i <= n ; i++) {

        }
    }

    static void pattern16(int n){

        for (int i = 1; i <= n ; i++) {

        }
    }

    static void pattern17(int n){

        for (int i = 1; i <= n ; i++) {

        }
    }

    static void pattern18(int n){

        //outer loop for rows of n
        for (int i = 1; i <= n; i++) {

//            if(i == n){
//                continue;
//            }
            //for outer spacing
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            //for printing stars
            if(i == 1) {
                for (int j = 1; j <= (2 * i - 1); j++) {

                    System.out.print("* ");

                }
            }else{
                System.out.print("* ");
                for (int j = 1; j <= (2*i-3) ; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();

        }


        for (int i = 1; i <= (n-1) ; i++) {

            //for spacing
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }


            if(i == (n-1)){
                System.out.print("* ");
            }else{
                System.out.print("* ");
                for (int j = 1; j <= 2*(n-i)-3 ; j++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
