package PrefixSum;//package PrefixSum;
//
import java.util.Scanner;

public class TwoSum {
    public static int Solution(int[] arr, int k){
        int n = arr.length;
        int count=0;
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count++;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i =0;i<n;i++) arr[i] = scanner.nextInt();
        System.out.println("Enter target element: ");
        int k = scanner.nextInt();
        System.out.println(Solution(arr,k));
    }
}

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class TwoSum {
//    public static int Solution(int[] arr, int k){
//        Map<Integer,Integer> um = new HashMap<>();
//        int ans =0;
//        int n = arr.length;
//        for(int i =0;i<n;i++){
//            int complement=k-arr[i];
//            if(um.containsKey(complement)){
//                ans+=um.get(complement);
//            }
//            um.put(arr[i],um.getOrDefault(arr[i],0)+1);
//        }
//        return ans;
//    }
//        static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length: ");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter array elements: ");
//        for (int i =0;i<n;i++) arr[i] = scanner.nextInt();
//        System.out.println("Enter target element: ");
//        int k = scanner.nextInt();
//        System.out.println(Solution(arr,k));
//    }
//}