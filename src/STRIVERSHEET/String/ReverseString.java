package STRIVERSHEET.String;

import java.util.Scanner;
import java.util.Stack;

//public class ReverseString {
//    public String reverseString1(String str) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            stack.push(ch);
//        }
//        StringBuffer sb = new StringBuffer();
//        while (!stack.isEmpty()) {
//            sb.append(stack.pop());
//        }
//        return sb.toString();
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String str = sc.nextLine();
//        ReverseString rs = new ReverseString();
//        String ans=rs.reverseString1(str);
//        System.out.println(ans);
//    }
//}
public class ReverseString {
    public String reverseString1(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(arr);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        ReverseString rs = new ReverseString();
        String ans=rs.reverseString1(str);
        System.out.println(ans);
    }

}
