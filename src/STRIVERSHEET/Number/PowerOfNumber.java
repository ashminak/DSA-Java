package STRIVERSHEET.Number;

import java.util.Scanner;
//
//public class PowerOfNumber {
//    public int solution(int x,int n){
//        int ans=1;
//        for (int i=1;i<=n;i++){
//            ans=ans*x;
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        System.out.println("Enter a number: ");
//        int x=sc.nextInt();
//        PowerOfNumber obj=new PowerOfNumber();
//        int ans=obj.solution(n,x);
//        System.out.println(ans);
//    }
//}

public class PowerOfNumber {
    public double solution(double x,int n){
        double ans = 1;
        if(x==0||x==1){
            return x;
        }
        while(n<0){
            x=1/x;
            n=-(n+1);
            ans=ans*x;
        }
        while(n>0){
            if(n%2==1){
                ans=ans*x;
                n=n-1;
            }else {
                n=n/2;
                x=x*x;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n=sc.nextInt();
        System.out.println("Enter a number: ");
        int x=sc.nextInt();
        PowerOfNumber obj=new PowerOfNumber();
        System.out.println(obj.solution(n,x));

    }
}
