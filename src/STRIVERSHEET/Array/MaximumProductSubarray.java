package STRIVERSHEET.Array;//package STRIVERSHEET.Array;
//
//import java.util.Scanner;
//
//public class MaximumProductSubarray {
//    public int Solution(int[] arr){
//        int maxProduct = arr[0];
//        for(int i = 0; i < arr.length; i++){
//            int prod = 1;
//            for(int j = i; j < arr.length; j++){
//                prod *= arr[j];
//                maxProduct = Math.max(maxProduct, prod);
//            }
//        }
//        return maxProduct;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of the array: ");
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        MaximumProductSubarray obj = new MaximumProductSubarray();
//        int result = obj.Solution(arr);
//        System.out.println(result);
//    }
//}


import java.util.Scanner;

public  class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int maxi =nums[0];
        int mini =nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=mini;
                mini=maxi;
                maxi=temp;
            }
            maxi=Math.max(nums[i],maxi*nums[i]);
            mini=Math.min(nums[i],mini*nums[i]);
            ans=Math.max(ans,maxi);
        }
        return ans;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        MaximumProductSubarray obj = new MaximumProductSubarray();
        int result = obj.maxProduct(arr);
        System.out.println(result);
    }

}