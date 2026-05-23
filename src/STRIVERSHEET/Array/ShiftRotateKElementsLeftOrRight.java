package STRIVERSHEET.Array;//package STRIVERSHEET.Array;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ShiftRotateKElementsLeftOrRight {
//    public int[] rotateRight(int[] arr, int k){
//        int n = arr.length;
//        k=k%n;
//        int[] temp = Arrays.copyOfRange(arr,n-k,n);
//        for(int i = n-k-1;i>=0;i--){
//            arr[i+k]=arr[i];
//        }
//        for(int i = 0;i<k;i++){
//            arr[i]=temp[i];
//        }
//        return arr;
//    }
//    public int[] rotateLeft(int[] arr, int k){
//        int n = arr.length;
//
//        k=k%n;
//        int[] temp = Arrays.copyOfRange(arr,0,k);
//        for(int i =k;i<n;i++){
//            arr[i-k]=arr[i];
//        }
//        for(int i =0;i<k;i++){
//            arr[n-k+i]=temp[i];
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array: ");
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements in the array: ");
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        System.out.println("Enter k elements in the array: ");
//        int k = in.nextInt();
//        ShiftRotateKElementsLeftOrRight shift = new ShiftRotateKElementsLeftOrRight();
//        int[] result = shift.rotateRight(arr,k);
//        for(int x: result){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//        int[] result1 = shift.rotateLeft(arr,k);
//        for(int l: result1){
//            System.out.print(l+" ");
//        }
//    }
//}

import java.util.Scanner;

public class ShiftRotateKElementsLeftOrRight {
    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public int[] rightShift(int[] arr, int k,String direction) {
        int n = arr.length;
        if(k==0||n==0) return arr;
        k = k%n;
        if(direction.equals("right")){
            reverse(arr,0,n-1);
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
        }
        return arr;
    }
    public int[] leftShift(int[] arr, int k,String direction) {
        int n = arr.length;
        if(k==0||n==0) return arr;
        k = k%n;
        if(direction.equals("left")){
            reverse(arr,k,n-1);
            reverse(arr,0,k-1);
            reverse(arr,0,n-1);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k elements: ");
        int k = sc.nextInt();
        System.out.println("Enter the direction: ");
        String direction = sc.next();
        ShiftRotateKElementsLeftOrRight shift = new ShiftRotateKElementsLeftOrRight();
        int[] res = shift.leftShift(arr, k, direction);
        for (int x: res){
            System.out.print(x+" ");
        }
        System.out.println();

    }
}















