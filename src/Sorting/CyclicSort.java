<<<<<<< HEAD
package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class CyclicSort {
    public static ArrayList<Integer> Solution(int[]arr) {
        int n = arr.length;
        int i =0;
        while (i < n){
          int correctInd = arr[i]-1;
          if(arr[i] != arr[correctInd]){
              int temp = arr[correctInd];
              arr[correctInd] = arr[i];
              arr[i] = temp;
          }else {
              i++;
          }
        }
        int repeat =0;
        int missing =0;
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                repeat=arr[j];
                missing=j+1;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(repeat);
        res.add(missing);
        return res;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = Solution(arr);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}
=======
package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class CyclicSort {
    public static ArrayList<Integer> Solution(int[]arr) {
        int n = arr.length;
        int i =0;
        while (i < n){
          int correctInd = arr[i]-1;
          if(arr[i] != arr[correctInd]){
              int temp = arr[correctInd];
              arr[correctInd] = arr[i];
              arr[i] = temp;
          }else {
              i++;
          }
        }
        int repeat =0;
        int missing =0;
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                repeat=arr[j];
                missing=j+1;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(repeat);
        res.add(missing);
        return res;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = Solution(arr);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}
>>>>>>> 6a619a26afb44978c7472be57b386e143a935049
