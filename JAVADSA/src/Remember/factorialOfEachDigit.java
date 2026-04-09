package Remember;//import java.util.Scanner;
////Bruteforce Approach
//public class Remember.factorialOfEachDigit {
//
//    // calculate factorial of single digit
//    static long digitFactorial(int digit){
//        long fact=1;
//        for(int i=2;i<=digit;i++){
//            fact*=i;
//        }
//        return fact;
//    }
//
//    //main function
//    static long factorialOfdigit(int n){
//        long result=1;
//       while (n>0){
//          int  digit = n%10;
//          result *= digitFactorial(digit);
//          n/=10;
//
//       }
//       return result;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println(factorialOfdigit(n));
//    }
//}
// TIME
// O(D*M)
// D= Number of Digits in N
// M= max digits value(9)
// outer while loop run d times(how many digits are there based on that)
// inner loop run m times(max 9 times for each digit)
//  Space
// O(1)
// only result variable stored


import java.util.Scanner;
//OPTIMAL APPROACH - IN BRUTEFORECE EACH DIGIT FACTORIAL CALCUTALTING EVERYRING TIME HERE WILL PRE CALCULATE AND STORE IT IN AND ARRAY AND WHEN NEEDED JUST LOOKUP ON THAT FACTORIAL WITHOUT CALCULATING IT

//public class Remember.factorialOfEachDigit {



    //main function
//    static long factorialOfdigit(int n){
//
//        long [] fact= new long[10];
//          fact [0]=1;
//        for(int i=0;i<=9;i++){
//            fact[i]=fact[i-1]*i;
//        }
//        long result=1;
//        while (n>0){
//            int  digit = n%10;
//            result *= fact[digit];
//            n/=10;
//
//        }
//        return result;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println(factorialOfdigit(n));
//    }
//}
//Time: O(D)
//Why?
//Pre-calculate step → runs 9 times
//always constant!
//While loop → runs D times only
//No inner loop needed (just lookup!)
//
//So = 9 + D ≈ O(D)


//Space: O(1)
//Why?
//fact[] array is always size 10
//Fixed size! Never changes!
//So constant space!

//public class Remember.factorialOfEachDigit {
//    public static int digitFactorial(int digit){
//        int fact =1;
//        for(int i=2;i<=digit;i++){
//            fact*=i;
//        }
//        return fact;
//    }
//
//    public static int factorialOfDigit(int n){
//        int digit=0;
//        int result=1;
//        while (n>0){
//            digit=n%10;
//            result*=digitFactorial(digit);
//            n/=10;
//        }
//        return digit;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your input: ");
//        int N= scanner.nextInt();
//        System.out.println(factorialOfDigit(N));
//    }
//}
//
//public class Remember.factorialOfEachDigit {
//    public static long factorialOfDigit(int n){
//        long fact[]= new long[10];
//         fact[0]= 1;
//        for(int i=1;i<=9;i++){
//            fact[i]=fact[i-1]*i;
//        }
//        int digit=0;
//        long result=1;
//       while (n>0){
//           digit=n%10;
//           result*=fact[n];
//           n/=10;
//       }
//       return result;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your input: ");
//        int n= scanner.nextInt();
//        System.out.println(factorialOfDigit(n));
//    }
//}



//public class Remember.factorialOfEachDigit {
//    public static int digitFactorial(int digit){
//        int fact=1;
//        for(int i=2;i<=digit;i++){
//            fact=fact*i;
//        }
//
//        return fact;
//    }
//
//    public static int factorialOfDigit(int n){
//        int result=0;
//        while(n>0){
//            int digit=n%10;
//            result=digitFactorial(digit);
//            n/=10;
//        }
//        return result;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your input: ");
//        int n = scanner.nextInt();
//        System.out.println(factorialOfDigit(n));
//    }
//}



//public class factorialOfEachDigit {
//    public static int factorialOfDigit(int n){
//        long fact[]= new long[10];
//        fact[0]=1;
//        for(int i=1;i<=9;i++){
//            fact[i]=fact[i-1]*i;
//        }
//
//        int result=1;
//        while(n>0){
//            int digit=n%10;
//            result*=fact[digit];
//            n/=10;
//
//        }
//        return result;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your input: ");
//        int n= scanner.nextInt();
//        System.out.println(factorialOfDigit(n));
//    }
//}

//public class factorialOfEachDigit {
//    public static int digitFactorial(int n){
//        int fact=1;
//        for(int i=2;i<=n;i++){
//            fact=fact*i;
//        }
//        return fact;
//    }
//    public static int factorial(int num){
//        int result=0;
//        while (num!=0){
//            int digit =num%10;
//            result+=digitFactorial(digit);
//            num/=10;
//        }
//        return result;
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your number: ");
//        int n = scanner.nextInt();
//        System.out.println(factorial(n));
//    }
//}

public class factorialOfEachDigit {
    public static int factorial(int num){
        long[] fact = new long[10];
        fact[0]=1;
        for(int i=1;i<=9;i++){
             fact[i] = fact[i-1]*i;
        }
        int result=0;
        while (num!=0){
            int digit = num%10;
            result+= (int) fact[digit];
            num/=10;
        }
        return result;
    }
        static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}