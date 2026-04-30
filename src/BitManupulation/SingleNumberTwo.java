package BitManupulation;

import java.util.Scanner;

public class SingleNumberTwo {
    public static int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
        int diff = xor & (-xor);
        int a = 0;
        int b = 0;
        for(int num : nums){
            if((num & diff) != 0){
                a ^= num;
            }else {
                b ^= num;
            }
        }
        return a<b?new int[]{a,b}:new int[]{a,b};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = singleNumber(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
