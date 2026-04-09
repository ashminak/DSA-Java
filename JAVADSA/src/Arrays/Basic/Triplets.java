package Arrays.Basic;//package Arrays.Basic;
//
//import java.util.Scanner;
//
//public class Triplets {
//    public static boolean Solution(int [] arr, int target){
//        int n= arr.length;
//        for (int i=0;i<n-2;i++){
//            for (int j=i+1;j<n-1;j++){
//                for (int k=j+1;k<n;k++){
//                    if ((arr[i]+arr[j]+arr[k])==target){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array size: ");
//        int n = scanner.nextInt();
//        int[] arr= new int[n];
//        System.out.println("Enter array elements: ");
//        for (int i=0;i<n;i++) arr[i]= scanner.nextInt();
//        System.out.println("Enter target element: ");
//        int target = scanner.nextInt();
//        System.out.println(Solution(arr,target));
//    }
//}

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Triplets {
    public static boolean Solution(int[] arr, int target){
        int n = arr.length;
        for(int i=0;i<n-2;i++){
            Set<Integer> seen= new HashSet<>();
            for (int j=i+1;j<n;j++){
                int needed = target-arr[i]-arr[j];
                if(seen.contains(needed)){
                    return true;
                }
                seen.add(arr[j]);
            }
        }
        return false;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter array elements: ");
        for (int i =0 ;i<n;i++) arr[i]= scanner.nextInt();
        System.out.println("Enter target element: ");
        int target = scanner.nextInt();
        System.out.println(Solution(arr,target));
    }
}