package STRIVERSHEET.Number;

import java.util.Scanner;

public class PowerOfTwo {
    public boolean Solution(int n){
        if(n>0 && (n&(n-1))==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        PowerOfTwo p = new PowerOfTwo();
        boolean result = p.Solution(n);
        System.out.println(result);
    }
}
