package Arrays.Basic;//package Arrays.Basic;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class MiddleNum {
//    public static int Solution(int a,int b,int c){
//        int[] arr={a,b,c};
//
//        Arrays.sort(arr);
//
//        return arr[1];
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int a= scanner.nextInt();
//        System.out.println("Enter second number: ");
//        int b= scanner.nextInt();
//        System.out.println("Enter third number: ");
//        int c= scanner.nextInt();
//
//        System.out.println(Solution(a,b,c));
//    }
//}


import java.util.Scanner;

public class MiddleNum {
    public static int Solution(int a, int b, int c){
        if((a<=b&&b<=c)||(a>=b&&b>=c)){
            return b;
        }else if((a<=c&&c<=b)||(a>=c&&c>=b)){
            return c;
        }else {
            return a;
        }
    }

    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();
        System.out.println(Solution(a,b,c));
    }
}
//
//Brute ForceOptimal TimeO(1) O(1) SpaceO(1) O(1)