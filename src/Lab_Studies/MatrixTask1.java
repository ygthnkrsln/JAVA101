package Lab_Studies;

import java.util.Scanner;

public class MatrixTask1 {
    public static int[][] getMatrix(int row, int column) {
        int[][] matrix = new int[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("    ");
        }
        return matrix;
    }

    public static int mostOnesByRow(int[][] matrix) {
        int rowIndex = -1;
        int maxOnes = -1;

        for (int i = 0; i < matrix.length; i++) {
            int temp = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) temp++;
            }

            if (temp > maxOnes) {
                rowIndex = i;
                maxOnes = temp;
            }
        }
        return rowIndex;
    }

    public static int mostOnesByColumn(int[][] matrix) {
        int columnIndex = -1;
        int maxOnes = -1;

        for (int i = 0; i < matrix[0].length; i++) {
            int temp = 0;

            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) temp++;
            }

            if (temp > maxOnes) {
                columnIndex = i;
                maxOnes = temp;
            }
        }
        return columnIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix's row and column (e.g., 4 4): ");

        int row = input.nextInt();
        int column = input.nextInt();

        int[][] matrix = getMatrix(row, column);

        int mostOnesRow = mostOnesByRow(matrix);
        System.out.println("The row with most ones: " + mostOnesRow);
        int mostOnesColumn = mostOnesByColumn(matrix);
        System.out.println("The column with most ones: " + mostOnesColumn);

    }
}
