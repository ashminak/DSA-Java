package String;

import java.util.Scanner;

public class TransformString {
    public int transform(String A, String B) {
        if(A.length()!=B.length()) return -1;
        int[] freq = new int[256];
        for(int i=0;i<A.length();i++){
            freq[A.charAt(i)]++;
            freq[B.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(freq[i]!=0){
                return -1;
            }
        }
        int i=A.length()-1;
        int j=B.length()-1;
        int res=0;
        while(i>=0){
            if(A.charAt(i)!=B.charAt(j)){
                res++;
                i--;
            }else {
                i--;
                j--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String A = sc.next();
        System.out.println("Enter Second String: ");
        String B = sc.next();
        TransformString t = new TransformString();
        System.out.println(t.transform(A,B));
    }
}
