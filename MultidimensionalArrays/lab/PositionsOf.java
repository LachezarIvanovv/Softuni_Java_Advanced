package advanced.MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);
        int searchNumber = Integer.parseInt(scanner.nextLine());

        boolean isFound = searchInMatrix(matrix, searchNumber);
    }


    private static boolean searchInMatrix(int[][] matrix, int searchNumber) {
        int counter = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == searchNumber) {
                    System.out.println(row + " " + col);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("not found");
            return false;
        }
        return true;
    }


    private static int[][] readMatrix(Scanner scanner) {
        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimension[0];
        int cols = dimension[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = arr;
        }
        return matrix;
    }
}
