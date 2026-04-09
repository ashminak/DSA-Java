package KedaneAlgo;//package KedaneAlgo;
//
//import java.util.Scanner;
//
//public class MaxSubarrayProduct {
//    public static int Solution(int[] arr){
//        int n =arr.length;
//        int maxProduct =arr[0];
//        for(int i =0;i<n;i++){
//            int product =1;
//            for(int j =i;j<n;j++){
//                product*=arr[j];
//                maxProduct=Math.max(maxProduct,product);
//            }
//        }
//        return maxProduct;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter array length: ");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter array elements: ");
//        for (int i =0;i<n;i++) arr[i]= scanner.nextInt();
//        System.out.print(Solution(arr));
//    }
//}


import java.util.Scanner;

public class MaxSubarrayProduct {
    public static int Solution(int[] arr){
        int maxi=0;
        int mini=0;
        int ans=0;
        int n = arr.length;
        for (int i =0;i<n;i++){
            if(arr[i]<0){
                int temp = mini;
                mini=maxi;
                maxi=temp;
            }

            maxi=Math.max(arr[i],arr[i]*maxi);
            mini=Math.min(arr[i],arr[i]*mini);
            ans=Math.max(ans,maxi);
        }
        return ans;
    }
        static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i =0;i<n;i++) arr[i]= scanner.nextInt();
        System.out.print(Solution(arr));
    }
}