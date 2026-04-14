package TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

//package TwoPointer;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class MergeSotedArray {
//    public  void Solution(int[] arr1,int m, int[] arr2, int n) {
//        int i = m-1, j = 0;
//        while(i>=0 && j<n){
//            if(arr1[i]>=arr2[j]){
//                int temp = arr1[i];
//                arr1[i] = arr2[j];
//                arr2[j] = temp;
//                i++;
//                j++;
//            }else {
//                j++;
//            }
//        }
//        Arrays.sort(arr2);
//        j = 0;
//        for(int k=m;k<m+n;k++){
//            arr1[k] = arr2[j++];
//        }
//        Arrays.sort(arr1);
//    }
//    public static void main(String[] args) {
//        Scanner  sc = new Scanner(System.in);
//        System.out.println("Enter the size of array1: ");
//        int m = sc.nextInt();
//        System.out.println("Enter the size of array2: ");
//        int n = sc.nextInt();
//        int[] arr1 = new int[m+n];
//        int[] arr2 = new int[n];
//        System.out.println("Enter the array1: ");
//        for(int i=0;i<m+n;i++){
//            arr1[i] = sc.nextInt();
//        }
//        System.out.println("Enter the array2: ");
//        for(int i=0;i<n;i++){
//            arr2[i] = sc.nextInt();
//        }
//        MergeSotedArray obj = new MergeSotedArray();
//        obj.Solution(arr1,m,arr2,n);
//        for (int x : arr1) {
//            System.out.println(x+" ");
//        }
//    }
//}
public class MergeSortedArray {
    public void Solution(int[] a, int[] b){
        int m = a.length;
        int n = b.length;
        int i =  m-1;
        int j = 0;
        while(i>=0 && j<n){
            if(a[i]>=b[j]){
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                i--;
                j++;
            }else {
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array1: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of elements in the array2: ");
        int n = sc.nextInt();
        int[] a = new int[m+n];
        int[] b = new int[n];
        System.out.println("Enter the elements in the array1: ");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in the array2: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        MergeSortedArray obj = new MergeSortedArray();
        obj.Solution(a, b);
        for (int x: a) {
            System.out.print(x + " ");
        }
        for (int x: b) {
            System.out.print(x + " ");
        }
    }
}
