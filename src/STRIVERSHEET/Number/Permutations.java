package STRIVERSHEET.Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//public class Permutations {
//    public int Solution(int n,int r){
//       int ans = 1;
//       for(int i =n;i>=(n-r+1);i--){
//           ans = ans * i;
//       }
//       return ans;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println("Enter a number: ");
//        int r = sc.nextInt();
//        Permutations p = new Permutations();
//        int ans = p.Solution(n,r);
//        System.out.println(ans);
//    }
//}


public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(nums,visited,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(int[] nums, boolean[] visited,List<Integer> current,List<List<Integer>> result){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
        }
        for(int i = 0; i<nums.length; i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            current.add(nums[i]);
            backtrack(nums,visited,current,result);
            current.remove(current.size()-1);
            visited[i] = false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Permutations p = new Permutations();
        List<List<Integer>> result = p.permute(nums);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}