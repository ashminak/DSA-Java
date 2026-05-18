package STRIVERSHEET.Array;

public class SecondLargest {
    public static int Solution(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondMax && arr[i] !=max){
                secondMax = arr[i];
            }
        }
        if(secondMax==Integer.MIN_VALUE){
            return -1;
        }
        return secondMax;
    }
}
