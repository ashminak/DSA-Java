package STRIVERSHEET.Number;

import java.util.Scanner;
//
//public class GreatestOfTwoNumbers {
//    public int Solution(int n1 , int n2){
//        int num1 = n1;
//        int num2 = n2;
//        return Math.max(num1,num2);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int n1 = sc.nextInt();
//        System.out.println("Enter second number: ");
//        int n2 = sc.nextInt();
//        GreatestOfTwoNumbers obj = new GreatestOfTwoNumbers();
//        int result = obj.Solution(n1,n2);
//        System.out.println(result);
//    }
//}
public class GreatestOfTwoNumbers {
    public void Solution(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(n1 + " is greatest");
        } else {
            System.out.println(n2 + " is greatest");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        GreatestOfTwoNumbers obj = new GreatestOfTwoNumbers();
        obj.Solution(n1, n2);
    }
}
