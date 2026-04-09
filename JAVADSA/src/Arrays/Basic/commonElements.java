package Arrays.Basic;//package Arrays.Basic;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class commonElements {
//    public static List<Integer> solution(List<Integer> arr1,List<Integer> arr2,List<Integer> arr3){
//
//        List<Integer> result = new ArrayList<>();
//        int i=0;
//        int j=0;
//        int k=0;
//        while(i < arr1.size() && j < arr2.size() && k < arr3.size() ){
//            int a=arr1.get(i);
//            int b=arr2.get(j);
//            int c=arr3.get(k);
//
//            if(a==b&&b==c){
//                result.add(a);
//                int common= a;
//
//                while (i<arr1.size()&&arr1.get(i)==common)i++;
//                while (j<arr2.size()&&arr2.get(j)==common)j++;
//                while (k<arr3.size()&&arr3.get(k)==common)k++;
//
//            }else if (a<b){
//                i++;
//            } else if (b<c) {
//               j++;
//            }else {
//                k++;
//            }
//
//
//        }
//        if(result.isEmpty()){
//            result.get(-1);
//        }
//        return result;
//
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter how many element you will enter for arr1: ");
//        int n1= scanner.nextInt();
//        List<Integer> arr1= new ArrayList<>();
//        System.out.println("Enter input for arr1: ");
//        for(int i=0;i<n1;i++){
//            arr1.add(scanner.nextInt());
//        }
//
//        System.out.println("Enter how many element you will enter for arr2: ");
//        int n2= scanner.nextInt();
//        List<Integer> arr2= new ArrayList<>();
//        System.out.println("Enter input for arr2: ");
//        for (int j=0;j<n2;j++){
//            arr2.add(scanner.nextInt());
//        }
//
//        System.out.println("Enter how many element you will enter for arr3: ");
//        int n3= scanner.nextInt();
//        List<Integer> arr3=new ArrayList<>();
//        System.out.println("Enter input for arr3: ");
//        for (int k=0;k<n3;k++){
//            arr3.add(scanner.nextInt());
//        }
//
//        List<Integer> result=solution(arr1,arr2,arr3);
//        for (int x:result){
//            System.out.println(x+" ");
//        }
//    }
//
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class commonElements {
    public static List<Integer> solution(List<Integer> arr1,List<Integer> arr2,List<Integer> arr3){
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<arr1.size();i++){
            if(i>0&&arr1.get(i).equals(arr1.get(i-1)))continue;
            boolean inB =false;
            boolean inC =false;
            for (int j=0;j<arr2.size();j++){
                if(arr2.get(j).equals(arr1.get(i))){
                    inB=true;
                    break;
                }
            }
            for (int k=0;k<arr3.size();k++){
                if(arr3.get(k).equals(arr1.get(i))){
                    inC=true;
                    break;
                }
            }
            if(inB&&inC){
                result.add(arr1.get(i));
            }
        }
        if(result.isEmpty()){
            result.add(-1);
        }
        return result;
    }

    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter how many element you will enter for arr1: ");
        int n1= scanner.nextInt();
        List<Integer> arr1=new ArrayList<>();
        System.out.println("Enter input for arr1: ");
        for (int i=0;i<n1;i++){
            arr1.add(scanner.nextInt());
        }

        System.out.println("Enter how many element you will enter for arr2: ");
        int n2= scanner.nextInt();
        List<Integer> arr2=new ArrayList<>();
        System.out.println("Enter input for arr2: ");
        for (int j=0;j<n2;j++){
            arr2.add(scanner.nextInt());
        }

        System.out.println("Enter how many element you will enter for arr3: ");
        int n3= scanner.nextInt();
        List<Integer> arr3=new ArrayList<>();
        System.out.println("Enter input for arr3: ");
        for (int k=0;k<n3;k++){
            arr3.add(scanner.nextInt());
        }

        List<Integer> result = solution(arr1,arr2,arr3);
        for (int x:result){
            System.out.println(x+" ");
        }
    }
}
