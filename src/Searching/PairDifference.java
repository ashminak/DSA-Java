package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class PairDifference {
    public static boolean Solution(int[] arr, int x){
        Arrays.sort(arr);
        int start = 0;
        int end = 1;
        while (end < arr.length){
            int diff = arr[end] - arr[start];
            if (diff == x){return true;}
            else if (diff < x){
                end++;
            }else {
                start++;
                if(start == end){
                    end++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the difference between the two elements in the array: ");
        int x = sc.nextInt();
        System.out.println(Solution(arr, x));

    }

}
