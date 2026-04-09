package Arrays.Basic;//package Arrays.Basic;
//
//import java.util.Scanner;
//
//public class MooresVotingAlgorithm {
//    public static int Solution(int[] arr){
//        int n= arr.length;
//        for(int i=0;i<n;i++){
//            int count=0;
//            for (int j=0;i<n;j++){
//                if(arr[j]==arr[i]){
//                    count++;
//                }
//            }
//            if(count>n/2){
//                return arr[i];
//            }
//        }
//        return -1;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array size: ");
//        int x= scanner.nextInt();
//        int[] arr= new int[x];
//        System.out.println("Enter array elements: ");
//        for(int i=0;i<x;i++){
//            arr[i]= scanner.nextInt();
//        }
//        System.out.println(Solution(arr));
//    }
//}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MooresVotingAlgorithm {
    public static int Solution(int[] arr){
        Map<Integer,Integer> frequency = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            frequency.put(arr[i], frequency.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: frequency.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;
    }

    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int  x= scanner.nextInt();
        int[] arr= new int[x];
        System.out.println("Enter array elements: ");
        for (int i=0;i<x;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println(Solution(arr));
    }
}

//Brute ForceBetterOptimalTimeO(N²) 🐢O(N)O(N) ⚡SpaceO(1)O(N)O(1) ⭐