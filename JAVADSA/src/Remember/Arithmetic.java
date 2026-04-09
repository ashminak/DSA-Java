//https://www.geeksforgeeks.org/problems/arithmetic-number2815/1
package Remember;//Bruteforce approch
//public class ArithmenthicNumber {
//     public static int intSequence(int a, int b, int c){
//        if(c==0){
//            return a==b?1:0;
//        }
//
//        for(int i=a;i<=b;i+=c){
//            if(i==b){
//                return 1;
//            }
//        }
//        return 0;
//    }
//}

//Time: O((b-a)/c)
//
//Why?
//Loop runs from a to b
//jumping c steps each time

//Space: O(1)
//Only loop variable i
//No extra storage!

//Optimal Approach

//public class Remember.Arithmetic{
//    static int inSequence(int a, int b, int c){
//        if(a==b&&c==0) return 1;
//        int diff = b-a;
//        if(c!=0&&diff%c==0&&diff/c>=0){
//            return 1;
//        }
//        return 0;
//    }
//}
//Time: O(1)
//
//Why?
//NO loop at all!

//Space: O(1)
//Only diff variable!

//import java.util.Scanner;
//
//public class Remember.Arithmetic {
//    public static int inSequence(int a,int b,int c){
//        if(c==0){
//            return a==b?1:0;
//        }
//
//        for(int i=a;i<=b;i+=c){
//            if(i==b){
//                return 1;
//            }
//        }
//        return 0;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first input: ");
//        int a=scanner.nextInt();
//        System.out.println("Enter second input: ");
//        int b=scanner.nextInt();
//        System.out.println("Enter third input: ");
//        int c= scanner.nextInt();
//
//        System.out.println(inSequence(a,b,c));
//    }
//}

import java.util.Scanner;

//public class Remember.Arithmetic {
//
//    public static int inSequence(int a,int b, int c){
//        if(a==b&&c==0)return 1;
//        int diff=b-a;
//        if(c!=0&&diff%c==0&&diff/c>=0){
//            return 1;
//        }
//        return 0;
//    }
//}
//
//import java.util.Scanner;
//
//public class Remember.Arithmetic {
//    public static int inSequence(int a,int b, int c){
//        if(c==0){
//            return a==b?1:0;
//        }
//        for(int i=a;i<=b;i+=c){
//            if(i==b){
//                return 1;
//            }
//        }
//        return 0;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter your first input: ");
//        int a = scanner.nextInt();
//        System.out.println("Enter your second input: ");
//        int b = scanner.nextInt();
//        System.out.println("Enter your second input: ");
//        int c = scanner.nextInt();
//        System.out.println(inSequence(a,b,c));
//    }
//}
public class Arithmetic {
    public static int inSequence(int a, int b, int c){
        if(a==b&&c==0)return 1;
        int diff=b-a;
        if(c!=0&&diff%c==0&&diff/c>=0){
            return 1;
        }
        return 0;
    }

    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first input: ");
        int a= scanner.nextInt();
        System.out.println("Enter your second input: ");
        int b= scanner.nextInt();
        System.out.println("Enter your third input: ");
        int c= scanner.nextInt();

        System.out.println(inSequence(a,b,c));
    }
}