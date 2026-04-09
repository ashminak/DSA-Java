//https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1
package Remember;//package out.production.JAVADSA;
//// Function to calculate the nth Remember.Fibonacci number modulo 1000000007
////Bruteforce
//
//import java.util.Scanner;
//
//public class Remember.Fibonacci {
//    static final int MOD= 1000000007;
//
//    public static int nthFibonacci(int n){
//        if(n==0)return 0;
//        if(n==1)return 1;
//
//        return(nthFibonacci(n-1)+nthFibonacci(n-2)%MOD);
//
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your number: ");
//        int n = scanner.nextInt();
//        System.out.println(nthFibonacci(n));
//    }
//}

import java.util.Scanner;

public class Fibonacci {
    static final int MOD= 1000000007;

    public static int nthFibonacci(int n){
       if(n<=1)return n;
       int a=0;
       int b=1;
       for(int i=2;i<=n;i++){
           int c =(a+b)%MOD;
           a=b;
           b=c;
       }
       return b;

    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        System.out.println(nthFibonacci(n));
    }
}


//Approach   Time    Space
//─────────────────────────
//Brute      O(2^n)  O(n)
//Optimal    O(n)    O(1)
//        ```