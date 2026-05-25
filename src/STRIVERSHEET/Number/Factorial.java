package STRIVERSHEET.Number;

import java.util.Scanner;

//public class Factorial {
//    public int solution(int n){
//        int fact=1;
//        for (int i=1;i<=n;i++) {
//            fact=fact*i;
//        }
//        return fact;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        Factorial obj=new Factorial();
//        int result=obj.solution(n);
//        System.out.println(result);
//    }
//}


public class Factorial{
    public int solution(int n){
        if(n==0){
            return 1;
        }

        return n*solution(n-1);
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        Factorial obj=new Factorial();
        int result=obj.solution(n);
        System.out.println(result);
    }
}
