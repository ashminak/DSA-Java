package STRIVERSHEET.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class TwoRepeatedElements {
    public int[] twoRepeatedElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[2];
        int j=0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                res[j++] = arr[i];
            }else {
                set.add(arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        TwoRepeatedElements obj = new TwoRepeatedElements();
       int[] l=obj.twoRepeatedElements(arr);
        for (int ans : l) {
            System.out.print(ans+" ");
        }
    }
}
