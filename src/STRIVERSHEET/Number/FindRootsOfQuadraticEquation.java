package STRIVERSHEET.Number;

import java.util.Scanner;

public class FindRootsOfQuadraticEquation {
    public void solution(int a,int b,int c){
        int d = b*b-4*a*c;
        double sqrt_val = Math.sqrt(Math.abs(d));
        if(d>0){
            System.out.println("Roots are real and different");
            double root1=(-b+sqrt_val)/(2.0*a);
            double root2=(-b-sqrt_val)/(2.0*a);
            System.out.println(root1);
            System.out.println(root2);
        }else if(d==0){
            System.out.println("Roots are real and same");
            double root =(-b)/(2.0*a);
            System.out.println(root);
            System.out.println();
        }else {
            System.out.println("Roots are complex");
            double realPart = (-b)/(2.0*a);
            System.out.println(realPart+" + i "+sqrt_val);
            System.out.println(realPart+" - i "+sqrt_val);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        System.out.println("Enter c value: ");
        int c = sc.nextInt();
        FindRootsOfQuadraticEquation obj = new FindRootsOfQuadraticEquation();
        obj.solution(a,b,c);
        sc.close();
    }

}
