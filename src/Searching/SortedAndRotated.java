package Searching;

import java.util.Scanner;

public class SortedAndRotated {
    public static int Solution(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==key)return mid;
            if(arr[mid]>=arr[start]){
                if(arr[start]<=key && key<arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else
                if(arr[mid]<key && key<=arr[end]){
                    start = mid+1;
                }else {
                    end = mid-1;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key/target: ");
        int key = sc.nextInt();
        System.out.println(Solution(arr, key));

    }
}
