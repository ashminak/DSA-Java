package String;

import java.util.Scanner;

public class RemoveConsecutiveCharacter {
    String removeConsecutiveCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if(i==0||str.charAt(i)!=str.charAt(i-1)) {
                sb.append(str.charAt(i));
                i++;
            }else {
                while(i<str.length()&&str.charAt(i)==str.charAt(i-1)) {
                    i++;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        RemoveConsecutiveCharacter sol = new RemoveConsecutiveCharacter();
        String result = sol.removeConsecutiveCharacters(str);
        System.out.println(result);
    }
}
