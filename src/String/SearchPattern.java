package String;

import java.util.Scanner;

public class SearchPattern {
    public static int[] buildSolution(String pattern){
        int n = pattern.length();
        int[] lps = new int[n];
        lps[0] = 0;
        int i = 1;
        int len = 0;
        while (i<n){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            } else{
                if(len!=0){
                    len=lps[len-1];
                }else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    public static int minSwaps(String text, String pattern){
        int m = text.length();
        int n = pattern.length();
        int[] lps = buildSolution(pattern);
        int i = 0;
        int j = 0;
        int count = 0;
        while (i<m){
            if(text.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
            }
            if(j==n){
                return i-j;
            }else if(i<m&&text.charAt(i)!=pattern.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the TEXT string: ");
        String text = sc.next();
        System.out.println("Enter the pattern: ");
        String pattern = sc.next();
        System.out.println(minSwaps(text,pattern));

    }
}

