package STRIVERSHEET.Number;

import java.util.Scanner;

public class ProgramToAddTwoFraction {
    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public void Solution(int num1,int den1,int num2,int den2) {
        int lcm = (den1 * den2) / gcd(den1, den2);
        int newNum1 = num1 * (lcm / den1);
        int newNum2 = num2 * (lcm / den2);

        int resultNum = newNum1 + newNum2;
        int resultDen = lcm;

        int common = gcd(resultNum, resultDen);
        resultNum /= common;
        resultDen /= common;
        System.out.println("Result: " + resultNum + "/" + resultDen);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerator1 Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Denominator1 Number: ");
        int den1 = sc.nextInt();
        System.out.println("Enter Numerator2 Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Denominator2 Number: ");
        int den2 = sc.nextInt();
        ProgramToAddTwoFraction obj = new ProgramToAddTwoFraction();
        obj.Solution(num1, den1, num2, den2);
        sc.close();
        System.out.println("Result: " + obj.gcd(num1, num2));

    }
}
