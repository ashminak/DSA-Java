//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class ReplaceElementsByItsRankArray {
//    public ArrayList<Integer> replaceElements(int[] arr) {
//        ArrayList<Integer> res = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            HashSet<Integer> set = new HashSet<>();
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[j]<arr[i]){
//                    set.add(arr[j]);
//                }
//            }
//            int rank = set.size()+1;
//            res.add(rank);
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements in the array: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        ReplaceElementsByItsRankArray re = new ReplaceElementsByItsRankArray();
//        ArrayList<Integer> ans = re.replaceElements(arr);
//        for (int x : ans){
//            System.out.print(x+" ");
//        }
//    }
//}


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ReplaceElementsByItsRankArray {
    public int[] replaceElements(int[] arr) {
        int[] res = arr.clone();
        Arrays.sort(res);
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int x:res){
            if(!rankMap.containsKey(x)){
                rankMap.put(x,rank);
                rank++;
            }
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        return result;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ReplaceElementsByItsRankArray re = new ReplaceElementsByItsRankArray();
        int[] ans = re.replaceElements(arr);
        for (int x : ans){
            System.out.print(x+" ");
        }
    }
}
