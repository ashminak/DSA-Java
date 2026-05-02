package QueueAndStack;

import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {
    public boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }else {
                if (stack.isEmpty()) return false;
                if (stack.peek() == '('&&c!=')') return false;
                if (stack.peek() == '['&&c!=']') return false;
                if (stack.peek() == '{'&&c!='}') return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        validParenthesis s1 = new validParenthesis();
        System.out.println(s1.isValidParentheses(s));

    }
}
