package Arrays.Basic;//package Arrays.Basic;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class DuplicatesNum {
//    public static ArrayList<Integer> Solution(int[] arr){
//        int n =arr.length;
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i =0;i<n;i++){
//             for (int j=i+1;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     if(!list.contains(arr[i])){
//                         list.add(arr[i]);
//                     }
//                 }
//             }
//        }
//        ArrayList<Integer> list1 = new ArrayList<>();
//        if(list.isEmpty()){
//            return list1;
//        }
//        return list;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array Size: ");
//         int n = scanner.nextInt();
//         int[] arr=new int[n];
//        System.out.println("Enter array elements: ");
//         for (int i=0;i<n;i++){
//             arr[i]= scanner.nextInt();
//         }
//        List<Integer> result = Solution(arr);
//         for(int x: result){
//             System.out.print(x+" ");
//         }
//    }
//}


import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DuplicatesNum {

    public static ArrayList<Integer> Solution(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> frequency = new TreeMap<>();

        for(int i=0;i<n;i++){
            frequency.put(arr[i], frequency.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:frequency.entrySet()){
            if(entry.getValue()>1){
                list.add(entry.getKey());
            }
        }
        ArrayList<Integer> list1= new ArrayList<>();
        if(list.isEmpty()){
            return list1;
        }
        return list;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter elements of array: ");
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        ArrayList<Integer> result =Solution(arr);

        for (int x:result){
            System.out.print(x+" ");
        }
    }

}
