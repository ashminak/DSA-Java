package STRIVERSHEET.Array;//package STRIVERSHEET.Array;
//
//import java.util.Scanner;
//
//public class FindNonRepeatingElementsArray {
//    public void Solution(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            boolean ck= false;
//            for (int j = 0; j < arr.length; j++) {
//                if(i!=j && arr[i]==arr[j]){
//                    ck=true;
//                }
//            }
//            if(!ck){
//                System.out.println(arr[i]+ " ");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        FindNonRepeatingElementsArray obj = new FindNonRepeatingElementsArray();
//        obj.Solution(arr);
//    }
//}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindNonRepeatingElementsArray  {
    public void twoRepeatedElements(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i:arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1){
                System.out.println(entry.getKey()+" ");
            }
        }
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
        FindNonRepeatingElementsArray obj = new FindNonRepeatingElementsArray();
        obj.twoRepeatedElements(arr);
    }
}