package TwoPointer;

import java.util.Scanner;

public class TrappingRainWater {
    public static int Solution(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;
        while (start < end) {
            if (arr[start] <= arr[end]) {
                if(arr[start]>=leftMax){
                    leftMax = arr[start];
                }else {
                    ans+=leftMax-arr[start];
                }
                start++;
            }else{
                if(arr[end]>=rightMax){
                    rightMax = arr[end];
                }else{
                    ans+=rightMax-arr[end];
                }
                end--;
            }
        }
        return ans;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Solution(arr));
    }
}
