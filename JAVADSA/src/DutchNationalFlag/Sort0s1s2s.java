package DutchNationalFlag;//package DutchNationalFlag;
//
//import java.util.Scanner;
//
//public class Sort0s1s2s {
//    public static void Solution(int [] arr){
//        int n = arr.length;
//        int count0=0;int count1=0;int count2=0;
//        for(int i =0;i<n;i++){
//            if(arr[i]==0) count0++;
//            else if (arr[i]==1) count1++;
//            else count2++;
//        }
//        int index=0;
//        for (int i =0; i<count0;i++){
//         arr[index++]= 0;
//        }
//        for (int i =0; i<count1;i++){
//            arr[index++]= 1;
//        }
//        for (int i =0; i<count2;i++){
//            arr[index++]= 2;
//        }
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length: ");
//        int n = scanner.nextInt();
//        System.out.println("Enter array elements: ");
//        int[] arr = new int[n];
//        for (int i =0;i<n;i++) arr[i]= scanner.nextInt();
//        Solution(arr);
//        for(int x : arr){
//            System.out.print(x + " ");
//        }
//    }
//}


import java.util.Scanner;

public class Sort0s1s2s {
    public static void Solution(int[] arr){
        int n = arr.length;
        int low=0;
        int mid=0;
        int high =n-1;

        while (mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }else {
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
        static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr = new int[n];
        for (int i =0;i<n;i++) arr[i]= scanner.nextInt();
        Solution(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }

}

//Brute ForceOptimalTimeO(N) — 2 passesO(N) — 1 pass ⚡SpaceO(1)O(1) ⭐Passes needed2 (count + fill)1 (single scan)IdeaCount then fillDutch National FlagBest forUnderstandingInterviews ⭐