package STRIVERSHEET.NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public void Solution(int n){
        int[] binary = new int[32];
        int i =0;
        while(n>0){
            binary[i] = n%2;
            i++;
            n=n/2;
        }
        for (int ind= i-1;ind>=0;ind--){
            System.out.print(binary[ind]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        DecimalToBinary obj = new DecimalToBinary();
        obj.Solution(n);
    }
}
