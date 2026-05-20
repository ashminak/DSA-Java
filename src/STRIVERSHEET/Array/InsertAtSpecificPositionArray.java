package STRIVERSHEET.Array;

import java.util.Scanner;

public class InsertAtSpecificPositionArray {
    public int[] insert(int[] array, int element, int position) {
        int[] newArray = new int[array.length + 1];
        for(int i =0;i<position;i++){
            newArray[i] = array[i];
        }
        newArray[position] = element;
        for(int i =position;i<array.length;i++){
            newArray[i+1] = array[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position of the element in the array: ");
        int p = sc.nextInt();
        System.out.println("Enter the element to insert at beginning: ");
        int x = sc.nextInt();
        InsertAtSpecificPositionArray obj = new InsertAtSpecificPositionArray();
        int[] tem= obj.insert(arr,x,p);
        for (int i : tem) {
            System.out.print(i+" ");
        }
    }

}
