package STRIVERSHEET.Number;

import java.util.Scanner;

public class StrongNumber {
    int factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        return fact;
    }
   public boolean isStrongNumber(int n) {
       int dup = n;
       int ans =0;


       while(n>0){
         int id=n%10;
         ans +=factorial(id);
         n=n/10;
       }
       return ans==dup;
   }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number: ");
       int n=sc.nextInt();
       StrongNumber obj=new StrongNumber();
       if(obj.isStrongNumber(n)){
           System.out.println(n+" is a strong number");
       }else {
           System.out.println(n+" is not a strong number");
       }
   }
}
