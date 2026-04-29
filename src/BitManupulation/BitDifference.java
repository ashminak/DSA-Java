package BitManupulation;

import java.util.Scanner;

public class BitDifference {
    public static int Solution(int A, int B) {
        int c = A^B;
        int count = 0;
        while (c != 0) {
            if ((c & 1) == 1) {
                count++;
            }
            c = c >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int A = sc.nextInt();
        System.out.println("Enter b number: ");
        int B = sc.nextInt();
        System.out.println(Solution(A, B));
    }
}
