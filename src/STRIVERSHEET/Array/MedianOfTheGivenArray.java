package STRIVERSHEET.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTheGivenArray {
    public static void Solution(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2==0){
            int indxOne = (n/2)-1;
            int indxTwo = (n/2);
            double median = (double)(arr[indxOne]+arr[indxTwo])/2;
            System.out.println("median is "+median);
        }else {

            System.out.println("median is "+ arr[n/2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution(arr);

    }
}
