package STRIVERSHEET.Array;//package STRIVERSHEET.Array;
//
//import java.util.Scanner;
//
//public class ArraySubsetAnotherArray {
//    public boolean Solution(int[] arr1,int[] arr2){
//        int m = arr1.length;
//        int n = arr2.length;
//        if(m>n)return false;
//        boolean present = false;
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(arr1[i]==arr2[j]){
//                    present=true;
//                    break;
//                }
//            }
//            if(!present)return false;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array1: ");
//        int m = sc.nextInt();
//        System.out.println("Enter the size of the array2: ");
//        int n = sc.nextInt();
//        int[] arr1 = new int[m];
//        int[] arr2 = new int[n];
//        System.out.println("Enter the elements of the array1: ");
//        for(int i=0;i<m;i++){
//            arr1[i] = sc.nextInt();
//        }
//        System.out.println("Enter the elements of the array2: ");
//        for(int i=0;i<n;i++){
//            arr2[i] = sc.nextInt();
//        }
//        ArraySubsetAnotherArray obj = new ArraySubsetAnotherArray();
//        boolean result = obj.Solution(arr1,arr2);
//        System.out.println(result);
//    }
//}

//import java.util.Scanner;
//
//public class ArraySubsetAnotherArray {
//    boolean bPresent(int elem,int[] arr, int k){
//        int start = 0;
//        int end = k-1;
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(arr[mid]==elem){
//                return true;
//            }else if(arr[mid]<elem){
//                start=mid+1;
//            }else {
//                end=mid-1;
//            }
//
//        }
//        return false;
//
//    }
//    public boolean search(int[] arr1,int[] arr2){
//        int m  = arr1.length;
//        int n  = arr2.length;
//        for (int i = 0; i<m; i++){
//            boolean present = bPresent(arr1[i],arr2,n);
//            if(!present){
//                return false;
//            }
//        }
//        return true;
//    }
//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array1: ");
//        int m = sc.nextInt();
//        System.out.println("Enter the size of the array2: ");
//        int n = sc.nextInt();
//        int[] arr1 = new int[m];
//        int[] arr2 = new int[n];
//        System.out.println("Enter the elements of the array1: ");
//        for(int i=0;i<m;i++){
//            arr1[i] = sc.nextInt();
//        }
//        System.out.println("Enter the elements of the array2: ");
//        for(int i=0;i<n;i++){
//            arr2[i] = sc.nextInt();
//        }
//        ArraySubsetAnotherArray obj = new ArraySubsetAnotherArray();
//        boolean result = obj.search(arr1,arr2);
//        System.out.println(result);
//    }
//}


import java.util.HashMap;
import java.util.Scanner;

public class ArraySubsetAnotherArray {
    public boolean Solution(int[] a, int[] b){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<a.length; i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for (int i = 0; i<b.length; i++){
            if(!map.containsKey(b[i])||map.get(b[i])==0){
                return  false;
            }
            map.put(b[i],map.getOrDefault(b[i],0)-1);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array1: ");
        int m = sc.nextInt();
        System.out.println("Enter the size of the array2: ");
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements of the array1: ");
        for(int i=0;i<m;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the array2: ");
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        ArraySubsetAnotherArray obj = new ArraySubsetAnotherArray();
        boolean result = obj.Solution(arr1,arr2);
        System.out.println(result);
    }
}