package src.Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = Solution(arr, low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static int Solution(int[] arr, int low , int high){
        int pivortEle = arr[high];
        int i =low-1;
        for(int j = low;j<high;j++){
            if(arr[j]<pivortEle){
                i++;
                Swap(arr,i,j);
            }
        }
        Swap(arr,i+1,high);
        return i+1;
    }

    public static void Swap(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i =0;i<n;i++) arr[i] = scanner.nextInt();
        quickSort(arr,0,n-1);

        for(int x: arr) System.out.println(x+" ");
    }
}
