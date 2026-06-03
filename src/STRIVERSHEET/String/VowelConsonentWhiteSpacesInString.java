package STRIVERSHEET.String;

import java.util.Scanner;

public class VowelConsonentWhiteSpacesInString {
    public void Solution(String s){
        int vowels = 0;
        int consonents = 0;
        int whitespaces = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'){
                vowels++;
            }else if(c>='a'&&c<='z'){
                consonents++;
            }else if(c==' '){
                whitespaces++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonents);
        System.out.println(whitespaces);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        VowelConsonentWhiteSpacesInString w = new VowelConsonentWhiteSpacesInString();
        w.Solution(s);
    }
}
