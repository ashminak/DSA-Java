package STRIVERSHEET.String;

import java.util.Arrays;
import java.util.Scanner;

//public class CountFrequencyOfCharactersInString {
//    public void Solution(String S) {
//        char[] arr = S.toCharArray();
//        Arrays.sort(arr);
//        char ch = arr[0];
//        int count = 1;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] == ch) {
//                count++;
//            }else {
//                System.out.println(ch+" "+count+" ");
//                ch = arr[i];
//                count = 1;
//            }
//        }
//        System.out.println(ch+" "+count+" ");
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String S = sc.next();
//        CountFrequencyOfCharactersInString solution = new CountFrequencyOfCharactersInString();
//        solution.Solution(S);
//    }
//}

public class CountFrequencyOfCharactersInString {
    public void Solution(String s){
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(freq[i]!=0){
                System.out.println((char)(i+'a')+freq[i]+" ");
            }
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String S = sc.next();
        CountFrequencyOfCharactersInString solution = new CountFrequencyOfCharactersInString();
        solution.Solution(S);
    }
}




















