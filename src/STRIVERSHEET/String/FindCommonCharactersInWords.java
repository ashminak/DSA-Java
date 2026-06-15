package STRIVERSHEET.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindCommonCharactersInWords {
    public List<String> findCommonCharacters(String[] str) {
        int[] minFrq = new int[26];
        for (char c : str[0].toCharArray()) {
            minFrq[c - 'a']++;
        }
        for (int i = 1; i < str.length; i++) {
            int[] freq = new int[26];
            for (char c : str[i].toCharArray()) {
                freq[c - 'a']++;
            }
            for (int j= 0;j<26;j++){
                minFrq[j] = Math.min(minFrq[j],freq[j]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFrq[i] > 0) {
                result.add(String.valueOf((char)(i+'a')));
                minFrq[i]--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        FindCommonCharactersInWords obj = new FindCommonCharactersInWords();
        List<String> result = obj.findCommonCharacters(strArr);
        for (String s : result) {
            System.out.print(s+" ");
        }
    }
}
