package STRIVERSHEET.String;

import java.util.Scanner;

public class FindStartIndexOfSubStringInString {
    public int solution(String s1, String s2){
        return s1.indexOf(s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        System.out.println("Enter the string");
        String s2 = sc.nextLine();
        FindStartIndexOfSubStringInString obj = new FindStartIndexOfSubStringInString();
        int ret = obj.solution(s1,s2);
        System.out.println(ret);
    }
}
