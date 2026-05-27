package STRIVERSHEET.Number;

import java.util.Scanner;

public class ExtendedEuclideanAlgo {
    public int[] gcd(int a,int b){
        if(b==0){
            return new int[] {a,1,0};
        }
        int[] arr = gcd(b,a % b);
        int gcd = arr[0];
        int x1 = arr[1];
        int y1 = arr[2];
        int x= y1;
        int y= x1-(a/b)*y1;
        return new int[] {gcd,x,y};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        ExtendedEuclideanAlgo e = new ExtendedEuclideanAlgo();
        int[] ans =e.gcd(a,b);
        System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);

    }
}
