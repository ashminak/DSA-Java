//https://www.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1
package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FourSum {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int start = j + 1;
                int end = nums.length - 1;
                while (start < end) {
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum == target) {
                        result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[start], nums[end])));
                        while (start < end && nums[start] == nums[start + 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end - 1]) {
                            end--;
                        }
                        start++;
                        end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }

                }
            }
        }
        return result;
    }

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = in.nextInt();
        System.out.println("Enter the target element: ");
        int target = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        ArrayList<ArrayList<Integer>> result = fourSum(nums, target);
        for (ArrayList<Integer> list : result) {
            System.out.println(list);
        }
    }
}

/*
Time Complexity:
- O(N³) → Sorting O(N logN) + two outer loops O(N²) × two pointer O(N)

Space Complexity:
- O(1) → No extra space except output list
         (sorting in-place, only i, j, start, end variables)
*/
