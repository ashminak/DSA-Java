package STRIVERSHEET.Sorting;

import java.util.Scanner;

public class selectionSorting {
    public void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        selectionSorting obj = new selectionSorting();
        obj.selectionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
