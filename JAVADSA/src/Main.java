////1. Square Hollow Pattern
////public  class Main{
////    public static void pattern(int n){
////        int i,j;
////        //outer loop control the number of rows
////        for(i = 0; i<n; i++){
////            // inner loop control the number of column
////            for(j = 0; j<n;j++){
////                //star will only print  when it is in first row or first column and last row and last column
////                if(i==0||j==0||i==n-1||j==n-1){
////                    System.out.print("*");
////                }
////                else{
////                    System.out.print(" ");
////                }
////            }
////            System.out.println();
////        }
////    }
////    public static void main(String [] args){
////
////        pattern(6);
////    }
////}
////11. Square Fill Pattern
////public class Main {
////    public static void pattern(int n){
////        int i ,j;
////        for(i=0;i<n;i++){
////            for(j=0;j<n;j++){
////                System.out.print("*");
////            }
////            System.out.println("");
////
////        }
////    }
////
////    static void main() {
////        pattern(6);
////    }
////}
////PRACTICE Q
////public class Main{
////    public static void pattern(int n,int k){
////        int i,j;
////        for (i=0; i<n;i++){
////            for (j=0;j<k;j++){
////                if(i==0||i==n-1||j==0||j==k-1){
////                    System.out.print("*");
////                }
////                else{
////                    System.out.print(" ");
////
////                }
////            }
////            System.out.println();
////        }
////    }
////
////    static void main() {
////        pattern(5,7);
////    }
////}
////public class Main{
////    public static void  pattern(int n){
////        int i, j;
////        for (i =0;i<n;i++){
////            for (j =0;j<n;j++){
////                if(j==0||i==n-1||i==j){
////                    System.out.print("*");
////                }
////                else {
////                    System.out.print(" ");
////                }
////            }
////            System.out.println();
////        }
////    }
////
////    static void main() {
////        pattern(5);
////    }
////}
////public class Main {
////    public static void pattern(int n){
////        int i, j;
////        for (i=0;i<n;i++){
////            for (j=0;j<n;j++){
////                if(i==0||i==n-1||j==0||j==n-1||i==j){
////                    System.out.print("*");
////                }else {
////                    System.out.print(" ");
////
////                }
////            }
////            System.out.println();
////        }
////    }
////    static void main() {
////        pattern(6);
////    }
////}
////public class Main {
////    public static void pattern(int n){
////        int i,j;
////        for (i=0;i<n;i++) {
////            for (j=0;j<n;j++){
////                if(i==0||i==n-1||i==n-3||j==0||j==n-1||j==n-3){
////                    System.out.print("*");
////                }else{
////                    System.out.print(" ");
////                }
////            }
////            System.out.println();
////        }
////    }
////    static void main() {
////        pattern(5);
////    }
////}
////public class Main {
////    public static void pattern(int n){
////        int i ,j;
////        for (i=0;i<n;i++){
////            for (j=0;j<n;j++){
////                if(i==0||i==1||i==n-1||i==n-2||j==0||j==n-1||j==1){
////                    System.out.print("*");
////                }else{
////                    System.out.print(" ");
////                }
////            }
////            System.out.println();
////        }
////    }
////    static void main() {
////        pattern(6);
////    }
////}
//
////12. Right Half Pyramid Pattern
////public class Main {
////    public static void pattern(int n){
////        int i,j;
////        for(i=0;i<n;i++){
////            for (j=0;j<i;j++){
////                if(j<i){
////                    System.out.print("* ");
////                }
////            }
////            System.out.println();
////        }
////    }
////
////    static void main() {
////        pattern(6);
////    }
////}
////13. Reverse Right Half Pyramid Pattern
////public class Main {
////    public static void pattern(int n){
////        int i,j;
////        for(i=n;i>0;i--){
////            for (j=0;j<i;j++){
////                if(j<i){
////                    System.out.print("* ");
////                }
////            }
////            System.out.println();
////        }
////    }
////
////    static void main() {
////        pattern(6);
////    }
////}
////14. Left Half Pyramid Pattern
////public class Main {
////    public static void pattern(int n){
////        int i , j;
////        for (i =n; i>=1;i--){
////
////            for (j=1;j<i;j++) {
////                System.out.print(" ");
////              }
////            for (j=0;j<=n-i;j++){
////                    System.out.print("*");
////             }
////            System.out.println();
////
////        }
////    }
////    static void main() {
////        pattern(6);
////    }
////}
////15. Reverse Left Half Pyramid Pattern
////public class Main {
////    public static void pattern(int n){
////        int i , j;
////        for (i =1; i<=n;i++){
////
////            for (j=1;j<i;j++) {
////                System.out.print(" ");
////            }
////            for (j=0;j<=n-i;j++){
////                System.out.print("*");
////            }
////            System.out.println();
////
////        }
////    }
////    static void main() {
////        pattern(6);
////    }
////}
////17 Triangle star pattern
////public class Main {
////    public static void pattern(int n){
////        int i , j;
////        for (i =n; i>=1;i--){ //6,5
////
////            for (j=1;j<i;j++) { //1<6,2<6,3<6,4<5,5<6 ,6<6 f  //0<=6-6, 1<=6-6 f//1<5,2<5,3<5,4<5,5<5f//0<=6-5 1<=6-5
////                System.out.print(" "); //" "" "
////            }                          //" "" "
////            for (j=0;j<=n-i;j++){      //" "" "
////                System.out.print("* ");//" "" "
////            }                          //" "*
////            System.out.println();      //*  *
////
////
////        }
////    }
////    static void main() {
////        pattern(6);
////    }
////}
////
//public class Main {
//    public static void pattern(int n){
//        int i , j,k;
//        for (i =n; i>=1;i--){ //6,5
//
//            for (j=1;j<i;j++) { //1<6,2<6,3<6,4<5,5<6 ,6<6 f  //0<=6-6, 1<=6-6 f//1<5,2<5,3<5,4<5,5<5f//0<=6-5 1<=6-5
//                System.out.print(" "); //" "" "
//            }                          //" "" "
//            for (k=0;k<=n-i;k++){      //" "" "
//                System.out.print("* ");//" "" "
//            }                          //" "*
//            System.out.println();      //*  *
//
//
//        }
//    }
//    static void main() {
//        pattern(6);
//    }
//}

