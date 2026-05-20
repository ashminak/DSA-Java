package STRIVERSHEET.Array;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
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
        ContainsDuplicate dc = new ContainsDuplicate();
        System.out.println(dc.containsDuplicate(arr));
    }
}
