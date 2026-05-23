package STRIVERSHEET.Number;

import java.util.Scanner;

public class Palindrome {
    public boolean Solution(int n) {
        int revNum = 0;
        int dup = n;
        while (n > 0) {
            int id = n % 10;
            revNum = (revNum * 10) + id;
            n = n / 10;
        }
        if (revNum == dup) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        Palindrome p = new Palindrome();
        boolean result = p.Solution(n);
        System.out.println(result);
    }

}