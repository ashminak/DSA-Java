//https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1
package SlidingWindow;//package SlidingWindow;

import java.util.Scanner;

public class MinimizeSubarray {
    public static int Solution(int[] arr, int target){
        int n= arr.length;
        int minLength = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>target){
                    minLength=Math.min(minLength,j-i+1);
                    break;
                }
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++) arr[i]= scanner.nextInt();
        System.out.println("Enter target value: ");
        int target = scanner.nextInt();
        System.out.println(Solution(arr,target));
    }
}
//ComplexityWhy?⏱ TimeO(N²)Two nested loops — start and end pointers🗂 SpaceO(1)Only a few variables used

//import java.util.Scanner;
//
//public class MinimizeSubarray {
//    public static int Solution(int[] arr, int target){
//        int start =0;
//        int sum=0;
//        int minLength = Integer.MAX_VALUE;
//        int n = arr.length;
//
//        for (int end =0;end<n;end++){
//            sum+=arr[end];
//            while (sum>target){
//                minLength=Math.min(minLength,end-start+1);
//                sum-=arr[start];
//                start++;
//            }
//        }
//        return minLength==Integer.MAX_VALUE?0:minLength;
//    }
//
//        static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array size: ");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter array elements: ");
//        for (int i=0;i<n;i++) arr[i]= scanner.nextInt();
//        System.out.println("Enter target value: ");
//        int target = scanner.nextInt();
//        System.out.println(Solution(arr,target));
//    }
//}

//Time	O(n)	O(n)
//Space	O(n)	O(1)