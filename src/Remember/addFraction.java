package Remember;//package out.production.JAVADSA; ////Bruteforce Approach
//////package out.production.JAVADSA;
//////
//////import java.util.Scanner;
//////
//////public class addFraction {
//////
//////    static void addFractionBrute(int num1,int den1,int num2,int den2){
//////
//////        int numResult= (num1*den2)+(num2*den1);
//////        int denResult= den1*den2;
//////
//////        for(int i=2; i<=Math.min(numResult,denResult);i++){
//////                while (numResult%i==0&&denResult%i==0){
//////                    numResult/=i;
//////                    denResult/=i;
//////                }
//////        }
//////        System.out.println(numResult+"/"+denResult);
//////
//////    }
//////
//////    static void main(String[] args) {
//////        Scanner scanner= new Scanner(System.in);
//////        System.out.println("Enter your first input: ");
//////        int num1=scanner.nextInt();
//////        System.out.println("Enter your second input: ");
//////        int den1= scanner.nextInt();
//////        System.out.println("Enter your third input: ");
//////        int num2= scanner.nextInt();
//////        System.out.println("Enter your fourth input: ");
//////        int den2= scanner.nextInt();
//////        addFractionBrute( num1,den1,num2,den2);
//////    }
//////}
////
////
//////Optimal Approach
////package out.production.JAVADSA;
////
////import java.sql.SQLOutput;
////import java.util.Scanner;
////
////public class addFraction{
////    static int gcd(int a,int b){
////        if(b==0)return a;
////        return gcd(b,a%b);
////    }
////
////    static void addFractionOptimal(int num1,int den1,int num2,int den2){
////        int numResult=(num1*den2)+(num2*den1);
////        int denResult=den1*den2;
////
////        int g=gcd(numResult,denResult);
////
////        numResult/=g;
////    denResult/=g;
////        System.out.println(numResult+"/"+denResult);
////    }
////
////    static void main(String[] args) {
////        Scanner scanner= new Scanner(System.in);
////        System.out.println("Enter your first input: ");
////        int num1= scanner.nextInt();
////        System.out.println("Enter your second input: ");
////        int den1= scanner.nextInt();
////        System.out.println("Enter your third input: ");
////        int num2= scanner.nextInt();
////        System.out.println("Enter your fourth input: ");
////        int den2= scanner.nextInt();
////        addFractionOptimal(num1,den1,num2,den2);
////    }
////
////}
import com.sun.source.tree.BreakTree;

import java.util.Scanner;
//////
//////Brute      O(min(num,den))      O(1)
//////Optimal    O(log(min(num,den))) O(log(min))
//
//
//import java.util.Scanner;
//public class addFraction {
//    public static void solution(int num1,int den1,int num2,int den2){
//        int numResult=(num1*den2)+(num2*den1);
//        int denResult=(den1*den2);
//
//        for(int i=2;i<=Math.min(numResult,denResult);i++){
//            while (numResult%i==0&&denResult%i==0){
//                numResult/=i;
//                denResult/=i;
//            }
//        }
//        System.out.println(numResult+"/"+denResult);
//
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first numerator: ");
//        int num1= scanner.nextInt();
//        System.out.println("Enter first denominator: ");
//        int den1= scanner.nextInt();
//        System.out.println("Enter second numerator: ");
//        int num2= scanner.nextInt();
//        System.out.println("Enter second denominator: ");
//        int den2= scanner.nextInt();
//        solution(num1,den1,num2,den2);
//    }
//}

//public class addFraction {
//    public static int gcd(int a, int b){
//        if(b==0)return a;
//        return gcd(b,a%b);
//    }
//    public static void solution(int num1, int den1, int num2, int den2){
//        int numResult =(num1*den2)+(num2*den1);
//        int denResult =(den1*den2);
//
//        int g= gcd(numResult,denResult);
//        numResult/=g;
//        denResult/=g;
//        System.out.println(numResult+"/"+denResult);
//    }
//
//    static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//
//        System.out.println("Enter first numerator: ");
//        int num1= scanner.nextInt();
//        System.out.println("Enter first denominator: ");
//        int den1= scanner.nextInt();
//        System.out.println("Enter second numerator: ");
//        int num2= scanner.nextInt();
//        System.out.println("Enter second denominator: ");
//        int den2= scanner.nextInt();
//
//        solution(num1,den1,num2,den2);
//    }
//}

//Whenever fraction problem:
//
//THINK:
//Step 1: Use cross multiplication
//        num = (n1×d2) + (n2×d1)
//den = d1 × d2
//
//Step 2: Simplify using GCD
//num /= gcd
//den /= gcd

//public class addFraction {
//    public static void  Solution(int num1,int den1,int num2,int den2){
//        int numResult=(num1*den2)+(num2*den1);
//        int denResult=(den1*den2);
//
//        for(int i=0;i<=Math.min(denResult,numResult);i++){
//            if(numResult%i==0&&denResult%i==0){
//                numResult/=i;
//                denResult/=i;
//            }
//        }
//        System.out.println(denResult+"/"+numResult);
//
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int den1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int den2 = scanner.nextInt();
//
//        Solution(num1,den1,num2,den2);
//    }
//}

public class addFraction {
    public static int gcd(int a, int b) {
        if (b ==0) return a;
        return gcd(b,a%b);
    }

    public static void Solution(int num1, int den1, int num2, int den2) {
        int numResult = (num1 * den2) + (num2 * den1);
        int denResult = (den1 * den2);

        int g = gcd(numResult, denResult);
        numResult /= g;
        denResult /= g;
        System.out.println(numResult+"/"+denResult);
    }

    static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num1= scanner.nextInt();
        System.out.println("Enter your number: ");
        int den1= scanner.nextInt();
        System.out.println("Enter your number: ");
        int num2= scanner.nextInt();
        System.out.println("Enter your number: ");
        int den2= scanner.nextInt();
        Solution(num1,den1,num2,den2);
    }
}
