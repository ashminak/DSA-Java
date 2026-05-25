package STRIVERSHEET.Number;

import java.util.Scanner;
//
//public class ReverseNumber {
//    public int Solution(int n){
//        int revNum=0;
//        while(n>0){
//            int rem=n%10;
//            revNum=revNum*10+rem;
//            n=n/10;
//        }
//        return revNum;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        ReverseNumber obj=new ReverseNumber();
//        int result=obj.Solution(n);
//        System.out.println(result);
//    }
//}

public class ReverseNumber {
    public int Solution(int n){
        int revNum =0;
        while(n!=0){
            int rem = n%10;
            if(revNum>Integer.MAX_VALUE/10||revNum<Integer.MIN_VALUE/10){
                return 0;
            }
            revNum=revNum*10+rem;
            n=n/10;
        }
        return revNum;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        ReverseNumber obj=new ReverseNumber();
        int result=obj.Solution(n);
        System.out.println(result);
    }
}
