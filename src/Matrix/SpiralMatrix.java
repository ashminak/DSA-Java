package Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {
    public ArrayList<Integer> Solution(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int row = 0,
            rowSize = matrix.length-1;
        int col = 0,
            colSize = matrix[0].length-1;
        while(row <= rowSize && col <= colSize) {
            for(int i = col; i <=colSize; i++) {
                result.add(matrix[row][i]);
            }
            row++;
            for(int i = row; i <=rowSize; i++) {
                result.add(matrix[i][colSize]);
            }
            colSize--;
            if(row<=rowSize){
                for(int i = colSize; i >=col; i--) {
                    result.add(matrix[rowSize][i]);
                }
                rowSize--;
            }
            if(col<=colSize){
                for(int i = rowSize; i >=row; i--) {
                    result.add(matrix[i][col]);
                }
                col++;
            }
        }
        return result;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        SpiralMatrix sp = new SpiralMatrix();
        ArrayList<Integer> result = sp.Solution(matrix);
        System.out.println(result);
    }
}
