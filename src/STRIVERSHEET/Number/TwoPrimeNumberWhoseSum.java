package STRIVERSHEET.Number;

import java.util.Scanner;

public class TwoPrimeNumberWhoseSum {
    boolean isPrime(int n){
        for (int i = 2;i<=Math.sqrt(n);i++){
            if (n%i==0)
                return false;
        }
        return true;

    }
    public boolean Solution(int n){
        if(n<=1)return false;
        for (int i=2;i<=n/2;i++ ){
            if(isPrime(i)&&isPrime(n-i)){
                System.out.println(i+"+"+(n-i));
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        TwoPrimeNumberWhoseSum obj = new TwoPrimeNumberWhoseSum();
        System.out.println(obj.Solution(n));
    }
}
