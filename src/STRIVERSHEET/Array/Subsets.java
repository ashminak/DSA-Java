package STRIVERSHEET.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for (int i =0;i<(1<<n);i++){
            List<Integer> list = new ArrayList<>();
            for (int j=0;j<n;j++){
                if ((i & (1<<j)) !=0){
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Subsets s = new Subsets();
        List<List<Integer>> ans = s.subsets(nums);
        for (List<Integer> list : ans) {
            System.out.print(list+ " ");
        }
    }
}
