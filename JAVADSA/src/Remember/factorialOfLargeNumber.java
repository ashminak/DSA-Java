//https://www.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1
////import java.math.BigInteger;
////import java.util.ArrayList;
////import java.util.Collections;
////import java.util.Scanner;
////
////public class factorialOfLargeNumber{
////    //Bruteforce Approach
////   public   static ArrayList<Integer> factorial(int N){
////        BigInteger result = BigInteger.ONE;
////
////        for(int i=2; i<=N;i++){
////            result = result.multiply(BigInteger.valueOf(i));
////        }
////        String number = result.toString();
////        ArrayList<Integer> ans= new ArrayList<>();
////        for(char c:number.toCharArray()){
////            ans.add(c - '0');
////        }
////        return  ans;
////    }
////
////   public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////         int N = sc.nextInt();
////
////         ArrayList<Integer> result = factorial(N);
////         for (int digit:result){
////             System.out.print(digit);
////         }
////
////    }
////
////
////
////}
//
//
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//class Solution {
//    public static ArrayList<Integer> factorial(int n) {
//        // code here
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        for(int num=2;num<=n;num++){
//            int carry=0;
//            for(int i=0;i<list.size();i++){
//                int val =list.get(i)*num+carry;
//                list.set(i,val%10);
//                carry=(val/10);
//            }
//            while(carry>0){
//                list.add(carry%10);
//                carry=carry/10;
//            }
//        }
//        Collections.reverse(list);
//        return list;
//
//    }
//
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//
//        ArrayList<Integer> result = factorial(n);
//
//        for(int digit: result){
//            System.out.println(digit);
//        }
//    }
//}
