package Matrix;

import java.util.Scanner;

public class SearchTwoDMatrix {
    public boolean Solution(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int start = 0, end = m*n - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            int row = mid / n;
            int col = mid % n;
            if (matrix[row][col] == target) {
                return true;
            }else if (matrix[row][col] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return false;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the target element of the matrix: ");
        int target = sc.nextInt();
        SearchTwoDMatrix obj = new SearchTwoDMatrix();
        System.out.println(obj.Solution(matrix, target));
    }
}
