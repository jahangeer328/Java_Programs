package Sept;

public class Day2 {
    public static void main(String[] args) {

//        int n = 5;
//
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(j + " ");
//
//            }
//            System.out.println();
//        }

//        int n = 5;
//        int count = 1;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(count + " ");
//                count++;
//            }
//            System.out.println();
//        }

        //System.out.println(('A' -1));
       // System.out.println((int) 'A');
//        int n = 5;
//
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= i ; j++) {
//
//                int a = j;
//                int b = ('A' -1);
//                int ans = a+b;
//                char result = (char) ans;
//                System.out.print(result + " ");
//
//            }
//            System.out.println();
//        }

//        int n = 5;
//
//        for (int i = 1; i <= n ; i++) {
//            for (int j =1; j <= i ; j++) {
//                int a = ('E' -j+1);
//                char res = (char) a;
//                System.out.print(res + " ");
//            }
//            System.out.println();
//
//        }

//        int n = 4;
//
//        for (int i = 1; i <= n ; i++) {
//            //spacing
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(j + " ");
//            }
//
//            int row = i;//1,2,3
//            int decrow = row-1;//0,1,2
//            for (int j = 1; j <= i-1 ; j++) {
//                System.out.print(decrow + " ");
//                decrow--;
//            }
//            System.out.println();
//
//        }

//        int n = 4;
//        for (int i = 1; i <= n ; i++) {
//
//            //spacing
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print("  ");
//            }
//
//            //number
//            for (int j = 1; j <= (i*2)-1 ; j++) {
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }


        int n = 4;
        for (int i = 1; i <= n ; i++) {

            //spcaing
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i ; j++) {
                int a = ('A' -1 + j);
                char ans = (char) a;
                System.out.print(ans + " ");
            }

            int row = i;
            int decrow = ('A' -2 + i);
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print((char) decrow +  " ");
                decrow--;
            }
            System.out.println();
        }
    }
}
