package BitManupulation;

import java.util.Scanner;

public class DivideTwoInteger {
    public static int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean negative=(dividend<0)^(divisor<0);

        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);

        int result = 0;
        for (int i =31;i>=0;i--) {
            if((a>>i)>=b){
                result+=(1<<i);
                a-=(b<<i);
            }
        }
        return negative?-result:result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend number: ");
        int n = sc.nextInt();
        System.out.println("Enter the divisor number: ");
        int m = sc.nextInt();
        int result = divide(n, m);
        System.out.println(result);
    }
}
