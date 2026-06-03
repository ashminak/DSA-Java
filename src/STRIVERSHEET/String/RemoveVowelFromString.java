package STRIVERSHEET.String;

import java.util.Scanner;

public class RemoveVowelFromString {
    public String removeVowels(String s){
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            c = Character.toLowerCase(c);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        RemoveVowelFromString r = new RemoveVowelFromString();
        System.out.println(r.removeVowels(s));
    }
}
