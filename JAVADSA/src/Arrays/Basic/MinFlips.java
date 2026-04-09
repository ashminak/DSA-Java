package Arrays.Basic;

import java.util.Scanner;

public class MinFlips {
    public static int Solution(String s){
        StringBuilder pattern1= new StringBuilder();
        StringBuilder pattern2= new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
                pattern1.append('0');
                pattern2.append('1');
            }else {
                pattern1.append('1');
                pattern2.append('2');
            }
        }
        int flips1=0;
        int flips2=0;
        for(int i=0;i<n;i++){
                if(s.charAt(i)!=pattern1.charAt(i)) flips1++;
                if(s.charAt(i)!=pattern2.charAt(i)) flips2++;

            }
        return Math.min(flips1,flips2);
        }


    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s= scanner.next();
        System.out.println(Solution(s));
    }
}


//package Arrays.Basic;
//
//import java.util.Scanner;
//
//public class MinFlips {
//    public static int Solution(String s){
//        int n=s.length();
//        int startFlipsWithZero=0;
//        int startFlipsWithOne=0;
//
//        for(int i=0;i<n;i++){
//            if(i%2==0){
//                if(s.charAt(i)!='0') startFlipsWithZero++;
//                if(s.charAt(i)!='1') startFlipsWithOne++;
//            }else{
//                if(s.charAt(i)!='1') startFlipsWithZero++;
//                if(s.charAt(i)!='0') startFlipsWithOne++;
//            }
//        }
//        return Math.min(startFlipsWithOne,startFlipsWithZero);
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your String: ");
//        String s = scanner.next();
//        System.out.println(Solution(s));
//    }
//
//}
