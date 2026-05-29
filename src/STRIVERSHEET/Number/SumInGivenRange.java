package STRIVERSHEET.Number;

import java.util.Scanner;

//public class SumInGivenRange {
//    public int SumInGivenRange(int start, int end) {
//        int sum = 0;
//        for (int i = start; i <= end; i++) {
//            sum += i;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the start number: ");
//        int start = sc.nextInt();
//        System.out.println("Enter the end number: ");
//        int end = sc.nextInt();
//        SumInGivenRange s = new SumInGivenRange();
//        System.out.println("The sum is " + s.SumInGivenRange(start, end));
//    }
//}
public class SumInGivenRange {
    public int SumInGivenRange(int start, int end) {
        return (end*(end+1))/2-((start-1)*start)/2;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int start = sc.nextInt();
        System.out.println("Enter the end number: ");
        int end = sc.nextInt();
        SumInGivenRange s = new SumInGivenRange();
        System.out.println("The sum is " + s.SumInGivenRange(start, end));
    }

}