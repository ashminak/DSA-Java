package Arrays.Basic;//package Arrays.Basic;
//
//import java.util.Scanner;
//
//public class Palindrome {
//    public static boolean isPalindrome(int num){
//        String orginal = Integer.toString(num);
//        String reverse = new StringBuilder(orginal).reverse().toString();
//
//        return orginal.equals(reverse);
//    }
//    public static boolean palinArray(int[] arr){
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            if(!isPalindrome(arr[i])){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array size: ");
//        int n = scanner.nextInt();
//        int[] arr= new int[n];
//        System.out.println("Enter array elements: ");
//        for(int i=0;i<n;i++) arr[i]= scanner.nextInt();
//        System.out.println(palinArray(arr));
//    }
//
//}


import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int num){
        int orginal= num;
        int reverseNo=0;
        int rem=0;
        while(num>0){
            rem= num%10;
            reverseNo=reverseNo*10+rem;
            num=num/10;
        }
        return orginal==reverseNo;
    }
    public static boolean palinArray(int[] arr){
        int  n = arr.length;
        for(int i=0;i<n;i++){
            if(!isPalindrome(arr[i])){
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++) arr[i]= scanner.nextInt();
        System.out.println(palinArray(arr));
    }
}

//Brute | ForceOptimalTime | O(N × D)O(N × D) | SpaceO(D) O(1)