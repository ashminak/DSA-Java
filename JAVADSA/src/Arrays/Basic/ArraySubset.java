package Arrays.Basic;

import java.util.Scanner;

//package Arrays.Basic;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class ArraySubset {
//
//    public static boolean isSubset(int a[], int b[]){
//        HashMap<Integer,Integer> map= new HashMap<>();
//        for(int i=0;i<a.length;i++){
//            map.put(a[i],map.getOrDefault(a[i],0)+1);
//        }
//
//        for(int i=0;i<b.length;i++){
//            if(map.getOrDefault(b[i],0)==0){
//             return false;
//            }
//            map.put(b[i],map.get(b[i])-1);
//        }
//        return true;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your total array input: ");
//        int n = scanner.nextInt();
//        System.out.println("Enter your total subarray input: ");
//        int m= scanner.nextInt();
//        int a[] = new int[n];
//        int b[] = new int[m];
//        for(int i =0;i<n;i++){
//            System.out.print("Enter each input of array: ");
//            a[i]= scanner.nextInt();
//        }
//        System.out.println();
//        for(int i=0;i<m;i++){
//            System.out.println("Enter each input of subarray: ");
//            b[i]= scanner.nextInt();
//        }
//
//        System.out.println(isSubset(a,b));
//    }
//}
public class ArraySubset {

    public static boolean isSubArray(int a[],int b[]){
        for (int i=0;i<b.length;i++){
            boolean found = false;
            for (int j=0;j<a.length;j++){
                if(b[i]==a[j]){
                    found=true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your total array input: ");
        int n = scanner.nextInt();
        System.out.println("Enter your total subarray input: ");
        int m = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter each input of array: ");
            a[i] = scanner.nextInt();
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.println("Enter each input of subarray: ");
            b[i] = scanner.nextInt();
        }

        System.out.println(isSubArray(a, b));
    }

    public static class CyclicRotateOne {
        public static void Solution(int[] arr, int d){
             int n = arr.length;

             d = d%n;
             int[] temp= new int[d];
             for (int i=0;i<d;i++){
                 arr[i]= temp[i];
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
}