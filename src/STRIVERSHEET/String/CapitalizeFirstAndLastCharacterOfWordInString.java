package STRIVERSHEET.String;

import java.util.Scanner;

public class CapitalizeFirstAndLastCharacterOfWordInString {
    public String solution(String str) {
        char[] arr = str.toCharArray();
        int start =0;
        int n = arr.length;
        while(start<n){
            while (start<n && arr[start]==' '){
                start++;
            }
            if(start>=n){
                break;
            }
            int end=start;
            while (end<n && arr[end]!=' '){
                end++;
            }
            if(Character.isLowerCase(arr[start])){
                arr[start]=Character.toUpperCase(arr[start]);
            }
            if(Character.isUpperCase(arr[end-1])){
                arr[end-1]=Character.toLowerCase(arr[end-1]);
            }
            start=end;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        CapitalizeFirstAndLastCharacterOfWordInString obj = new CapitalizeFirstAndLastCharacterOfWordInString();
        String ans = obj.solution(str);
        System.out.println(ans);
    }
}
