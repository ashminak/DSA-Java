package STRIVERSHEET.Number;
//count zeros in last of factorial of digits
import java.util.Scanner;

public class FactorialTrailingZeros {
    public int solution(int n){
        int count=0;
        while(n>0){
            n=n/5;
            count+=n;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        FactorialTrailingZeros obj=new FactorialTrailingZeros();
        System.out.println(obj.solution(n));
    }
}
