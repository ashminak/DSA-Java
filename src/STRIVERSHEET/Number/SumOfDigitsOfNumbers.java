package STRIVERSHEET.Number;

import java.util.Scanner;

//public class SumOfDigitsOfNumbers {
//    public int Solution(int n) {
//        while(n>10){
//            int sum=0;
//            while(n>0){
//                sum+=n%10;
//                n=n/10;
//            }
//            n=sum;
//        }
//        return n;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        SumOfDigitsOfNumbers sum = new SumOfDigitsOfNumbers();
//        int result = sum.Solution(n);
//        System.out.println(result);
//    }
//}

public class SumOfDigitsOfNumbers {
    public int Solution(int num){
        if(num==0){
            return 0;
        }
        return 1+(num-1)%9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        SumOfDigitsOfNumbers sum = new SumOfDigitsOfNumbers();
        int result = sum.Solution(n);
        System.out.println(result);
    }

}