package KedaneAlgo;

import java.util.Scanner;

//package KedaneAlgo;
//
//import java.util.Scanner;
//
//public class MaxSubarraySum {
//    public static int Solution(int[] arr){
//        int maxi = arr.length;
//        int n = arr.length;
//
//        for(int i =0;i<n;i++){
//            int sum =0;
//            for(int j =i;j<n;j++){
//                sum+=arr[j];
//
//                maxi=Math.max(maxi,sum);
//            }
//        }
//        return maxi;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length: ");
//        int n = scanner.nextInt();
//        int[] arr= new int[n];
//        System.out.println("Enter array elements: ");
//        for(int i=0;i<n;i++) arr[i] = scanner.nextInt();
//        System.out.println(Solution(arr));
//    }
//}
public class MaxSubarraySum {
    public static int Solution(int[] arr) {
        int maxi = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
        static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++) arr[i] = scanner.nextInt();
        System.out.println(Solution(arr));
    }
}

