package STRIVERSHEET.Array;


import java.util.Scanner;

//public class LargestElementInArray {
//    public static int getLargestElement(int[] arr) {
//        int largest = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//        }
//        return largest;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i <= n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int largest = getLargestElement(arr);
//        System.out.println(largest);
//    }
//}

//LEETTCODE 747
public class LargestElementInArray {
    public static int largestNumberAtLeastTwiceOfOthers(int[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(maxIndex != i && arr[maxIndex]< 2* arr[i]){
                return -1;
            }
        }
        return maxIndex;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        LargestElementInArray obj = new LargestElementInArray();
        int result = obj.largestNumberAtLeastTwiceOfOthers(arr);
        System.out.println(result);

    }
}
