package STRIVERSHEET.Number;

import java.util.Scanner;

//public class LCM {
//    public int Solution(int a,int b){
//        int max = Math.max(a,b);
//        while (true){
//            if(max%a==0&&max%b==0){
//                return max;
//            }
//            max++;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int a = sc.nextInt();
//        System.out.println("Enter second number: ");
//        int b = sc.nextInt();
//        LCM lcm = new LCM();
//        int result = lcm.Solution(a,b);
//        System.out.println(result);
//    }
//}
public class LCM {
    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public int lcm(int a,int b){
        int gcdValue=gcd(a,b);
        return (a*b/gcdValue);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        LCM lcm = new LCM();
        int result = lcm.lcm(a,b);
        System.out.println(result);
    }
}
