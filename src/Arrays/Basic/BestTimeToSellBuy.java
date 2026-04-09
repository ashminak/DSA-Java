package Arrays.Basic;//package Arrays.Basic;
//
import java.util.*;
//
//public class BestTimeToSellBuy {
//
//    public static int maxProfit(int prices[]){
//        int maxProfit=0;
//        for(int i=0;i<prices.length;i++){
//            for(int j=i+1;j<prices.length;j++){
//                int profit= prices[j]-prices[i];
//                maxProfit=Math.max(maxProfit,profit);
//            }
//        }
//        return maxProfit;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your input: ");
//        int n = scanner.nextInt();
//        int prices[] = new int[n];
//        for (int i=0;i<n;i++){
//            System.out.println("Enter your input: ");
//            prices[i]=scanner.nextInt();
//        }
//
//        System.out.print(maxProfit(prices));
//    }
//}


import java.lang.reflect.Array;
import java.util.Scanner;

//import java.util.Scanner;
//
//public class BestTimeToSellBuy {
//    public static int MaxProfit(int prices[]){
//        int mini= prices[0];
//        int maximumProfit= 0;
//
//        for (int i =1;i<prices.length;i++){
//            int diff=prices[i]-mini;
//            maximumProfit=Math.max(diff,maximumProfit);
//            mini=Math.min(mini,prices[i]);
//        }
//        return maximumProfit;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your total number of input: ");
//        int n = scanner.nextInt();
//        int prices[]=new int[n];
//        for (int i=0;i<n;i++){
//            System.out.println("Enter your each Input: ");
//            prices[i]= scanner.nextInt();
//        }
//        System.out.println(MaxProfit(prices));
//
//    }
//}
//public class BestTimeToSellBuy {
//    public static long Solution(long[]arr,int n,int m){
//        Arrays.sort(arr);
//        long num=Long.MAX_VALUE;
//
//        for (int i=0;i<n-m;i++){
//            long diff=arr[i+m-1]-arr[i];
//            num=Math.min(num,diff);
//        }
//        return num;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Enter array length: ");
//        int n= scanner.nextInt();
//        long []arr= new long[n];
//        System.out.println(" Enter array elements: ");
//        for (int i=0;i<n;i++) arr[i]= scanner.nextInt();
//        System.out.println("Enter m elements: ");
//        int m = scanner.nextInt();
//        System.out.println(Solution(arr,n,m));
//    }
//}

public class BestTimeToSellBuy {
    public static long Solution(long []arr,int n,int m){
        Arrays.sort(arr);

        int start=0;
        int end=m-1;
        long num=Long.MAX_VALUE;

        while (end<n){
            long diff=arr[end]-arr[start];
            num= Math.min(diff,num);
            start++;
            end++;
        }
        return num;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n= scanner.nextInt();
        long[] arr= new long[n];
        System.out.println(" Enter array elements: ");
        for (int i=0;i<n;i++)arr[i]= scanner.nextInt();
        System.out.println("Enter m elements: ");
        int m= scanner.nextInt();
        System.out.println(Solution(arr,n,m));
    }
}























