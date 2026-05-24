package STRIVERSHEET.Number;

import java.util.Scanner;
//
//public class SumOfNNaturalNumbers {
//    public int sum(int n){
//        int sum = 0;
//        for(int i =0;i<n;i++){
//            sum+=i;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = sc.nextInt();
//        SumOfNNaturalNumbers s = new SumOfNNaturalNumbers();
//        System.out.println("The sum of natural numbers is "+s.sum(n));
//    }
//
//}
//public class SumOfNNaturalNumbers {
//    public int sumOfNNaturalNumbers(int n) {
//        return n * (n + 1) / 2;
//    }
//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = sc.nextInt();
//        SumOfNNaturalNumbers s = new SumOfNNaturalNumbers();
//        System.out.println("The sum of natural numbers is "+s.sumOfNNaturalNumbers(n));
//    }
//}
public class SumOfNNaturalNumbers {
    public int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        SumOfNNaturalNumbers s = new SumOfNNaturalNumbers();
        System.out.println("The sum of natural numbers is "+s.sum(n));
    }
}
