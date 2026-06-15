package STRIVERSHEET.String;

import java.util.Scanner;

public class CountNumberOfWordsInString {
    public int Solution(String str){
        int space =0;
        for (char ch:str.toCharArray()){
            if(ch==' '){
                space++;
            }
        }
        return space+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str=sc.nextLine();
        CountNumberOfWordsInString obj=new CountNumberOfWordsInString();
        int result=obj.Solution(str);
        System.out.println(result);
    }
}
