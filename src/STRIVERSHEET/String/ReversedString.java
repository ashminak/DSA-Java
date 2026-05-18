package STRIVERSHEET.String;

import java.util.Stack;

//public class ReversedString {
//    public void Solution(String S) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < S.length(); i++) {
//            stack.push(S.charAt(i));
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        while (!stack.isEmpty()) {
//            stringBuilder.append(stack.pop());
//        }
//        stringBuilder.toString();
//    }
//}

public class ReversedString {
    public void reverseString(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
