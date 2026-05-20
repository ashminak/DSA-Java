package STRIVERSHEET.Array;//package STRIVERSHEET.Array;
//
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class RemoveDuplicateFromSortedArray {
//    public int Solution(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        int index = 0;
//        for (int num : nums) {
//            if (!set.contains(num)) {
//                set.add(num);
//                nums[index] = num;
//                index++;
//            }
//        }
//        return index;
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
//        RemoveDuplicateFromSortedArray obj = new RemoveDuplicateFromSortedArray();
//        System.out.println(obj.Solution(nums));
//    }
//}


import java.util.ArrayList;

//import java.util.Scanner;
//
//public class RemoveDuplicateFromSortedArray {
//    public int Solution(int[] nums) {
//        int n = nums.length;
//        int i = 0;
//        for (int j = 1; j < n; j++) {
//            if (nums[j] != nums[i]) {
//                i++;
//                nums[i] = nums[j];
//            }
//        }
//        return i+1;
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
//        RemoveDuplicateFromSortedArray obj = new RemoveDuplicateFromSortedArray();
//        System.out.println(obj.Solution(nums));
//    }
//}
//GFG
public class RemoveDuplicateFromSortedArray {
    public ArrayList<Integer> removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        for (int j = 1; j < n; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        for (int x = 0; x < i+1; x++){
            list.add(nums[x]);
        }
        return list;
    }
}