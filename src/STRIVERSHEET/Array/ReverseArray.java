package STRIVERSHEET.Array;

//Bruteforece
//public class ReverseArray {
//
//    public int[] reverseArray(int[] array) {
//        int n = array.length;
//        int[] reversedArray = new int[n];
//        for (int i = 0; i < n; i++) {
//            reversedArray[i] = array[n - 1 - i];
//        }
//        return reversedArray;
//    }
//}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Optimal
//public class ReverseArray {
//    public void   reverseArray(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//        while(start<end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//
//    }
//}
//BuiltInApproach
public class ReverseArray {
    public void reverseArray(ArrayList<Integer> arr){
        Collections.reverse(arr);
    }
}