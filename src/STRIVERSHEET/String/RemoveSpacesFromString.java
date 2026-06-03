package STRIVERSHEET.String;

import java.util.Scanner;

public class RemoveSpacesFromString {
    public String removeSpaces(String s){
        StringBuilder sb = new StringBuilder(s);
        for (char c: s.toCharArray()){

            if (c == ' '){
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
        RemoveSpacesFromString r = new RemoveSpacesFromString();
        System.out.println(r.removeSpaces(s));
    }
}
