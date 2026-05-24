package STRIVERSHEET.Number;

import java.util.Scanner;

//public class LeapYear {
//    public boolean Solution(int n){
//        if(n%400==0){
//           return true;
//        }
//        if(n%100==0){
//            return false;
//        }
//        if(n%4==0){
//            return true;
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter year: ");
//        int year = sc.nextInt();
//        LeapYear l = new LeapYear();
//
//        System.out.println(l.Solution(year));
//    }
//}

public class LeapYear {
    public void Solution(int year){
        if(year%400==0||year%4==0&&year%100!=0){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a leap year");
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter year: ");
            int year = sc.nextInt();
            LeapYear l = new LeapYear();
            l.Solution(year);
        }
}
