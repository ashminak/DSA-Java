package STRIVERSHEET.Number;

import java.util.Scanner;

//package STRIVERSHEET.Number;
//
//import java.util.Scanner;
//
//public class PerfectNumber {
//    public boolean Solution(int n){
//        int sum=0;
//        for (int i=1;i<n;i++){
//            if(n%i==0){
//                sum+=i;
//            }
//        }
//        return sum==n;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n=sc.nextInt();
//        PerfectNumber p=new PerfectNumber();
//        boolean result=p.Solution(n);
//        System.out.println(result);
//    }
//}
public class PerfectNumber {
    public boolean isPerfectNumber(int n){
        if(n==1) return true;
        int sum=1;
        for(int j=2;j*j<=n;j++){
            if(n%j==0) {
                sum+=j;
                if(j!=n/j){
                    sum+=n/j;
                }
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        PerfectNumber p=new PerfectNumber();
        boolean result=p.isPerfectNumber(n);
        System.out.println(result);
    }
}