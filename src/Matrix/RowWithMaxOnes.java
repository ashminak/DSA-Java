package Matrix;

import java.util.Scanner;

public class RowWithMaxOnes {
    public int[] Solution(int[][] matrix) {
        int[] result = new int[2];
        int maxOnes=0;
        for(int i=0;i<matrix.length;i++){
            int count=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
            if(count>maxOnes){
                maxOnes=count;
                result[0]=i;
                result[1]=count;
            }
        }
        return result;
    }

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        RowWithMaxOnes obj = new RowWithMaxOnes();
        int[] result = obj.Solution(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
