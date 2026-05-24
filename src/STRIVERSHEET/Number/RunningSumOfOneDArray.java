package STRIVERSHEET.Number;

import java.util.Scanner;

public class RunningSumOfOneDArray {
    public int[] sum(int[] nums){
        int n = nums.length;
        for (int i = 1; i<n; i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        RunningSumOfOneDArray obj = new RunningSumOfOneDArray();
        int[] result = obj.sum(nums);
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
