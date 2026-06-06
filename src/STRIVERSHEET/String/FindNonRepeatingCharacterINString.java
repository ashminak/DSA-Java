package STRIVERSHEET.String;

import java.util.Scanner;

//public class FindNonRepeatingCharacterINString {
//    public void Solution(String s){
//        int[] freq = new int[200];
//        char[] arr = s.toCharArray();
//
//        for(int i = 0; i < s.length(); i++){
//            freq[i] = 1;
//            for(int j = i+1; j < s.length(); j++){
//                if(arr[i] == arr[j]){
//                    freq[i]++;
//                    arr[j]='-';
//                }
//            }
//        }
//        for(int i = 0; i < s.length(); i++){
//            if(freq[i] == 1 && arr[i] != '-' && arr[i] != ' '){
//                System.out.print(arr[i]+" ");
//            }
//        }
//    }
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String s = in.nextLine();
//        FindNonRepeatingCharacterINString f = new FindNonRepeatingCharacterINString();
//        f.Solution(s);
//    }
//}

public class FindNonRepeatingCharacterINString {
    public void Solution(String s){
        int[] freq = new int[200];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==' '){
                continue;
            }else {
                freq[s.charAt(i)-'a']++;
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i)-'a']==1 && s.charAt(i)-'a'!=' '){
                System.out.print(s.charAt(i));
            }
        }
    }
        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine();
        FindNonRepeatingCharacterINString f = new FindNonRepeatingCharacterINString();
        f.Solution(s);
    }
}