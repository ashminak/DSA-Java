package BitManupulation;

import java.util.Scanner;

public class CountSetBits {
    public static int Solution(int n) {
        if(n == 0)return 0;

        int x = LargestPowerOf2(n);
        int bitsTill2x= x*(1<<(x-1));
        int msbBits= n-(1<<x)+1;
        int rest = n-(1<<x);
        return bitsTill2x+msbBits+Solution(rest);
    }
    public static int LargestPowerOf2(int n) {
        int x = 0;
        while ((1<<(x+1))<=n){
            x++;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(Solution(n));
    }
}
