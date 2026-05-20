package STRIVERSHEET.Array;

import java.util.HashMap;
import java.util.Scanner;

public class SingleNumberNonRepeat {
    public int singleNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int n:arr){
            if(map.get(n)==1){
                return n;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SingleNumberNonRepeat obj = new SingleNumberNonRepeat();
        int ans = obj.singleNumber(arr);
        System.out.println(ans);
    }
}
