package STRIVERSHEET.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumOccurringCharInString {
    public char Solution(String S) {
        Map<Character, Integer> freq = new HashMap<Character, Integer>();
//        for (int i = 0; i < S.length(); i++) {
//            freq.put(S.charAt(i), freq.getOrDefault(S.charAt(i), 0) + 1);
//        }
        for(char c : S.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int maxFreq =0;
        char maxChar = '\0';
        for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if(entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        return maxChar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String S = sc.nextLine();
        sc.close();
        MaximumOccurringCharInString obj = new MaximumOccurringCharInString();
        char ch = obj.Solution(S);
        System.out.println(ch);
    }
}
