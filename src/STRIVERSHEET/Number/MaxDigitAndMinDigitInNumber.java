package STRIVERSHEET.Number;

import java.util.Scanner;

public class MaxDigitAndMinDigitInNumber {
    public void Solution(int n){
        int maxDigit=0,minDigit=0;
        while(n>0){
            int digit=n%10;
            if(digit>maxDigit){
                maxDigit=digit;
            }
            if(digit<minDigit){
                minDigit=digit;
            }
            n=n/10;
        }
        System.out.println("Maximum digit is "+maxDigit);
        System.out.println("Minimum digit is "+minDigit);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        MaxDigitAndMinDigitInNumber obj=new MaxDigitAndMinDigitInNumber();
        obj.Solution(n);
    }
}
