package STRIVERSHEET.Array;

import java.util.Scanner;

public class MedianOfTwoSortedArray {
    public static double solution(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            }else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < n1) {
            merged[k++] = nums1[i++];
        }
        while (j < n2) {
            merged[k++] = nums2[j++];
        }
        int n = merged.length;
        double ans = 0.0;
        if (n % 2 == 0) {
            int indexOne = (n/2)-1;
            int indexTwo = (n/2);

            ans =(double) (merged[indexOne] + merged[indexTwo])/2;
        }else {
            ans=(double) (merged[n/2]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array1: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of the array2: ");
        int m = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];
        System.out.println("Enter the elements of the array1: ");
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the array2: ");
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(solution(nums1, nums2));
    }
}
