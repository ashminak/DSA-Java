package STRIVERSHEET.Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//package STRIVERSHEET.Number;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class PrimeNumbersInRange {
//    public List<Integer> Solution(int a, int b) {
//        int limit =(int) Math.sqrt(b);
//        boolean[] isPrime = new boolean[limit+1];
//        Arrays.fill(isPrime, true);
//        for (int i = 2; i*i <= limit; i++) {
//            if(isPrime[i]){
//                for (int j = i*i; j <= limit; j += i) {
//
//                    isPrime[j]=false;
//                }
//            }
//
//
//        }
//        ArrayList<Integer> smallPrimes = new ArrayList<>();
//        for (int i = 2; i <= limit; i++) {
//            if (isPrime[i]) {
//                smallPrimes.add(i);
//            }
//        }
//        boolean[] inRange = new boolean[b-a+1];
//        Arrays.fill(inRange, true);
//        for (int p : smallPrimes) {
//            int start = Math.max(p*p,((a+p-1)/p)*p);
//            for (int i = start; i <= b; i+=p) {
//             inRange[i-a] = false;
//            }
//        }
//        ArrayList<Integer> result = new ArrayList<>();
//        for (int i = 1; i < inRange.length; i++) {
//            if (inRange[i] && (i+a)>1) {
//                result.add(i+a);
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter start range: ");
//        int a = sc.nextInt();
//        System.out.println("Enter end range: ");
//        int b = sc.nextInt();
//        PrimeNumbersInRange p = new PrimeNumbersInRange();
//        List<Integer> result = p.Solution(a, b);
//        System.out.println(result);
//    }
//}
public class PrimeNumbersInRange{
    boolean isPrime(int n){
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }
        }
        return count==2;
    }
    public ArrayList<Integer> primeNumbers(int start,int end){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start range: ");
        int a = sc.nextInt();
        System.out.println("Enter end range: ");
        int b = sc.nextInt();
        PrimeNumbersInRange p = new PrimeNumbersInRange();
        List<Integer> result = p.primeNumbers(a, b);
        System.out.println(result);
    }

}
