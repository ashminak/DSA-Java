package BitManupulation;

import java.util.Scanner;

public class SetBitPosition {
    public static int Solution(int n) {
        int position = 0;
        if(n>0&&((n&(n-1))==0)){
            while(n>0){
                position++;
                if((n&1)==1){
                    return position;
                }
                n=n>>1;
            }
        }
        return position;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(Solution(n));
    }
}
