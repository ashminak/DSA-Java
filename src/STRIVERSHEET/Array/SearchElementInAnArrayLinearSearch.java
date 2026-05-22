package STRIVERSHEET.Array;
import java.util.Scanner;

public class SearchElementInAnArrayLinearSearch {
    public int search(int[] arr,int k){
        int ans =0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]==k){
                ans = i;
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
        SearchElementInAnArrayLinearSearch search = new SearchElementInAnArrayLinearSearch();
        int ans = search.search(arr, k);
        System.out.println("The searched element is at index " + ans);

    }

}


