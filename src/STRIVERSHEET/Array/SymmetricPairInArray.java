package STRIVERSHEET.Array;//package STRIVERSHEET.Array;
//
//import java.util.Scanner;
//
//public class SymmetricPairInArray {
//    public void Solution(int[][] arr){
//        System.out.println("The symmetric pairs are : ");
//        for(int i=0;i<arr.length;i++){
//            for (int j = i+1;j<arr.length;j++){
//                if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]){
//                    System.out.println(arr[i][0]+" "+arr[i][1]);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int n = sc.nextInt();
//        System.out.println("Enter the elements of the array: ");
//        int[][] arr = new int[n][2];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<2;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        SymmetricPairInArray obj = new SymmetricPairInArray();
//        obj.Solution(arr);
//
//    }
//}


import java.util.HashMap;
import java.util.Scanner;

public class SymmetricPairInArray {
    public void Solution(int[][] arr){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
           int first = arr[i][0];
           int second = arr[i][1];
           if(map.containsKey(second) && map.get(second) == first){
               System.out.println("( "+first+" "+second+")");
           }
           map.put(first,second);
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        SymmetricPairInArray obj = new SymmetricPairInArray();
        obj.Solution(arr);

    }
}