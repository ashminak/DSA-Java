package STRIVERSHEET.NumberSystem;

import java.util.Scanner;

public class OctalToDecimal {
    public int Solution(int n){
        int decimal = 0;
        int i =0;
        while (n!=0){
            int rem = decimal%10;
            decimal+=rem*Math.pow(8,i);
            i++;
            n=n/10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        OctalToDecimal o = new OctalToDecimal();
        System.out.println(o.Solution(n));
    }
}
