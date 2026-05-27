package STRIVERSHEET.Number;

import java.util.Scanner;

public class AutomorphicNumber {
    public boolean isAutomorphic(int n){
        int sq = n*n;

        while(n>0){
            if(sq%10 != n%10){
                return false;
            }
            sq/=10;
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        AutomorphicNumber a = new AutomorphicNumber();
        if(a.isAutomorphic(n)){
            System.out.println("Automorphic Number");
        }else {
            System.out.println("Not an Automorphic Number");
        }
    }
}
