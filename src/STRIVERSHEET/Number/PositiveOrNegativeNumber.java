package STRIVERSHEET.Number;//package STRIVERSHEET.Number;
//
//import java.util.Scanner;
//
//public class PositiveOrNegativeNumber {
//    public void Solution(int n){
//        if(n>=0){
//            System.out.println(n+" is Positive Number");
//        }else {
//            System.out.println(n+" is Negative Number");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number: ");
//        int n = sc.nextInt();
//        PositiveOrNegativeNumber p = new PositiveOrNegativeNumber();
//        p.Solution(n);
//    }
//}

import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public void Solution(int n){
        if(n<<31==0){
            System.out.println(n+" is a positive number");
        }else {
            System.out.println(n+" is not a positive number");
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        PositiveOrNegativeNumber p = new PositiveOrNegativeNumber();
        p.Solution(n);
    }

}