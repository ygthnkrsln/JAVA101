package Assignments;

import java.util.Arrays;

public class DiagonalSumOfMatrix {
    //Yiğithan KARAASLAN 32813013854

    public static int getRandomSize() {
        return (int) (Math.random() * 10 + 1);
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20 + 1);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("    ");
        }
        System.out.println();
    }

    public static int computeSum(int[][] matrix, int n) {
        int[] leftDiagonal = new int[n];
        int[] rightDiagonal = new int[n];
        int diagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j > 0 ; j--) {
                leftDiagonal[i] = matrix[i][i];
                rightDiagonal[i] = matrix[i][matrix.length - i - 1];
            }
            diagonalSum += leftDiagonal[i] + rightDiagonal[i];
        }

        System.out.printf("Left diagonal array can be visualized as: " + Arrays.toString(leftDiagonal) + "\n");
        System.out.printf("Right diagonal array can be visualized as: " + Arrays.toString(rightDiagonal) + "\n");

        return diagonalSum;
    }

    public static void main(String[] args) {
        int n = getRandomSize();
        int[][] matrix = generateMatrix(n);
        printMatrix(matrix);
        int diagonalSum = computeSum(matrix, n);

        System.out.println("\nDiagonal sum: " + diagonalSum);
    }
}
