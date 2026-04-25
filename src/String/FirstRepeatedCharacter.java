package String;

import java.util.Scanner;

public class FirstRepeatedCharacter {
    public static String firstRepeatedCharacter(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c - 'a'] == 1) {
                return String.valueOf(c);
            }else {
                freq[c - 'a']++;
            }
        }
        return "-1";
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        System.out.println(firstRepeatedCharacter(s));
    }

}
