package STRIVERSHEET.Number;

import java.util.Arrays;
import java.util.Scanner;
//
//public class FibonacciSeries {
//    static final int MOD = 1000000007;
//    int[] dp;
//    public int solution(int N) {
//        if(N==0) return 0;
//        if(N==1) return 1;
//        if(dp[N]!=-1){
//            return dp[N];
//        }
//        dp[N]=(solution(N-1)+solution(N-2))%MOD;
//        return dp[N];
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        FibonacciSeries obj=new FibonacciSeries();
//        obj.dp=new int[n+1];
//        Arrays.fill(obj.dp,-1);
//        for (int i=1;i<=n;i++) {
//            System.out.println(obj.solution(i)+" ");
//        }
//
//    }
//}
public class FibonacciSeries {
    static final int MOD = 1000000007;
    public int solution(int N) {
        if(N==0)
            return 0;
        if(N==1)
            return 1;
        int a = 0;
        int b = 1;
        for (int i =2;i<=N;i++){
            int c=(a+b)%MOD;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        FibonacciSeries obj=new FibonacciSeries();
        for (int i=0;i<=n;i++) {
            System.out.print(obj.solution(i)+" ");
        }
    }
}
