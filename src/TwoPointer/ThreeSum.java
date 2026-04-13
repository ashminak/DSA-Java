package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public List<List<Integer>> Solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]){continue;}
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    while (start<end && nums[start]==nums[start+1]) start++;
                    while (start<end && nums[end]==nums[end-1]) end--;
                    start++;
                    end--;
                }else if(sum<0){
                    start++;
                }else {
                    end--;
                }
            }
        }
        return result;
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
        ThreeSum obj = new ThreeSum();

        List<List<Integer>> result = obj.Solution(nums);
        for(List<Integer> list : result){
            System.out.println(list);
        }
        sc.close();
    }
}
