package STRIVERSHEET.Number;

import java.util.Arrays;
import java.util.Scanner;

public class AllPrimeNumbersLessThanNumber {
    public int Solution(int n){
        if(n<2)return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i*i<n;i++){
            for (int j=i*i;j<n;j+=i){
                if(isPrime[j]){
                    isPrime[j]=false;
                }
            }
        }
        int count = 0;
        for (boolean b:isPrime){
            if (b){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        AllPrimeNumbersLessThanNumber p = new AllPrimeNumbersLessThanNumber();
        int ans =  p.Solution(n);
        System.out.println(ans);
    }
}
