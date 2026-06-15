package STRIVERSHEET.String;

import java.util.Scanner;

public class FindLargestWordInString {
    public void solution(String str1){
        StringBuilder sb=new StringBuilder();
        int len =str1.length();
        int i =0,j=0;
        int maxLen = 0,minLen =len,maxStart =0;
        while(j<=len){
            if(j<len&&str1.charAt(j)!=' '){
                j++;
            }else {
                int currentLen=j-i;
                if(currentLen>maxLen){
                    maxLen=currentLen;
                    maxStart=i;
                }
                j++;
                i=j;
            }
        }
         sb.append(str1.substring(maxStart,maxStart+maxLen));
        System.out.println("lasrgest word is " +sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str1=sc.nextLine();
        FindLargestWordInString obj=new FindLargestWordInString();
        obj.solution(str1);
    }
}
