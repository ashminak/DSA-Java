package STRIVERSHEET.Number;

import java.util.ArrayList;
import java.util.Scanner;

//public class FactorOfANumber {
//    public void Solution(int n){
//        int factor = 0;
//        for (int i = 1; i <= n; i++){
//            if (n % i == 0){
//                System.out.println(i+" ");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        FactorOfANumber f = new FactorOfANumber();
//        f.Solution(n);
//    }
//}


public class FactorOfANumber {
    public ArrayList<Integer> Solution(int n){

        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i*i <= n; i++){
            if (n % i == 0){
                factors.add(i);
                if(i!=n/i){
                    factors.add(n/i);
                }
            }
        }
        return factors;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        FactorOfANumber f = new FactorOfANumber();
        ArrayList<Integer> sol= f.Solution(n);
        for (int i : sol){
            System.out.print(i + " ");
        }
    }
}