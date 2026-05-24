package STRIVERSHEET.Number;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ThirdMaximumNumber {
    public int Solution(int[] arr){
        Set<Integer> set = new HashSet<Integer>();
        for (int num : arr)set.add(num);
        if(set.size()<3){
            return Collections.max(set);
        }
        set.remove(Collections.max(set));
        set.remove(Collections.max(set));
        return Collections.max(set);
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
        ThirdMaximumNumber obj = new ThirdMaximumNumber();

        int num = obj.Solution(arr);
        System.out.println(num);
    }
}
