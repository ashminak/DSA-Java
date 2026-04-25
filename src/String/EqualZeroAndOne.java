package String;

import java.util.Scanner;

public class EqualZeroAndOne {
    public static int equalZeroAndOne(String s) {
        int zero =0;
        int one=0;
        int ans=0;
        for (char ch : s.toCharArray()) {
            if (ch=='0') {
                zero++;
            }
            if (ch=='1') {
                one++;
            }
            if(zero==one){
                ans++;
                zero=0;
                one=0;
            }
        }
        if (zero!=0||one!=0) {
            return -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        System.out.println(equalZeroAndOne(s));
    }
}
