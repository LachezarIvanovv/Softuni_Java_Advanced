package advanced.MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);
        findSubMatrix(matrix);

    }

    private static void findSubMatrix(int[][] matrix) {
        int maxNum = Integer.MIN_VALUE;
        int bestRow = Integer.MIN_VALUE;
        int bestCol = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length - 1; row++) {
           int[] firstArr = matrix[row];
            for (int col = 0; col < firstArr.length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if(sum > maxNum){
                    maxNum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        for (int row = bestRow; row < bestRow + 2; row++) {
            for (int col = bestCol; col < bestCol + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(maxNum);

    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] dimension = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimension[0];
        int cols = dimension[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }
        return matrix;
    }
}
