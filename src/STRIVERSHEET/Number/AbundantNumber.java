package STRIVERSHEET.Number;

//import java.util.Scanner;
//
//public class AbundantNumber {
//    public void abundantNumber(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                sum += i;
//            }
//        }
//        sum-=n;
//        if(sum>n){
//            System.out.println("ABUNDANT NUMBER");
//        }else {
//            System.out.println("NOT ABUNDANT NUMBER");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        AbundantNumber abundantNumber = new AbundantNumber();
//        abundantNumber.abundantNumber(n);
//    }
//}


import java.util.Scanner;

public class AbundantNumber {
    public void abundantNumber(int n) {
        int sum = 0;
        for (int i = 1; i<=Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    sum += i;
                }else {
                    sum += n / i;
                    sum+=i;
                }
            }
        }
        sum-=n;
        if(sum>n){
            System.out.println("Abundant Number");
        }else {
            System.out.println("Not Abundant Number");
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        AbundantNumber abundantNumber = new AbundantNumber();
        abundantNumber.abundantNumber(n);
    }
}