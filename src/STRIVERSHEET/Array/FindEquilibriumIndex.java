package STRIVERSHEET.Array;//package STRIVERSHEET.Array;
//
//import java.util.Scanner;
//
//public class FindEquilibriumIndex {
//    public static int findEquilibriumIndex(int[] arr, int n){
//        for (int i = 0; i < n; i++){
//            int leftSum = 0, rightSum = 0;
//            for (int j =0;j<i;j++){
//                leftSum += arr[j];
//            }
//            for (int j = i+1;j<n;j++){
//                rightSum += arr[j];
//            }
//            if (leftSum == rightSum){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        FindEquilibriumIndex obj = new FindEquilibriumIndex();
//        int res = obj.findEquilibriumIndex(arr, n);
//        System.out.println(res);
//    }
//}


import java.util.Scanner;

public class FindEquilibriumIndex {
    public int findEquilibriumIndex(int[] arr, int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        int rightSum = totalSum;
        for (int i = 0; i < n; i++) {
            rightSum += arr[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        FindEquilibriumIndex obj = new FindEquilibriumIndex();
        int res = obj.findEquilibriumIndex(arr, n);
        System.out.println(res);
    }
}