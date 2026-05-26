package STRIVERSHEET.Number;

import java.util.ArrayList;
import java.util.Scanner;

//public class PrimeFactors {
//    public boolean Solution(int n) {
//        int count = 0;
//        for (int i =1;i*i<=n;i++) {
//            if (n%i==0) {
//                count++;
//                if(i!=n/i){
//                    count++;
//                }
//            }
//        }
//        return count==2;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = sc.nextInt();
//        PrimeFactors pf = new PrimeFactors();
//
//        System.out.println(pf.Solution(n));
//    }
//}

public class PrimeFactors {
    public ArrayList<Integer> primeFactors(int n){
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if(n%2==0){
            primeFactors.add(2);
            while (n%2==0){
                n=n/2;
            }
        }
        for(int i=3;i*i<=n;i+=2){
            while(n%i==0){
                primeFactors.add(i);
                while(n%i==0){
                    n=n/i;
                }
            }
        }
        if(n>2){
            primeFactors.add(n);
        }
        return primeFactors;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        PrimeFactors primeFactors = new PrimeFactors();
       ArrayList<Integer> ans= primeFactors.primeFactors(n);
       for(int i:ans){
           System.out.print(i+" ");
       }

    }
}