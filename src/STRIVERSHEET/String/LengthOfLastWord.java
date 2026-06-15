package STRIVERSHEET.String;

import java.util.Scanner;

public class LengthOfLastWord {
    public void Solution(String str){
        str=str.trim();
        int len= 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i)!=' '){
                len++;
            } else if (len>0) {
                break;
            }
        }
        System.out.println(len);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str1=sc.nextLine();
        LengthOfLastWord obj=new LengthOfLastWord();
        obj.Solution(str1);
    }
}
