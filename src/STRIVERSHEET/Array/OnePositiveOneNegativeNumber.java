package STRIVERSHEET.Array;//package STRIVERSHEET.Array;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class OnePositiveOneNegativeNumber {
//    public static ArrayList<Integer> Solution(ArrayList<Integer> arr){
//        ArrayList<Integer> positive = new ArrayList<>();
//        ArrayList<Integer> negative = new ArrayList<>();
//
//        for(int i=0;i<arr.size();i++){
//            if(arr.get(i)>=0){
//                positive.add(arr.get(i));
//            }else {
//                negative.add(arr.get(i));
//            }
//        }
//        int p = 0;
//        int n = 0;
//        int i = 0;
//        while (p<positive.size() && n<negative.size()){
//            if(i%2==0){
//                arr.set(i,positive.get(p));
//                p++;
//                i++;
//            }else{
//                arr.set(i,negative.get(n));
//                n++;
//                i++;
//            }
//        }
//        while (p<positive.size()){
//            arr.set(i,positive.get(p));
//            p++;
//            i++;
//        }
//        while (n<negative.size()){
//            arr.set(i,negative.get(n));
//            n++;
//            i++;
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array: ");
//        int n = sc.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        System.out.println("Enter the elements in the array: ");
//        for (int i=0;i<n;i++){
//            arr.add(sc.nextInt());
//        }
//        Solution(arr);
//        System.out.println("Rearranged array is : ");
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//
//    }
//}

import java.util.ArrayList;
import java.util.Scanner;

public class OnePositiveOneNegativeNumber {
    public static ArrayList<Integer> onePositive(ArrayList<Integer> arr){
        ArrayList<Integer> temp = new ArrayList<>(arr);
        int posIndx =0;
        int negIndx =1;
        for(int i=0;i<arr.size();i++){
            if(temp.get(i)>=0 && posIndx< arr.size()){
                arr.set(posIndx,temp.get(i));
                posIndx+=2;
            } else if (temp.get(i)<0 && negIndx<arr.size()) {
                arr.set(negIndx,temp.get(i));
                negIndx+=2;
            }
        }
        return arr;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements in the array: ");
        for (int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        onePositive(arr);
        System.out.println("Rearranged array is : ");
        for(int x:arr){
            System.out.print(x+" ");
        }

    }

}
