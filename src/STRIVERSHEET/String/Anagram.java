package STRIVERSHEET.String;

import java.util.Arrays;
import java.util.Scanner;

//public class Anagram {
//    public boolean anagram(String a, String b) {
//        if (a.length() != b.length()) return false;
//        char[] aArray = a.toCharArray();
//        char[] bArray = b.toCharArray();
//        Arrays.sort(aArray);
//        Arrays.sort(bArray);
//        for (int i = 0;i<a.length();i++) {
//            if (aArray[i] != bArray[i]){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first String: ");
//        String a = sc.nextLine();
//        System.out.println("Enter second String: ");
//        String b = sc.nextLine();
//        Anagram an = new Anagram();
//        boolean ret = an.anagram(a,b);
//        System.out.println(ret);
//    }
//}


public class Anagram {
    public boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {return false;}
        int[] freq = new int[26];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'A']++;
        }
        for (int i = 0; i < b.length(); i++) {
            freq[b.charAt(i) - 'A']--;
        }
        for (int i = 0; i < 26; i++) {
            if(freq[i]!=0)return false;
        }
        return true;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String a = sc.nextLine();
        System.out.println("Enter second String: ");
        String b = sc.nextLine();
        Anagram an = new Anagram();
        boolean ret = an.isAnagram(a,b);
        System.out.println(ret);
    }
}