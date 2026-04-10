package src.Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void quickSort(int[] arr,int left,int mid, int right){
        int leftLen = mid-left+1;
        int rightLen = right-mid;

        int[] leftArr = new int[leftLen];
        int[] rightArr = new int[rightLen];

        for(int i=0;i<leftLen;i++){
            leftArr[i] = arr[left+i];
        }
        for(int j=0;j<rightLen;j++){
            rightArr[j] = arr[mid+1+j];
        }
        int i = 0; int j = 0; int k = left;
        while(i<leftLen&&j<rightLen){
            if(leftArr[i]<=rightArr[j]){
                arr[k++] = leftArr[i++];
            }
            else{
                arr[k++] = rightArr[j++];
            }
        }
        while(i<leftLen){
            arr[k++] = leftArr[i++];
        }
        while(j<rightLen){
            arr[k++] = rightArr[j++];
        }

    }
    public static void Solution(int[] arr, int l,int r){
        if(l<r){
            int mid = l+(r-l)/2;
            Solution(arr,l,mid);
            Solution(arr,mid+1,r);
            quickSort(arr,l,mid,r);
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution(arr,0,n-1);
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
