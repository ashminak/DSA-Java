package PrefixSum;//package PrefixSum;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ProductExceptItself {
//    public static int[] Solution(int[]arr){
//        int n = arr.length;
//        int [] ans = new int[n];
//
//        for(int i =0;i<n;i++){
//            int product =1;
//            for (int j =0;j<n;j++){
//                if(j!=i){
//                    product*=arr[j];
//                }
//            }
//            ans[i]=product;
//        }
//        return ans;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter array length: ");
//        int n = scanner.nextInt();
//        int [] arr1= new int[n];
//        System.out.print("Enter array elements: ");
//        for (int i =0;i<n;i++) arr1[i]= scanner.nextInt();
//        System.out.println(Arrays.toString(Solution(arr1)));
//    }
//}


import java.util.Arrays;
import java.util.Scanner;

public class ProductExceptItself {
    public static int[] Solution(int[] arr){
        int n =arr.length;
        int[] ans= new int[n];
        Arrays.fill(ans,1);
        int curr =1;
        for(int i =0;i<n;i++){
            ans[i]=curr;
            curr*=arr[i];
        }
        curr=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=curr;
            curr*=arr[i];
        }
        return ans;
    }
        static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = scanner.nextInt();
        int [] arr1= new int[n];
        System.out.print("Enter array elements: ");
        for (int i =0;i<n;i++) arr1[i]= scanner.nextInt();
        System.out.println(Arrays.toString(Solution(arr1)));
    }
}