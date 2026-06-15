package STRIVERSHEET.String;

import java.util.Scanner;

//public class RemoveDuplicatesFromString {
//    public String Solution(String S) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < S.length(); i++) {
//            boolean isDuplicate = false;
//            for (int j = 0; j < sb.length(); j++) {
//                if (S.charAt(i) == sb.charAt(j)) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                sb.append(S.charAt(i));
//            }
//        }
//        return sb.toString();
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a String");
//        String S = in.nextLine();
//        RemoveDuplicatesFromString obj = new RemoveDuplicatesFromString();
//        System.out.println(obj.Solution(S));
//    }
//}


public class RemoveDuplicatesFromString {
    public String Solution(String S) {
        boolean[] seen = new boolean[26];
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (!seen[c - 'a']) {
                seen[c - 'a'] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String S = in.nextLine();
        RemoveDuplicatesFromString obj = new RemoveDuplicatesFromString();
        System.out.println(obj.Solution(S));
    }

}