package STRIVERSHEET.Number;

import java.util.Scanner;

public class ClosestDivisor {
    public int[] Solution(int n){
        for(int a =(int)Math.sqrt(n+2);a>0;--a){
            if((n+1)%a==0){
                return new int[]{a,(n+1)/a};
            }
            if((n+2)%a==0){
                return new int[]{a,(n+2)/a};
            }
        }
        return new  int[]{};
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        ClosestDivisor cd = new ClosestDivisor();
        int[]x =cd.Solution(n);
        for (int i : x){
            System.out.print("The closest divisor is "+i+" ");
        }

    }
}
