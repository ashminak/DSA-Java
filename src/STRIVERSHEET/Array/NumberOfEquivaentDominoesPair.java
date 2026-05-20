package STRIVERSHEET.Array;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfEquivaentDominoesPair {
    public int Solution(int[][] array){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for(int[] n:array){
            int a = Math.min(n[0],n[1]);
            int b = Math.max(n[0],n[1]);

            int key = a*10+b;
            if(map.containsKey(key)){
                count += map.get(key);
            }
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of equivaent dominoes: ");
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        System.out.println("Enter equivaent dominoes: ");
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        NumberOfEquivaentDominoesPair obj = new NumberOfEquivaentDominoesPair();
        int ans = obj.Solution(arr);
        System.out.println(ans);
    }
}
