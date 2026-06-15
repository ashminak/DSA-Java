package STRIVERSHEET.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsInString {
    public String reverseWords(String s){
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            } else if (sb.length()>0) {
                words.add(sb.toString());
                sb.setLength(0);
            }
        }
        if(sb.length()>0){
            words.add(sb.toString());
        }
        Collections.reverse(words);
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();
        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
        System.out.println(reverseWordsInString.reverseWords(s));
        
    }
}
