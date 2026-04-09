package SlidingWindow;//package SlidingWindow;
//https://www.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1
//
//import java.util.Scanner;
//
//public class MinSwap {
//    public static int Solution(int[] arr, int k){
//        int n = arr.length;
//        int w=0;
//        for(int x:arr){
//            if (x<=k) w++;
//        }
//        int minSwap= Integer.MAX_VALUE;
//        for(int start=0;start<n-w;start++){
//            int bad =0;
//            for(int i=start;i<start+w;i++){
//                if(arr[i]>k)bad++;
//            }
//            minSwap=Math.min(bad,minSwap);
//        }
//        return minSwap;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array size: ");
//        int n = scanner.nextInt();
//        int[] arr= new int[n];
//        System.out.println("Enter array elements: ");
//        for (int i=0;i<n;i++) arr[i] = scanner.nextInt();
//        System.out.println("Enter the k element: ");
//        int k = scanner.nextInt();
//        System.out.println(Solution(arr,k));
//    }
//}

import java.util.Scanner;

public class MinSwap {
    public static int Solution(int [] arr, int k){
        int n = arr.length;
        int w=0;
         for(int x:arr){
             if(x<=k) w++;
         }
         int bad=0;
         for (int i=0;i<w;i++){
             if(arr[i]>k) bad++;
         }
         int minSwap = bad;
         int i=0;
         int j=w;
         while (j<n){
             if(arr[j]>k) bad++;
             if(arr[i]>k) bad--;
             minSwap=Math.min(minSwap,bad);
             j++;
             i++;
         }
         return minSwap;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
         int n = scanner.nextInt();
         int[] arr = new int[n];
        System.out.println("Enter array elements: ");
         for(int i=0;i<n;i++) arr[i]= scanner.nextInt();
        System.out.println("Enter k element: ");
         int k= scanner.nextInt();
        System.out.println(Solution(arr,k));
    }
}