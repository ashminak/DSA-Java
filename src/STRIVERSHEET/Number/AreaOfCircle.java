package STRIVERSHEET.Number;

import java.util.Scanner;

public class AreaOfCircle {
    public void Solution(int n){
        double ans = 3.14*n*n;//formula=pi*sqr of n;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int n = sc.nextInt();
        AreaOfCircle obj = new AreaOfCircle();
        obj.Solution(n);
    }
}
