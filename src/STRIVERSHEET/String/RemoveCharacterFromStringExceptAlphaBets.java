package STRIVERSHEET.String;

import java.util.Scanner;

public class RemoveCharacterFromStringExceptAlphaBets {
    public String removeCharacter(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
           if(c>='a' && c<='z'||c>='A' && c<='Z') {
               sb.append(c);
           }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        RemoveCharacterFromStringExceptAlphaBets r = new RemoveCharacterFromStringExceptAlphaBets();
        System.out.println(r.removeCharacter(s));
    }
}
