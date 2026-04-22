package String;

import java.util.Scanner;
import java.util.Stack;

public class SwapToBalance {
    public static int minSwaps(String s) {
        int len = s.length();
        if(len%2!=0){
            return -1;
        }
        Stack<Character> st = new Stack<>();
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch=='['){
                st.push(ch);
            } else if (ch==']'&&!st.empty()) {
                st.pop();
            }else {
                st.push('[');
                cnt++;
            }
        }
        cnt+=st.size()/2;
        return cnt/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        System.out.println(minSwaps(s));

    }
}
