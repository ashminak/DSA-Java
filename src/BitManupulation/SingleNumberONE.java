package BitManupulation;//package BitManupulation;
//
//import java.util.Scanner;
//
//public class SingleNumberONE {
//    public static int singleNumber(int[] nums) {
//        int result = 0;
//        for(int num:nums){
//            result ^= num;
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array");
//        int n = sc.nextInt();
//        System.out.println("Enter the elements in the array");
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(singleNumber(arr));
//    }
//}

import java.util.Scanner;

public class SingleNumberONE {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i =0;i<32;i++){
            int sum = 0;
            for (int num : nums){
                if((num&(1<<i))!=0){
                    sum++;
                }
            }
            if (sum%3!=0){
                result|=(1<<i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(singleNumber(arr));
    }
}