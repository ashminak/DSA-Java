package STRIVERSHEET.NumberSystem;

import java.util.Scanner;

public class BinaryToOctal {
    public void Solution(String s){
        int n = s.length();

        if(n%3==1){
            s="00"+s;
        }else if(n%3==2){
            s="0"+s;
        }
        n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<n;i+=3){
            int temp =(s.charAt(i)-'0')*4 + (s.charAt(i+1)-'0')*2 + (s.charAt(i + 2) - '0')*1;

                sb.append(temp);
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        BinaryToOctal b = new BinaryToOctal();
        b.Solution(s);
    }
}
