package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrix {
    public int[][] Solution(int[][] matrix, int n) {
        int[] vec = new int[n*n];
        int k =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vec[k++] = matrix[i][j];
            }
        }
        Arrays.sort(vec);
         k =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = vec[k++];
            }
        }
        return matrix;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix: ");
        int n = sc.nextInt();
        int[][] matrix= new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        SortedMatrix sm = new SortedMatrix();
        int[][] result = sm.Solution(matrix, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(result[i][j]+" ");
            }
        }
    }
}
/*
Time Complexity:
- O(N² log N) → Sorting N² elements dominates
                Flatten O(N²) + Sort O(N² log N²) + Refill O(N²)
                = O(N² log N)

Space Complexity:
- O(N²) → 1D array of size N² to store all elements
*/