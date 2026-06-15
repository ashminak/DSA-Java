package STRIVERSHEET.String;

import java.util.Scanner;

public class MergeStringAlternatively {
    public void solution(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i =0;
        int j =0;
        while(i<s1.length()&&j<s2.length()){
            sb.append(s1.charAt(i++));
            sb.append(s2.charAt(j++));
        }
        while(i<s1.length()){
            sb.append(s1.charAt(i++));
        }
        while(j<s2.length()){
            sb.append(s2.charAt(j++));
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        System.out.println("Enter the String");
        String s2 = sc.nextLine();
        MergeStringAlternatively sm = new MergeStringAlternatively();
        sm.solution(s1,s2);
    }
}
