package STRIVERSHEET.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertAtSpecificPositionOfArrayList {
    public void Solution(ArrayList<Integer> arr, int index,int value){
        arr.add(index,value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the arrayList: ");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        System.out.println("Enter the value: ");
        int value = sc.nextInt();
        InsertAtSpecificPositionOfArrayList obj = new InsertAtSpecificPositionOfArrayList();
        obj.Solution(arr,index,value);
        System.out.println("Updated ArrayList: ");
        for (int p : arr) {
            System.out.print(p+" ");
        }
    }
}
