package STRIVERSHEET.String;

import java.util.Scanner;

//public class PalindromeString {
//    public String isPalindrome(String str) {
//        int n = str.length();
//        for (int i = 0; i <= n / 2; i++) {
//            if (str.charAt(i) != str.charAt(n - i - 1)) {
//                return "NO";
//            }
//        }
//        return "YES";
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string");
//        String str = sc.next();
//        PalindromeString p = new PalindromeString();
//        String palindrome = p.isPalindrome(str);
//        System.out.println(palindrome);
//    }
//}
public class PalindromeString {
    public boolean isPalindrome(String str) {
        if(str.isEmpty()){
            return true;
        }
        int n = str.length();
        int start = 0;
        int end = n-1;
        while(start<=end){
            char currFirst = str.charAt(start);
            char currLast = str.charAt(end);
            if(!Character.isLetterOrDigit(currFirst)){
                start++;
            }else if(!Character.isLetterOrDigit(currLast)){
                end--;
            }else {
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        PalindromeString p = new PalindromeString();
        boolean palindrome = p.isPalindrome(str);
        System.out.println(palindrome);
    }

}
