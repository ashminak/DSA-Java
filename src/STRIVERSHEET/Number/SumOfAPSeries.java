package STRIVERSHEET.Number;

import java.util.Scanner;

//public class SumOfAPSeries {
//    public int SumOfAPSeries(int n, int a , int d){
//        int sum = 0;
//        for (int i = 1; i <= n; i++){
//            sum+=a;
//            a+=d;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of integers: ");
//        int n = sc.nextInt();
//        System.out.println("Enter the number of digits: ");
//        int a = sc.nextInt();
//        System.out.println("Enter the number of digits: ");
//        int d = sc.nextInt();
//        SumOfAPSeries obj = new SumOfAPSeries();
//        int result = obj.SumOfAPSeries(n,a,d);
//        System.out.println(result);
//    }
//}

public class SumOfAPSeries {
    public float SumOfAPSeries(float n,float a,float d) {
        float sum = (n / 2.0f) * (2.0f*a+(n-1)*d);
        return sum;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of digits: ");
        int a = sc.nextInt();
        System.out.println("Enter the number of digits: ");
        int d = sc.nextInt();
        SumOfAPSeries obj = new SumOfAPSeries();
        float result = obj.SumOfAPSeries(n,a,d);
        System.out.println(result);
    }
}