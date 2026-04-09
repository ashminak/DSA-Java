package Arrays.Basic;//package Arrays.Basic;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ChocolateDistribution {
//    public static long solution(long[] a, int n, int m){
//        Arrays.sort(a);
//        long ans=Long.MAX_VALUE;
//
//        for(int i=0;i<=n-m;i++){
//            long diff = a[i+m-1]-a[i];
//            ans=Math.min(ans,diff);
//        }
//        return  ans;
//
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter input : ");
//        int n= scanner.nextInt();
//
//        long [] a= new long[n];
//        for (int i =0;i<n;i++){
//            System.out.println("Enter input: ");
//            a[i]= scanner.nextLong();
//        }
//        System.out.println("Enter input: ");
//        int m= scanner.nextInt();
//
//        System.out.println(solution(a,n,m));
//    }
//}

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {
    public static long solution(long[] a,int n, int m){

        Arrays.sort(a);
        int start =0;
        int end= m-1;
        long ans=Long.MAX_VALUE;
        while(end<n){
            long diff=a[end]-a[start];
            ans=Math.min(ans,diff);
            start++;
            end++;
        }
        return ans;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input: ");
        int n = scanner.nextInt();
        long[] a= new long[n];
        for(int i=0;i<n;i++){
          
            a[i]=scanner.nextLong();
        }
        System.out.println("Enter your input: ");
        int m = scanner.nextInt();
        System.out.println(solution(a,n,m));
    }


}