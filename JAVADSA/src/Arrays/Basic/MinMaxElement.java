package Arrays.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//public class MinMaxElement {
//    public static ArrayList<Integer> Solution(int[] arr){
//        ArrayList<Integer> list= new ArrayList<>();
//        int n = arr.length;
//        Arrays.sort(arr);
//        int min=arr[0];
//        int max=arr[n-1];
//        list.add(min);
//        list.add(max);
//        return list;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array size: ");
//        int n = scanner.nextInt();
//        int [] arr= new int[n];
//        System.out.println("Enter array elements: ");
//        for(int i=0;i<n;i++){
//            arr[i]= scanner.nextInt();
//        }
//        ArrayList<Integer> result = Solution(arr);
//        for (int x:result){
//            System.out.print(x+" ");
//        }
//    }
//}

public class MinMaxElement {
    public static ArrayList<Integer> Solution(int [] arr){
        ArrayList<Integer> list= new ArrayList<>();
        int mini = arr[0];
        int maxi = arr[0];
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            } else if (arr[i]<mini) {
                mini=arr[i];
            }
        }
        list.add(mini);
        list.add(maxi);
        return list;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int x= scanner.nextInt();
        int[] arr= new int[x];
        System.out.println("Enter elements in array: ");
        for (int i=0;i<x;i++){
            arr[i]= scanner.nextInt();
        }
        ArrayList<Integer> result =Solution(arr);
        for(int p:result){
            System.out.print(x+" ");
        }
    }
}

//Brute ForceOptimalTimeO(N log N) 🐢 O(N) ⚡Space O(1) O(1)