package STRIVERSHEET.Number;

import java.util.Scanner;

public class PaindromeNumberInRange {
    public boolean isPalindrome(int number) {
        number = Math.abs(number);
        int revNum =0;
        int dup =number;
        while (number>0){
            int id = number%10;
            revNum = (revNum*10) + id;
            number = number/10;
        }
        if(revNum==dup){
            return true;
        }
        return false;
    }
    public void countPalindrome(int range1,int range2 ) {
        for (int i = range1; i <= range2; i++) {
            if(isPalindrome(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number: ");
        int start = sc.nextInt();
        System.out.println("Enter end number: ");
        int end = sc.nextInt();
        PaindromeNumberInRange p = new PaindromeNumberInRange();
        p.countPalindrome(start,end);

    }
}

