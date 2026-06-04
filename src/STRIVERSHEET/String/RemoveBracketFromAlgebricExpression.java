package STRIVERSHEET.String;

import java.util.Scanner;

public class RemoveBracketFromAlgebricExpression {
    public String removeBrackets(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != '('&& ch != ')') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        RemoveBracketFromAlgebricExpression obj = new RemoveBracketFromAlgebricExpression();
        String ans = obj.removeBrackets(str);
        System.out.println(ans);
    }
}
