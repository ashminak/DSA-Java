package STRIVERSHEET.String;

import java.util.Scanner;

public class ASCII {
    public void Solution(char c){
        System.out.println("ASCII value is "+(int)c);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = input.next().charAt(0);
        ASCII a = new ASCII();
        a.Solution(c);
    }
}
