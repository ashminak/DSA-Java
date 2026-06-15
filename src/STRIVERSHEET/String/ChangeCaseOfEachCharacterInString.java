package STRIVERSHEET.String;

import java.util.Scanner;

//public class ChangeCaseOfEachCharacterInString {
//    public String Solution(String str){
//        StringBuilder sb=new StringBuilder();
//        for (int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            int ascii=(int)ch;
//            if(ascii>=65&&ascii<=90){
//                sb.append((char)( ascii+32));
//            }else if(ascii>=97&&ascii<=122){
//                sb.append((char)(ascii-32));
//            }else if(str.charAt(i)==' ') {
//                sb.append(' ');
//            }
//        }
//        return sb.toString();
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a string ");
//        String str=sc.nextLine();
//        ChangeCaseOfEachCharacterInString solution=new ChangeCaseOfEachCharacterInString();
//        String S=solution.Solution(str);
//        System.out.println(S);
//    }
//}

public class ChangeCaseOfEachCharacterInString {
    public String Solution(String str){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii =(int)ch;
            if(ascii>=65&&ascii<=90){
                sb.append(Character.toLowerCase(ch));
            }
            else if (ascii>=97 &&ascii<=122) {
                sb.append(Character.toUpperCase(ch));
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.nextLine();
        ChangeCaseOfEachCharacterInString solution=new ChangeCaseOfEachCharacterInString();
        String S=solution.Solution(str);
        System.out.println(S);
    }

}