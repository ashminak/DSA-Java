package STRIVERSHEET.Number;

import java.util.Scanner;

//public class PrimeNumber {
//    public boolean Solution(int n){
//        int count =0;
//        for(int i =1;i<=n;i++){
//            if(n%i==0){
//
//            }
//        }
//        if (count==2){
//            return true;
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = sc.nextInt();
//        PrimeNumber p = new PrimeNumber();
//        boolean result = p.Solution(n);
//        System.out.println(result);
//    }
//}

public class PrimeNumber {
    public boolean isPrime(int n){
        int count =0;
        for (int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }

        }
        return count==2;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        PrimeNumber p = new PrimeNumber();
        boolean result = p.isPrime(n);
        System.out.println(result);
    }
}
