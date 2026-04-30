package BitManupulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//package BitManupulation;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Subsets {
//    public static List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        int n = nums.length;
//        for (int i = 0; i <(1<<n); i++) {
//            List<Integer> list = new ArrayList<>();
//            for (int j=0;j<n;j++){
//                if ((i & (1<<j)) !=0) {
//                    list.add(nums[j]);
//                }
//            }
//            result.add(list);
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array");
//        int n = input.nextInt();
//        int[] nums = new int[n];
//        System.out.println("Enter the elements in the array");
//        for (int i = 0; i < n; i++) {
//            nums[i] = input.nextInt();
//        }
//        List<List<Integer>> result = subsets(nums);
//        for (List<Integer> list : result) {
//
//            System.out.println(list.toString());
//        }
//    }
//}
public class Subsets {
    public static List<String>  subsets(String str) {
        List<String> result = new ArrayList<>();
        int n = str.length();

        for (int i = 0; i <(1<<n); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; j++) {
                if((i&(1<<j))!=0){
                    sb.append(str.charAt(j));
                }
            }
            result.add(sb.toString());
        }
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = in.next();
        System.out.println(subsets(s));
    }
}
