package STRIVERSHEET.String;

import java.util.Scanner;

public class SumOfNumbersInString {
    public int Solution(String str) {
        int sum = 0;
        String temp =" ";
        for (char ch : str.toCharArray()) {
            if(Character.isDigit(ch)){
                temp += ch;
            } else if (!temp.equals(" ")) {
                sum += Integer.parseInt(temp);
                temp = " ";
            }
        }
        if (!temp.equals(" ")) {
            sum += Integer.parseInt(temp);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        SumOfNumbersInString solution = new SumOfNumbersInString();
        System.out.println(solution.Solution(str));
    }

}
