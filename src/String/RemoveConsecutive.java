package String;

import java.util.Scanner;

public class RemoveConsecutive {
    public String removeConsecutive(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = in.nextLine();
        RemoveConsecutive r = new RemoveConsecutive();
        String str1 = r.removeConsecutive(str);
        System.out.println(str1);
    }
}

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/?utm_source=chatgpt.com