package STRIVERSHEET.Array;

public class ThirdLargest {
    public static int Solution(int[] arr) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        boolean thirdExit = false;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondMax && arr[i] !=max){
                secondMax = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > thirdMax && arr[i] !=max &&arr[i] !=secondMax){
                thirdMax = arr[i];
                thirdExit = true;
            }
        }
        if(thirdExit==false){
            return (int)max;
        }
        if(thirdMax==Long.MIN_VALUE){
            return (int) max;
        }

        return (int) thirdMax;
    }
}
