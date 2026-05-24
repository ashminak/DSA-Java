package STRIVERSHEET.Number;

import java.util.Scanner;
//
//public class SumOfGPSeries {
//    public double SumOfGPSeries(int n,double a,double r){
//        double sum = 0;
//        double term =a;
//        for (int i = 1; i <= n; i++){
//            sum+=term;
//            term*=r;
//        }
//        return sum;
//    }
//    public static  void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of terms in the series: ");
//        int n = sc.nextInt();
//        System.out.println("Enter the terms in the series: ");
//        double a = sc.nextDouble();
//        System.out.println("Enter the terms in the series: ");
//        double r = sc.nextDouble();
//        SumOfGPSeries obj = new SumOfGPSeries();
//
//        System.out.println("The sum of the terms in the series is: "+obj.SumOfGPSeries(n,a,r));
//    }
//}

public class SumOfGPSeries {
    public double SumOfGPSeries(int n,double a,double r){
        if(r==1){
            return a*n;
        }
        return a*(Math.pow(r,n)-1)/(r-1);
    }
        public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the series: ");
        int n = sc.nextInt();
        System.out.println("Enter the terms in the series: ");
        double a = sc.nextDouble();
        System.out.println("Enter the terms in the series: ");
        double r = sc.nextDouble();
        SumOfGPSeries obj = new SumOfGPSeries();

        System.out.println("The sum of the terms in the series is: "+obj.SumOfGPSeries(n,a,r));
    }
}
