package DutchNationalFlag;//package DutchNationalFlag;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ThreeWayPartitioning {
//
//    public static void Solution(int[] arr, int a, int b){
//        ArrayList<Integer> less = new ArrayList<>();
//        ArrayList<Integer> middle = new ArrayList<>();
//        ArrayList<Integer> high = new ArrayList<>();
//
//        for(int i: arr){
//            if(i<a){
//                less.add(i);
//            } else if (i<=b) {
//                middle.add(i);
//            }else {
//                high.add(i);
//            }
//        }
//        int index=0;
//        for(int c: less) arr[index++]=c;
//        for(int c: middle) arr[index++]=c;
//        for(int c: high) arr[index++]=c;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length: ");
//        int n = scanner.nextInt();
//        int[] arr= new int[n];
//        System.out.println("Enter array elements: ");
//        for(int i=0;i<n;i++) arr[i] = scanner.nextInt();
//        System.out.println("Enter a: ");
//        int a = scanner.nextInt();
//        System.out.println("Enter b: ");
//        int b = scanner.nextInt();
//
//        Solution(arr,a,b);
//        for (int c: arr){
//            System.out.print(c+" ");
//        }
//    }
//}

import java.util.Scanner;

public class ThreeWayPartitioning {
    public static void Solution(int[] arr, int a, int b){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high =n-1;

        while(mid<=high){
            if(arr[mid]<=a){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } else if (arr[mid]>=a&&arr[mid]<=b) {
                mid++;
            }else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
        static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++) arr[i] = scanner.nextInt();
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        Solution(arr,a,b);
        for (int c: arr){
            System.out.print(c+" ");
        }
    }
}
