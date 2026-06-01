package STRIVERSHEET.NumberSystem;

import java.util.Scanner;

public class OctalToBinary {
    public int OctalToDecimal(int octal){
        int decimal = 0;
        int i =0;
        while (octal!=0){
            int rem = octal%10;
            decimal += rem*Math.pow(8,i);
            i++;
            octal/=10;
        }
        return decimal;
    }
    public int DecimalToBinary(int decimal){
        int binary = 0;
        int i =0;
        while (decimal!=0){
            int rem = decimal%2;
            binary += rem*Math.pow(10,i);
            i++;
            decimal/=2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Octal number to convert to Binary:");
        int octal = sc.nextInt();
        OctalToBinary o = new OctalToBinary();
        int decimal = o.OctalToDecimal(octal);
        System.out.println(o.DecimalToBinary(decimal));
    }
}
