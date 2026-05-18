package STRIVERSHEET.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Bruteforce
//public class SmallestElementInArray {
//
//    public int smallestElement(int[] arr) {
//        Arrays.sort(arr);
//        return arr[0];
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int result = smallestElement(arr);
//        System.out.println("Smallest element in the array is: " + result);
//    }
//}


//TC:O(n log n)
//public class SmallestElementInArray {
//
//    public static int smallestElement(int[] arr) {
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        return min;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int result = smallestElement(arr);
//        System.out.println("Smallest element in the array is: " + result);
//    }
//}
//TC:O(n)
//public class SmallestElementInArray {
//    public static ArrayList<Integer> smallestElement(int[] arr) {
//        ArrayList<Integer> res = new ArrayList<>();
//        Arrays.sort(arr);
//        int min = arr[0];
//        int secondMin = -1;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] != min) {
//                secondMin = arr[i];
//                break;
//            }
//        }
//        if (secondMin == -1) {
//            res.add(arr[0]);
//        }else {
//            res.add(min);
//            res.add(secondMin);
//        }
//        return res;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(smallestElement(arr));
//    }
//}

//public class SmallestElementInArray {
//    public static ArrayList<Integer> smallestElementInArray(int[] arr) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int min = Integer.MAX_VALUE;
//        int secondMin = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                secondMin = min;
//                min = arr[i];
//            }
//            else if (arr[i] < secondMin &&  arr[i]!= min) {
//                secondMin = arr[i];
//            }
//        }
//        if (secondMin == Integer.MAX_VALUE) {
//            list.add(-1);
//        }else {
//            list.add(min);
//            list.add(secondMin);
//        }
//        return list;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        ArrayList<Integer> list = smallestElementInArray(arr);
//        System.out.println("Smallest element and Second Smallest elements are "+list);
//    }
//}

//LEETCODE 2974
//public class SmallestElementInArray {
//    public static int[] minNumberGame(int[] num) {
//        Arrays.sort(num);
//        for (int j = 0; j < num.length; j++) {
//            int temp = num[j];
//            num[j] = num[j + 1];
//            num[j + 1] = temp;
//        }
//        return num;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int[] arr1 = minNumberGame(arr);
//        System.out.println(Arrays.toString(arr1));
//    }
//}
//LEETCODE 153
public class SmallestElementInArray {
    public static int findMin(int[] arr) {
        int low =  0;
        int high = arr.length - 1;
        while (low<high) {
            int mid = low + (high-low)/2;
            if(arr[mid]>arr[high]){
                low = mid+1;
            }else {
                high = mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr));
    }

}

//TC: O(log n)