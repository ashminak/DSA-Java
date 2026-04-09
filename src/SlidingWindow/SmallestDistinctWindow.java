//https://www.geeksforgeeks.org/problems/smallest-distant-window3132/1
package SlidingWindow;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SmallestDistinctWindow {
    public static int Solution(String s){
        int n = s.length();

        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            set.add(c);
        }

        int unique = set.size();
        int minLength =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            Set<Character> temp = new HashSet<>();
            for (int j=i;j<n;j++){
                temp.add(s.charAt(j));
                if(temp.size()==unique){
                    minLength=Math.min(minLength,j-i+1);
                    break;
                }
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your characters: ");
        String s = scanner.next();
        System.out.println(Solution(s));
    }
}
