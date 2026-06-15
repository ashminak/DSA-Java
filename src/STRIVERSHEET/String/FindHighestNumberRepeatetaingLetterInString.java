package STRIVERSHEET.String;

import java.util.Scanner;

public class FindHighestNumberRepeatetaingLetterInString {
    public void Solution(String str){
        int len=str.length();
        int maximumWord = 0;
        int currMaximumWord = 0;
        String result = "";
        for (int left =0;left<len;){
            int right=left+1;
            while (right<len && str.charAt(right)!=' '){
                right++;
            }
            int[] freq=new int[26];
            currMaximumWord = 0;
            for (int i=left;i<right;i++){
                freq[str.charAt(i)-'a']++;
            }
            for (int i=0;i<26;i++){
                if (freq[i]>1){
                    currMaximumWord++;
                }
            }
            if (currMaximumWord>maximumWord){
                maximumWord=currMaximumWord;
                result=str.substring(left,right);
            }
            left=right+1;
            if(result.isEmpty()){
                System.out.println("-1");
            }else {
                System.out.println("Word with highest number of repeated letter "+result);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        FindHighestNumberRepeatetaingLetterInString obj=new FindHighestNumberRepeatetaingLetterInString();
        obj.Solution(str);
    }
}
