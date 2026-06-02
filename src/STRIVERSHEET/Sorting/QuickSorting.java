package STRIVERSHEET.Sorting;

import Sorting.QuickSort;

import java.util.Scanner;

public class QuickSorting {
    public void QuickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = Solution(arr,low,high);
            QuickSort(arr,low,pi-1);
            QuickSort(arr,pi+1,high);
        }
    }
    public static int Solution(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                Swap(arr,i,j);
            }
        }
        Swap(arr,i+1,high);
        return i+1;
    }
    public static void Swap(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i =0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        QuickSorting quickSort = new QuickSorting();
        quickSort.QuickSort(arr, 0, arr.length-1);

        for(int x: arr) System.out.println(x+" ");
    }
}
