package STRIVERSHEET.Number;


import java.util.Scanner;

public class Replace0With1 {
    public int Solution(int n){
        String num = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<num.length();i++){
            if(num.charAt(i)=='0'){
                sb.append('1');
            }else {
                sb.append(num.charAt(i));
            }
        }
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        Replace0With1 obj = new Replace0With1();
        int result = obj.Solution(n);
        System.out.println(result);

    }
}
