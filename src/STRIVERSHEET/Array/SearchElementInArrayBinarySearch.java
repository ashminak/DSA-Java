package STRIVERSHEET.Array;

import java.util.Scanner;

public class SearchElementInArrayBinarySearch {
    public int search(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >k) {
                high = mid - 1;
            }else if (arr[mid] < k) {
                low = mid + 1;
            }else  {
                ans = mid;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int k = sc.nextInt();
        SearchElementInArrayBinarySearch search = new SearchElementInArrayBinarySearch();
        int ans = search.search(arr, k);
        System.out.println("The searched element is at index " + ans);

    }
}