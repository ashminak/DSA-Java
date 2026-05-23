package STRIVERSHEET.Number;

import java.util.Scanner;

public class ArmstrongNumber {
    public boolean Solution(int n){
        int k = String.valueOf(n).length();
        int sum=0;
        int dup =n;
        while (n>0){
            int id = n%10;
            sum+=Math.pow(id,k);
            n=n/10;
        }
       return sum==dup;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        ArmstrongNumber a=new ArmstrongNumber();
        boolean result=a.Solution(n);
        System.out.println(result);
    }
}
