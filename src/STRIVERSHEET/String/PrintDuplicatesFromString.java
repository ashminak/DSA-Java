package STRIVERSHEET.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//public class PrintDuplicatesFromString {
//    public void printDuplicatesFromString(String str) {
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        for (int i = 0; i < str.length(); i++) {
//            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//        }
//        for (Map.Entry<Character,Integer> entry:map.entrySet()){
//            if(entry.getValue()>1){
//                System.out.println(entry.getKey()+" - "+entry.getValue());
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String str = sc.nextLine();
//        PrintDuplicatesFromString p = new PrintDuplicatesFromString();
//        p.printDuplicatesFromString(str);
//        sc.close();
//    }
//}

public class PrintDuplicatesFromString {
    public void printDuplicatesFromString(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i <freq.length; i++) {
            if(freq[i]>1){
                System.out.println((char) i+'a'+" - "+freq[i]);
            }
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        PrintDuplicatesFromString p = new PrintDuplicatesFromString();
        p.printDuplicatesFromString(str);
        sc.close();
    }
}