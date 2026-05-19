package STRIVERSHEET.Array;

import java.util.Scanner;

public class ReverseArrayByKElements {
    void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void leftRotate(int[] arr,int d){
        int n =arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public void rightRotate(int[] arr,int d){
        int n =arr.length;
        if(d==0)return;
        d=d%n;
        leftRotate(arr,n-d);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k elements in the array: ");
        int k=sc.nextInt();
        ReverseArrayByKElements obj=new ReverseArrayByKElements();
        int[] leftArr = arr.clone();
        int[] rightArr = arr.clone();
        obj.leftRotate(leftArr,k);
        System.out.println("Left Rotation: ");
        for (int i : leftArr) {
            System.out.print(i+" ");
        }
        System.out.println();
        obj.rightRotate(rightArr,k);
        System.out.println("Right Rotation: ");
        for (int i : rightArr) {
            System.out.print(i+" ");
        }

    }
}
