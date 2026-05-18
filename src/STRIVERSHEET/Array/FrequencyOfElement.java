package STRIVERSHEET.Array;

//public class FrequencyOfElement {
//    public void countFreq(int[] arr, int n){
//        boolean[] visited = new boolean[n];
//        for (int i = 0; i < n; i++) {
//            if(visited[i]){
//                continue;
//            }
//            int count = 0;
//            for(int j = i+1; j < n; j++){
//                if(arr[i] == arr[j]){
//                    visited[j] = true;
//                    count++;
//                }
//            }
//
//            System.out.println("Frequency of element " + arr[i] + " is " + count);
//        }
//    }
//}

import java.util.*;

//public class FrequencyOfElement {
//    public void countFreq(int[] arr, int n){
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < n; i++){
//            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//        }
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }
//}


//public class FrequencyOfElement {
//    public int majorityElement(int[] nums) {
//        int count = 0;
//        int candidate = 0;
//        for (int num : nums) {
//            if (count == 0) {
//                candidate = num;
//            }
//            if (candidate == num) {
//                count++;
//            }else {
//                count--;
//            }
//        }
//        return candidate;
//    }
//}


public class FrequencyOfElement {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)-> map.get(a)-map.get(b));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}