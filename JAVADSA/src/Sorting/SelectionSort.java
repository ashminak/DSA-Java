package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }

    public static void Solution(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int minIdx =i;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            if(minIdx!=i){
                Swap(arr,i,minIdx);
            }
        }
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++) arr[i] = scanner.nextInt();
        Solution(arr);
        for (int e: arr){
            System.out.println(e+" ");
        }
    }
}
