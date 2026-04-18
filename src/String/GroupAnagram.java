package String;//package String;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class GroupAnagram {
//    public List<Integer> groupAnagrams(String s, String p) {
//        List<Integer> ans = new ArrayList<>();
//        char[] sorted1 = p.toCharArray();
//        Arrays.sort(sorted1);
//        int n = s.length();
//        int m  = p.length();
//        for (int i = 0; i <= n - m; i++) {
//            char[] sub = s.substring(i, i + m).toCharArray();
//            Arrays.sort(sub);
//            if(Arrays.equals(sub, sorted1)) {
//                ans.add(i);
//            }
//        }
//        return ans;
//    }
//
//    static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a String: ");
//        String s = in.next();
//        System.out.println("Enter target String:");
//        String p = in.next();
//        GroupAnagram obj = new GroupAnagram();
//        List<Integer> ans = obj.groupAnagrams(s, p);
//        System.out.println(ans);
//    }
//
//}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GroupAnagram {
    public List<Integer> groupAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()) return ans;
        int n = s.length();
        int m = p.length();
        int [] freq1 = new int[26];
        int [] freq2 = new int[26];
        for(int i=0;i<m;i++){
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)){
            ans.add(0);
        }

        for(int i=m;i<n;i++){
            freq2[s.charAt(i)-'a']++;
            freq2[s.charAt(i-m)-'a']--;
            if(Arrays.equals(freq1,freq2)){
                ans.add(i-m+1);
            }
        }
        return ans;
    }
        static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = in.next();
        System.out.println("Enter target String:");
        String p = in.next();
        GroupAnagram obj = new GroupAnagram();
        List<Integer> ans = obj.groupAnagrams(s, p);
        System.out.println(ans);
    }
}