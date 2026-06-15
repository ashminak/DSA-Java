package STRIVERSHEET.String;

import java.util.Scanner;

//public class StringConcatenation {
//    public void solution(String s1,String s2){
//        StringBuilder sb=new StringBuilder();
//        int i =0;
//        int j=0;
//        while (i<s1.length()){
//            sb.append(s1.charAt(i++));
//        }
//        while (j<s2.length()){
//            sb.append(s2.charAt(j++));
//        }
//        System.out.println(sb);
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter first string");
//        String s1=sc.next();
//        System.out.println("Enter second string");
//        String s2=sc.next();
//        StringConcatenation scc=new StringConcatenation();
//        scc.solution(s1,s2);
//    }
//}

public class StringConcatenation {
    public void solution(String s1,String s2){
        String s=s1+s2;
        System.out.println(s);
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String s1=sc.next();
        System.out.println("Enter second string");
        String s2=sc.next();
        StringConcatenation scc=new StringConcatenation();
        scc.solution(s1,s2);
    }

}