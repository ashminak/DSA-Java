package STRIVERSHEET.Number;

import java.util.Scanner;

//public class GCD {
//    public int Solution(int a,int b){
//        int gcd=1;
//        for(int i =1;i<=Math.min(a,b);i++){
//            if(a%i==0&&b%i==0){
//                gcd=i;
//            }
//        }
//        return gcd;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter first Number: ");
//        int a=sc.nextInt();
//        System.out.println("Enter second Number: ");
//        int b=sc.nextInt();
//        GCD gcd=new GCD();
//        int result=gcd.Solution(a,b);
//        System.out.println("GCD is "+result);
//    }
//}
public class GCD {
    public long Sum(long a, long b){
        if(b==0){
            return a;
        }
        return Sum(b,a%b);
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        long a=sc.nextInt();
        System.out.println("Enter second Number: ");
        long b=sc.nextInt();
        GCD gcd=new GCD();
        long result=gcd.Sum(a,b);
        System.out.println("GCD is "+result);
    }
}
