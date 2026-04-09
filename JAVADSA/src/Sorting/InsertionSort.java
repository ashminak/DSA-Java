package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void Solution(int[] arr){
        int n = arr.length;
        for (int i =1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0&&key<arr[j]){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] =key;
        }
    }
    static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i =0;i<n;i++) arr[i] = scanner.nextInt();
        Solution(arr);
        for (int e : arr){
            System.out.print(e+" ");
        }
    }
}
