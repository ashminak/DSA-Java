package STRIVERSHEET.Array;//package STRIVERSHEET.Array;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class RemoveDuplicateFromUnsortedArray {
//
//    public ArrayList<Integer> removeDuplicates(int[] nums) {
//        ArrayList<Integer> res = new ArrayList<>();
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            boolean found = false;
//            for (int j = 0; j < res.size(); j++) {
//                if (nums[i] == res.get(j)) {
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                res.add(nums[i]);
//            }
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
//        RemoveDuplicateFromUnsortedArray obj = new RemoveDuplicateFromUnsortedArray();
//        ArrayList<Integer> res = obj.removeDuplicates(nums);
//        System.out.print("Array after removing duplicates: ");
//        for (int x:res){
//            System.out.print(x+" ");
//        }
//
//    }
//}


import java.util.*;

public class RemoveDuplicateFromUnsortedArray {
    public ArrayList<Integer> removeDuplicates(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                list.add(i);
                map.put(i, true);
            }
        }
        return list;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        RemoveDuplicateFromUnsortedArray obj = new RemoveDuplicateFromUnsortedArray();
        ArrayList<Integer> res = obj.removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        for (int x:res){
            System.out.print(x+" ");
        }

    }
}