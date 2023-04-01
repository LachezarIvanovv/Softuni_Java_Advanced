package advanced.MultidimensionalArrays.lab;


import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int sum = sumOfAllMatrices(firstMatrix);

        System.out.println(sum);
    }

    private static int sumOfAllMatrices(int[][] firstMatrix) {
        int count = 0;
        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArr = firstMatrix[row];
            for (int col = 0; col < firstArr.length; col++) {
                int firstElement = firstArr[col];
                count += firstElement;
            }
        }
        return count;
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
        System.out.println(rows);
        System.out.println(cols);
        return matrix;
    }
}
