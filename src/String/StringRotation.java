package String;

import java.util.Scanner;
//Check any rotation not just 2 places
//public class StringRotation {
//    public static boolean rotateString(String A, String B) {
//        if (A.length() != B.length()) {return false;}
//        if(A.length()<2)return A.equals(B);
//        String con = A+A;
//        return con.equals(B);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String: ");
//        String A = sc.next();
//        System.out.println("Enter the goal String: ");
//        String B = sc.next();
//        System.out.println(rotateString(A, B));
//    }
//}
public class StringRotation {
    public static boolean rotateString(String str1, String str2) {
        int len1 = str1.length();
        if(str1.length()!=str2.length()) return false;
        if(str1.length()<2) return str1.equals(str2);
        String left = str1.substring(2)+str1.substring(0,2);
        String right = str1.substring(len1-2)+str1.substring(len1-2);
        return str2.equals(left) || str2.equals(right);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str1 = sc.next();
        System.out.println("Enter the goal String: ");
        String str2 = sc.next();
        System.out.println(rotateString(str1,str2));
    }
}
