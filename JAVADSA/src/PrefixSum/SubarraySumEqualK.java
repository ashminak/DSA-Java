package PrefixSum;//package PrefixSum;
//
//import java.util.Scanner;
//
//public class SubarraySumEqualK {
//    public static int Solution(int[] arr,int k){
//        int n = arr.length;
//        int count =0;
//        for(int i =0;i<n;i++){
//            int sum =0;
//            for(int j=i;j<n;j++){
//                sum+=arr[j];
//
//                if(sum==k){
//                    count++;
//                }
//            }
//        }
//        return  count;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length: ");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter array elements:: ");
//        for (int i=0;i<n;i++) arr[i]= scanner.nextInt();
//        System.out.println("Enter sum value: ");
//        int k = scanner.nextInt();
//        System.out.println(Solution(arr,k));
//    }
//
//}


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarraySumEqualK {
    public static int Solution(int[] arr, int k){
        Map<Integer,Integer> memo = new HashMap<>();
        int n = arr.length;;
        int ans=0;
        int prefixSum =0;
        memo.put(0,1);

        for(int i = 0;i<n;i++){
            prefixSum+=arr[i];

            if(memo.containsKey(prefixSum-k)){
                ans+=memo.get(prefixSum-k);
            }
            memo.put(prefixSum,memo.getOrDefault(prefixSum,0)+1);
        }
        return ans;
    }
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:: ");
        for (int i=0;i<n;i++) arr[i]= scanner.nextInt();
        System.out.println("Enter sum value: ");
        int k = scanner.nextInt();
        System.out.println(Solution(arr,k));
    }
}

//Brute ForceOptimalTimeO(N²) 🐢O(N) ⚡SpaceO(1)O(N)