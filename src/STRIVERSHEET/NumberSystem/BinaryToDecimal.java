package STRIVERSHEET.NumberSystem;

import java.util.Scanner;

//public class BinaryToDecimal {
//    public int Solution(String n){
//        int base =1;
//        int ans =0;
//        for (int i =n.length()-1;i>=0;i--){
//            if(n.charAt(i)=='1'){
//                ans +=base;
//            }
//            base*=2;
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        String n = sc.next();
//        BinaryToDecimal b = new BinaryToDecimal();
//        int rs = b.Solution(n);
//        System.out.println(rs);
//    }
//}

public class BinaryToDecimal {
    public int Solution(String n){
        return Integer.parseInt(n,2);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String n = sc.next();
        BinaryToDecimal b = new BinaryToDecimal();
        int rs = b.Solution(n);
        System.out.println(rs);
    }
}
