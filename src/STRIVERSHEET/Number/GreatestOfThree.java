package STRIVERSHEET.Number;

import java.util.Scanner;

//public class GreatestOfThree {
//    public int Solution(int n1,int n2,int n3){
//        int num1 =n1;
//        int num2=n2;
//        int num3=n3;
//        return Math.max(num1,Math.max(num2,num3));
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int n1 = sc.nextInt();
//        System.out.println("Enter second number: ");
//        int n2 = sc.nextInt();
//        System.out.println("Enter third number: ");
//        int n3 = sc.nextInt();
//        GreatestOfThree g = new GreatestOfThree();
//        int result = g.Solution(n1,n2,n3);
//        System.out.println(result);
//    }
//}
public class GreatestOfThree {
    public void Solution(int n1, int n2, int n3) {
        if(n1 > n2 && n1 > n3) {
            System.out.println("Greatest of three is " + n1);
        }else if(n2 > n1 && n2 > n3) {
            System.out.println("Greatest of three is " + n2);
        }else {
            System.out.println("Greatest of three is " + n3);
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int n3 = sc.nextInt();
        GreatestOfThree g = new GreatestOfThree();
        g.Solution(n1,n2,n3);

    }
}
