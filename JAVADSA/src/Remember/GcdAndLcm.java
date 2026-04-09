//https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
package Remember;//import java.util.Scanner;
//
//public class Remember.GcdAndLcm {
//    static long gcdopti(long a, long b){
//        if(b==0)return a;
//        return gcdopti(b,a%b);
//    }
//    static long lcmopti(long a, long b){
//        long gcd=gcdopti(a,b);
//        return (a*b/gcd);
//    }
//
//    static long[]gcdAndlcm(long a ,long b){
//        return new long[]{gcdopti(a,b),lcmopti(a,b)};
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your first input: ");
//        long a = scanner.nextLong();
//        System.out.println("Enter your second input: ");
//        long b = scanner.nextLong();
//        long[] result = gcdAndlcm(a,b);
//        System.out.println(result[0]+" "+result[1]);
//    }
//}
//Time -O(log(min(a,b))) Space-O(log(min(a,b)))because recursion halves numbers each step and each call uses memory! 🚀

//import java.util.Arrays;
//import java.util.Scanner;
//

import java.util.Arrays;
import java.util.Scanner;

////slow and cant handle large input since slow so avoid this
//public class Remember.GcdAndLcm {
//    public static int gcdBrute(int a, int b){
//        int gcd=1;
//        for(int i=1;i<=Math.min(a,b);i++){
//            if(i%a==0&&i%b==0){
//                gcd=i;
//            }
//        }
//        return gcd;
//    }
//    public static int lcmBrute(int a, int b){
//        int max=Math.max(a,b);
//        while (true){
//            if(max%a==0&&max%b==0){
//                return max;
//            }
//            max++;
//        }
//    }
//    public static int[] lcmAndGcd(int a, int b){
//        return new int[] {lcmBrute(a,b),gcdBrute(a,b)};
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your input: ");
//        int a= scanner.nextInt();
//        System.out.println("Enter your input: ");
//        int b= scanner.nextInt();
//        System.out.println(Arrays.toString(lcmAndGcd(a, b)));
//    }
//}

//public class Remember.GcdAndLcm {
//    public static int gcdOptimal(int a, int b){
//        if(b==0)return a;
//        return gcdOptimal(b,a%b);
//    }
//    public static int lcmOptimal(int a, int b){
//        int gcd=gcdOptimal(a,b);
//        return (a*b)/gcd;
//    }
//
//    public static int[] lcmAndGcd(int a, int b){
//        return new int[]{lcmOptimal(a,b),gcdOptimal(a,b)};
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your input: ");
//        int a= scanner.nextInt();
//        System.out.println("Enter your input: ");
//        int b= scanner.nextInt();
//        System.out.println(Arrays.toString(lcmAndGcd(a, b)));
//    }
//}

//public class Remember.GcdAndLcm {
//    public static int gcdBrute(int a, int b){
//        int gcd=1;
//        for(int i=0;i<=Math.min(a,b);i++){
//            if(a%i==0&&b%i==0){
//                gcd=i;
//            }
//        }
//        return gcd;
//    }
//    public static int lcmBrute(int a, int b){
//        int max= Math.max(a,b);
//        while (true){
//            if(max%a==0&&max%b==0){
//                return max;
//            }
//            max++;
//        }
//    }
//
//    public static int[] gcdAndLcm(int a, int b){
//
//        return new int[]{gcdBrute(a,b),lcmBrute(a,b)};
//    }
//    static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter your input: ");
//        int a= scanner.nextInt();
//        System.out.println("Enter your input: ");
//        int b= scanner.nextInt();
//        System.out.println(Arrays.toString(gcdAndLcm(a, b)));
//
//    }
//}

public class GcdAndLcm {
    public static int  gcdOpti(int a, int b){
        if(b==0)return a;
        return gcdOpti(b,a%b);
    }

    public static int lcmOpti(int a, int b){
        int gcd=gcdOpti(a,b);
        return (a*b)/gcd;
    }
    public static int[] gcdAndLcm(int a, int b){
        return new int[]{lcmOpti(a,b),gcdOpti(a,b)};
    }
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your input: ");
        int a= scanner.nextInt();
        System.out.println("Enter your input: ");
        int b= scanner.nextInt();
        System.out.println(Arrays.toString(gcdAndLcm(a, b)));
    }
}