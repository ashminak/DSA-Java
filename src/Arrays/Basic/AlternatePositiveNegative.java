package Arrays.Basic;//package Arrays.Basic;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class AlternatePositiveNegative {
//
//    static void rearrange(ArrayList<Integer> arr){
//        ArrayList<Integer> positive =new ArrayList<>();
//        ArrayList<Integer> negative =new ArrayList<>();
//        for(int i=0;i<arr.size();i++){
//            if(arr.get(i)>=0){
//                positive.add(arr.get(i));
//            }else {
//                negative.add(arr.get(i));
//            }
//        }
//
//        int p=0;
//        int k=0;
//        int i=0;
//
//        while(p<positive.size()&&k<negative.size()){
//            if(i%2==0){
//                arr.set(i,positive.get(p));
//                p++;
//            }else {
//                arr.set(i,negative.get(k));
//                k++;
//            }
//            i++;
//        }
//
//        while(p<positive.size()){
//            arr.set(i,positive.get(p));
//            p++;
//            i++;
//        }
//
//
//        while (k<negative.size()){
//            arr.set(i,negative.get(k));
//            p++;
//            i++;
//        }
//
//
//
//    }
//
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your input: ");
//        int n = scanner.nextInt();
//        ArrayList<Integer> arr= new ArrayList<>();
//        for (int i =0;i<n;i++){
//            System.out.println("Enter your input: ");
//            arr.add(scanner.nextInt());
//        }
//        rearrange(arr);
//        for(int x:arr){
//            System.out.println(x+" ");
//        }
//
//    }
//}

//for unequal count use bruteforece and equal count use optimal
import java.util.ArrayList;
import java.util.Scanner;

class AlternatePositiveNegative {
    static void rearrange(ArrayList<Integer> arr) {

        ArrayList<Integer> temp= new ArrayList<>(arr);

        int posIndx=0;
        int negIndx=1;

        for(int i=0;i<temp.size();i++){
            if(temp.get(i)>=0&&posIndx<arr.size()){
                arr.set(posIndx,temp.get(i));
                posIndx+=2;
            } else if (temp.get(i)<0&&negIndx<arr.size()) {
                arr.set(negIndx, temp.get(i));
                negIndx+=2;
            }
        }
    }


    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input: ");
        int n = scanner.nextInt();

        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter your input: ");
            arr.add(scanner.nextInt());
        }

        rearrange(arr);

        for(int x:arr){
            System.out.println(x+" ");
        }

    }
}






