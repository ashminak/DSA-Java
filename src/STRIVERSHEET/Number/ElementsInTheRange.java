package STRIVERSHEET.Number;

import java.util.Scanner;

public class ElementsInTheRange {
    public boolean Solution(int start, int end, int[] arr) {

        for (int i =start; i <= end; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter last number: ");
        int last = sc.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ElementsInTheRange obj = new ElementsInTheRange();
        boolean result = obj.Solution(first, last, arr);
        System.out.println(result);
    }
}
