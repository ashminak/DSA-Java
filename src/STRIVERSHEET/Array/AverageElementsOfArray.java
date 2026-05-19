package STRIVERSHEET.Array;

import java.util.Scanner;

public class AverageElementsOfArray {
    public static void AverageElementsOfArray(int[] arr){
        int n=arr.length;
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=(double) arr[i];
        }
        double avg=sum/n;
        System.out.println("The average of the elements in the array is: "+avg);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        AverageElementsOfArray(arr);
    }
}
