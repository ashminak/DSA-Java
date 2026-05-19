package STRIVERSHEET.Array;

import java.util.Scanner;

//import java.util.Scanner;
//
//public class SumOfArrayElements {
//    public int sumOfArrayElements(int[] arr){
//        int sum=0;
//        for (int i = 0; i<arr.length; i++){
//            sum+=arr[i];
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array: ");
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        System.out.println("Enter the elements in the array: ");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        SumOfArrayElements obj=new SumOfArrayElements();
//        System.out.println("The sum of the elements in the array is : "+obj.sumOfArrayElements(arr));
//    }
//}
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class SumOfArrayElements {
//    public int sumOfArrayElements(int[] arr){
//        return Arrays.stream(arr).sum();
//    }
//        public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array: ");
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        System.out.println("Enter the elements in the array: ");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        SumOfArrayElements obj=new SumOfArrayElements();
//        System.out.println("The sum of the elements in the array is : "+obj.sumOfArrayElements(arr));
//    }
//
//}
//LEETCODE 1480 RUNNING SUM OF 1D ARRAY
public class SumOfArrayElements {
    public static int[] Solution(int[] arr){
        int n =  arr.length;
        for (int i = 1; i < n; i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution(arr);
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }

    }
}
