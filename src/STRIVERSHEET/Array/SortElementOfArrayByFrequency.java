package STRIVERSHEET.Array;//package STRIVERSHEET.Array;
//
//import java.util.*;
//
//public class SortElementOfArrayByFrequency {
//    public void Sort(int[] arr){
//        Arrays.sort(arr);
//        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
//        for(int i= 0;i<arr.length;i++){
//            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
//        }
//        List<int[]> list = new ArrayList<int[]>();
//        for (int  key:  freq.keySet()){
//            list.add(new int[]{key,freq.get(key)});
//        }
//        Collections.sort(list,(a,b)->b[1]-a[1]);
//        int index = 0;
//        for (int[] x :list){
//            int val = x[0];
//            int count = x[1];
//            while (count-->0){
//                arr[index++] = val;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array: ");
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements in the array: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
//        SortElementOfArrayByFrequency s = new SortElementOfArrayByFrequency();
//        s.Sort(arr);
//        for (int x: arr){
//            System.out.print(x+" ");
//        }
//
//    }
//}
//Sort Array By Increasing frequency


import java.util.*;

public class SortElementOfArrayByFrequency {
    public int[]  replaceElements(int[] arr){
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
       List<Integer> list = new ArrayList<Integer>();
       for(int x: arr){
           list.add(x);
       }
       Collections.sort(list,(a,b)->{
           if(map.get(a).equals(map.get(b)))return map.get(b)-map.get(a);
           return a-b;
       });
       int[] ans = new int[list.size()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        SortElementOfArrayByFrequency s = new SortElementOfArrayByFrequency();
        s.replaceElements(arr);
        for (int x: arr){
            System.out.print(x+" ");
        }

    }
}
