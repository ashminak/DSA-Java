package STRIVERSHEET.Number;

import java.util.Scanner;

public class TwoKeysKeyboard {
    public int solution(int n) {
        if (n == 1)return 0;
        int steps =0;
        int factor = 2;
        while(n>1){
            while(n%factor==0){
                steps+=factor;
                n=n/factor;
            }
            factor++;
        }
        return steps;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        TwoKeysKeyboard obj = new TwoKeysKeyboard();
        int result = obj.solution(n);
        System.out.println(result);
    }
}
