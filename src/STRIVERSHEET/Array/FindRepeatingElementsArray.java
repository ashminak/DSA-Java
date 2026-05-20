package STRIVERSHEET.Array;//package STRIVERSHEET.Array;
//
//import java.util.Scanner;
//
//public class FindRepeatingElementsArray {
//    public void Solution(int[] arr){
//        int n = arr.length;
//        int[] dup = new int[n];
//        int count=0;
//        for(int i=0;i<n-1;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]==arr[j]){
//                    dup[count++]=arr[i];
//                }
//            }
//
//        }
//        for(int i=0;i<count;i++){
//            if(i==0 || dup[i]!=dup[i-1]){
//                System.out.println(dup[i]+" ");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of the array: ");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        FindRepeatingElementsArray obj = new FindRepeatingElementsArray();
//        obj.Solution(arr);
//    }
//}


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindRepeatingElementsArray {
    public  void Solution(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i :arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println("The repeating elements in the array are:");
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
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
        FindRepeatingElementsArray obj = new FindRepeatingElementsArray();
        obj.Solution(arr);
    }
}