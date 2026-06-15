package STRIVERSHEET.String;

import java.util.Arrays;
import java.util.Scanner;

//public class SortCharacterInString {
//    public String Solution(String str){
//        char[] arr=str.toCharArray();
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length-i-1;j++){
//                if(arr[j]>arr[j+1]){
//                    char temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        String str1=new String(arr);
//        return str1;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the String ");
//        String str=sc.next();
//        SortCharacterInString obj=new SortCharacterInString();
//        System.out.println("Before sorting:"+str);
//        String str1=obj.Solution(str);
//        System.out.println("After sorting:"+str1);
//    }
//}

public class SortCharacterInString {
    public String Solution(String str){
        char[] str1=str.toCharArray();
        Arrays.sort(str1);
        String str2=new String(str1);
        return str2;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str=sc.next();
        SortCharacterInString obj=new SortCharacterInString();
        System.out.println("Before sorting:"+str);
        String str1=obj.Solution(str);
        System.out.println("After sorting:"+str1);
    }

}