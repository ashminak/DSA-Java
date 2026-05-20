package STRIVERSHEET.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FindAllDuplicates {
    public ArrayList<Integer> findDuplicates(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                ans.add(num);
            }
            set.add(num);
        }
        return ans;
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
        FindAllDuplicates obj = new FindAllDuplicates();
        ArrayList<Integer> l=obj.findDuplicates(arr);
        for (int ans : l) {
            System.out.print(ans+" ");
        }
    }
}
