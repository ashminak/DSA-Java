package STRIVERSHEET.Number;

import java.util.Scanner;

public class HarshadNumber {
    public void isHarshadNumber(int n){
        int x = n;
        int temp = x;
        int sum = 0;
        while (temp != 0){
            sum += temp % 10;
            temp = temp / 10;
        }
        if(x%sum == 0){
            System.out.println("Yes it is Harshad Number");
        }else {
            System.out.println("No it is Harshad Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        HarshadNumber h = new HarshadNumber();
        h.isHarshadNumber(n);
    }
}
