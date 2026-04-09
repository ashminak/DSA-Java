package Arrays.Basic;

import java.util.Scanner;

public class CyclicRotateOne {
    public static void Solution(int[] arr, int d){
        int n = arr.length;

        d = d%n;
        int[] temp= new int[d];
        for (int i=0;i<d;i++){
            temp[i]= arr[i];
        }
        for (int i=0;i<n-d;i++){
            arr[i]=arr[i+d];
        }
        for (int i=0;i<d;i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int num= scanner.nextInt();
        int[] arr= new int[num];
        System.out.println("Enter elements of the array: ");
        for(int i=0;i<num;i++) arr[i]= scanner.nextInt();
        System.out.println("Enter the d of the array: ");
        int d= scanner.nextInt();
        Solution(arr,d);

        for (int x:arr){
            System.out.println(x+" ");
        }


    }
}

