package SlidingWindow;//package SlidingWindow;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class MinWindowSubstring {
//    public static boolean isValid(Map<Character,Integer> tMap,Map<Character,Integer> windowMap){
//        for(Map.Entry<Character,Integer> entry: tMap.entrySet()){
//            char c = entry.getKey();
//            int needed = entry.getValue();
//            if(windowMap.getOrDefault(c,0)<needed){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static String Solution(String s, String t){
//        int n = s.length();
//        Map<Character,Integer> tMap= new HashMap<>();
//        for (char c : t.toCharArray()){
//            tMap.put(c,tMap.getOrDefault(c,0)+1);
//        }
//        int minLen =Integer.MAX_VALUE;
//        String minWin = " ";
//
//        for(int i =0;i<n;i++){
//            Map<Character,Integer> windowMap = new HashMap<>();
//            for(int j =i;j<n;j++){
//              windowMap.put(s.charAt(j),
//                      windowMap.getOrDefault(s.charAt(j),0)+1);
//
//              if (isValid(tMap,windowMap)){
//                  int windowLen = j-i+1;
//                  if(minLen>windowLen){
//                      minLen =windowLen;
//                      minWin = s.substring(i,j+1);
//                  }
//                    break;
//              }
//            }
//
//        }
//        return minWin;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first string: ");
//        String s = scanner.next();
//        System.out.println("Enter second string: ");
//        String t = scanner.next();
//        System.out.println(Solution(s,t));
//    }
//}


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinWindowSubstring {
    public static String Solution(String s, String t){
        int n = s.length();
        Map<Character,Integer> tMap = new HashMap<>();
        for(char c: t.toCharArray()){
            tMap.put(c,tMap.getOrDefault(c,0)+1);
        }
    Map<Character,Integer> windowMap = new HashMap<>();
        int windowSize =0;
        int j =0;
        int minLen = Integer.MAX_VALUE;
        int minleft = -1;
        int uniqueLET = tMap.size();

        for (int i =0;i<n;i++){
            char rightChar = s.charAt(i);
            windowMap.put(rightChar,
                    windowMap.getOrDefault(rightChar,0)+1);
            if(tMap.containsKey(rightChar)&&
            windowMap.get(rightChar).equals(tMap.get(rightChar))){
                windowSize++;
            }
            while (windowSize==uniqueLET){
                if(i-j+1<minLen){
                    minLen=i-j+1;
                    minleft=j;
                }
                char leftChar = s.charAt(j);
                windowMap.put(leftChar,windowMap.get(leftChar)-1);

                if (tMap.containsKey(leftChar)&&
                windowMap.get(leftChar)<tMap.get(leftChar)){
                windowSize--;
                }
                j++;
            }
        }
        return minleft == -1 ? "" : s.substring(minleft, minleft + minLen);

    }
        static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s = scanner.next();
        System.out.println("Enter second string: ");
        String t = scanner.next();
        System.out.println(Solution(s,t));
    }
}