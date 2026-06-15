package STRIVERSHEET.String;

import java.util.HashSet;
import java.util.Scanner;

//public class RemoveCharFromFirstStringPresentInSecondString {
//    public String solution(String str1,String str2){
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<str1.length();i++){
//            char c=str1.charAt(i);
//            boolean found=false;
//            for(int j=0;j<str2.length();j++){
//                if(c==str2.charAt(j)){
//                    found=true;
//                    break;
//                }
//            }
//            if(!found){
//                sb.append(c);
//            }
//        }
//        return sb.toString();
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter first String ");
//        String str1=sc.next();
//        System.out.println("Enter second String ");
//        String str2=sc.next();
//        RemoveCharFromFirstStringPresentInSecondString obj=new RemoveCharFromFirstStringPresentInSecondString();
//        String result=obj.solution(str1,str2);
//        System.out.println(result);
//    }
//}

public class RemoveCharFromFirstStringPresentInSecondString {
    public String solution(String str1,String str2){
        HashSet<Character> set = new HashSet<>();
        for (char c: str2.toCharArray()){
            set.add(c);
        }
        StringBuffer sb = new StringBuffer();
        for (char c: str1.toCharArray()){
            if (!set.contains(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String ");
        String str1=sc.next();
        System.out.println("Enter second String ");
        String str2=sc.next();
        RemoveCharFromFirstStringPresentInSecondString obj=new RemoveCharFromFirstStringPresentInSecondString();
        String result=obj.solution(str1,str2);
        System.out.println(result);
    }
}