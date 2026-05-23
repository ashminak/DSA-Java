package STRIVERSHEET.Number;//package STRIVERSHEET.Number;
//
//import java.util.Scanner;
//
//public class OddOrEvenNumber {
//    public int reminder(int n){
//        return n%2;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = sc.nextInt();
//        OddOrEvenNumber o = new OddOrEvenNumber();
//        if(o.reminder(n)==0){
//            System.out.println("Even number");
//        }else {
//            System.out.println("Odd number");
//        }
//    }
//}

import java.util.Scanner;

public class OddOrEvenNumber {
    public int reminder(int n){
        return n&1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        OddOrEvenNumber o = new OddOrEvenNumber();
        if(o.reminder(n)==0){
            System.out.println(o+" is even number");
        }else {
            System.out.println(o+" is odd number");
        }
    }
}