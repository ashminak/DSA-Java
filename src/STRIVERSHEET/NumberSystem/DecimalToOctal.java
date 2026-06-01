package STRIVERSHEET.NumberSystem;

import java.util.Scanner;

public class DecimalToOctal {
    public String solution(int octal) {
        if(octal == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int n = octal;
        while(n>0){
            int digit = n%8;
            sb.insert(0, digit);
            n = n/8;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        DecimalToOctal obj = new DecimalToOctal();
        String s = obj.solution(n);
        System.out.println(s);
    }
}
