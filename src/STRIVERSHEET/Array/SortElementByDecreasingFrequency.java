package STRIVERSHEET.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SortElementByDecreasingFrequency {
    public ArrayList<Integer> sortElements(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int x: arr){
            list.add(x);
        }
        Collections.sort(list,(a,b)->{
            if(!map.get(a).equals(map.get(b)))return map.get(b)-map.get(a);
            return a-b;
        });
        ArrayList<Integer> ans = new ArrayList<>();
        for (int x=0;x<arr.length;x++){
            ans.add(list.get(x));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        SortElementByDecreasingFrequency s = new SortElementByDecreasingFrequency();
        ArrayList<Integer> ans = s.sortElements(arr);
        for (int x: ans){
            System.out.print(x+" ");
        }
    }
}
