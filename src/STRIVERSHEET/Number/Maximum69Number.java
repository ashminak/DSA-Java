package STRIVERSHEET.Number;

//Make a number maximum by changing one time, number contain only 6 and 9
import java.util.Scanner;

public class Maximum69Number {
    public int Solution(int n){
        char[] digits=String.valueOf(n).toCharArray();
        for(int i=0;i<digits.length;i++){
            if(digits[i]=='6'){
                digits[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        Maximum69Number obj=new Maximum69Number();
        int result=obj.Solution(n);
        System.out.println(result);
    }
}
