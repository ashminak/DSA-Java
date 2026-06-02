package STRIVERSHEET.NumberSystem;

import java.util.Scanner;

public class ConvertNumToWord {
    public void convertNumToWord(String str) {
        String[] singleDigits= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] twoDigits=  {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensMultiple= {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] tensPower= {"hundred", "thousand"};
        if(str.isEmpty()){
            System.out.println(" ");
            return;
        }
        else if(str.length()==1){
            System.out.println(singleDigits[str.charAt(0)-'0']);
            return;
        }
        int len = str.length();
        for(int i=0;i<str.length();i++){
            if(len>2){
                if(str.charAt(i)!='0'){
                    System.out.println(singleDigits[str.charAt(i)-'0']+" ");
                    System.out.println(twoDigits[len-3]+" ");
                    len--;
                }
            }else {
                if(str.charAt(i)=='1'){
                    System.out.println(twoDigits[str.charAt(i+1)-'0']+" ");
                    return;
                }else if(str.charAt(i)!='0'){
                    System.out.println(tensMultiple[str.charAt(i)-'0']+" ");
                    if(str.charAt(i+1)!='0'){
                        System.out.println(singleDigits[str.charAt(i+1)-'0']+" ");
                        return;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        ConvertNumToWord obj = new ConvertNumToWord();
        obj.convertNumToWord(str);

    }
}
