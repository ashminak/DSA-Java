package STRIVERSHEET.Sorting;

import java.util.Scanner;

public class MergeSorting {
    public static void MergeSort(int[] arr,int l,int mid,int r){
        int leftLen= mid - l + 1;
        int rightLen= r - mid;
        int[] left = new int[leftLen];
        int[] right = new int[rightLen];
        for(int i=0;i<leftLen;i++){
            left[i]=arr[l+i];
        }
        for(int j=0;j<rightLen;j++){
            right[j]=arr[mid+j+1];
        }
        int i = 0, j  = 0,k = l;
        while(i<leftLen&&j<rightLen){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }else {
                arr[k++]=right[j++];
            }
        }
        while(i<leftLen){
            arr[k++]=left[i++];
        }
        while(j<rightLen){
            arr[k++]=right[j++];
        }
    }
    public static void Solution(int[] arr, int left, int right){

        if(left<right){
            int mid = (left+right)/2;
            Solution(arr,left,mid);
            Solution(arr,mid+1,right);
            MergeSort(arr,left,mid,right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MergeSorting obj = new MergeSorting();
        obj.Solution(arr,0,n-1);
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
