package String;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static String equalZeroAndOne(String[] arr) {
        int len = arr.length;
        String prefix = arr[0];
        for (int i = 1; i < len; i++) {
            int j =0;
            String temp = "";
            while (j<prefix.length() && j<arr[i].length() && prefix.charAt(j)==arr[i].charAt(j)) {
                temp += prefix.charAt(j);
                j++;
            }
            prefix = temp;
            if(prefix.length()==0){
                return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings: ");
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        System.out.println(equalZeroAndOne(arr));
    }
}
