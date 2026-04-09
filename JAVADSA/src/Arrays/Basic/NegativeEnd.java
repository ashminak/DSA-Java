package Arrays.Basic;//package Arrays.Basic;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class NegativeEnd {
//    public static void Solution(int[] arr,int n){
//        List<Integer> positive= new ArrayList<>();
//        List<Integer> negative= new ArrayList<>();
//
//        for(int i=0;i<n;i++){
//            if(arr[i]>=0){
//                positive.add(arr[i]);
//            } else if (arr[i]<0) {
//                negative.add(arr[i]);
//            }
//        }
//
//        int index=0;
//        for (int x:negative){
//            arr[index++]=x;
//        }
//        for (int x:positive){
//            arr[index++]=x;
//        }
//
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array size: ");
//        int n= scanner.nextInt();
//        int []arr=new int[n];
//        System.out.println("Enter array elements: ");
//        for (int i=0;i<n;i++) arr[i]= scanner.nextInt();
//        Solution(arr,n);
//        for(int x: arr){
//            System.out.print(x+" ");
//        }
//
//    }
//}


import java.util.Scanner;

public class NegativeEnd {
    public static void Solution(int[] arr,int n){
        int left=0;
        int right=n-1;

        while (left<=right){
            if(arr[left]>=0&&arr[right]<0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }else {
                if(arr[left]<0){
                    left++;
                } else if (arr[right]>=0) {
                    right--;
                }
            }
        }
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++)arr[i]= scanner.nextInt();
        Solution(arr,n);
        for (int x:arr){
            System.out.println(x+" ");
        }
    }
}

//Brute ForceOptimalTimeO(N)O(N) ⚡SpaceO(N) 🐢O(1) ⭐IdeaSeparate into two lists, mergeTwo pointers swap in-place