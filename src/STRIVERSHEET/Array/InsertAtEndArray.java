package STRIVERSHEET.Array;

import java.util.Scanner;

public class InsertAtEndArray {
    public int[] Solution(int[] arr, int x){
        int[] ans = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        ans[arr.length]=x;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to insert at beginning: ");
        int x = sc.nextInt();
        InsertAtBeginningArray obj = new InsertAtBeginningArray();
        int[] tem= obj.Solution(arr,x);
        for (int i : tem) {
            System.out.print(i+" ");
        }
    }
}
