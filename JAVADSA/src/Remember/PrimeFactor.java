//https://www.geeksforgeeks.org/problems/prime-factors5052/1

//Approach=1 :Bruteforce
//import java.sql.ClientInfoStatus;
//import java.util.ArrayList;
//import java.util.List;
//
//public class PrimeFactor {
//
//    public List<Integer> allPrimeFactors(int N){
//        List<Integer> primes = new ArrayList<>();
//        for(int i=2;i<=N;i++){
//            if(N%i==0){
//                if(isPrime(i)){
//                    primes.add(i);
//                }
//            }
//        }
//        return primes;
//    }
//   public boolean isPrime(int num){
//        if(num<2) return false;
//        for(int i=2;i<=Math.sqrt(num);i++){
//            if (num%i==0)return false;
//        }
//        return true;
//    }
//}
//Time Complexity: O(N * sqrt(N))
//Space Complexity: O(log N)

//Approach 2: Optimal

//public class PrimeFactor {
//
//    public List<Integer> allPrimeFactors(int N) {
//        List<Integer> primes = new ArrayList<>();
//
//        if(N%2==0){
//            primes.add(2);
//            while (N%2==0){
//                N/=2;
//            }
//        }
//
//        for(int i=3;i<=Math.sqrt(N);i+=2){
//            if (N%i==0){
//                primes.add(i);
//                while (N%i==0){
//                    N/=i;
//                }
//            }
//        }
//
//        if(N>2){
//            primes.add(N);
//        }
//        return primes;
//    }
//}
//Time Complexity: O(sqrt(N))
//Space Complexity: O(log N)

