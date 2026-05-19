package STRIVERSHEET.Array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageExcludingMinimumAndMaximum {
    public static double average(int[] arr){
        Arrays.sort(arr);
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return (sum -(arr[0]+arr[arr.length-1]))/(arr.length-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        double ans = average(arr);
        System.out.println("average is "+ans);
    }
}
