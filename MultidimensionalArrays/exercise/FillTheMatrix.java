package advanced.MultidimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimension = scanner.nextLine().split(", ");
        int size = Integer.parseInt(dimension[0]);
        String type = dimension[1];

        int[][] matrix = new int[size][size];

        if (type.equals("A")) {
            patternA(size, matrix);
        } else if (type.equals("B")) {
            patternB(size, matrix);
        }

        printMatrix(size, matrix);

    }

    private static void printMatrix(int size, int[][] matrix) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void patternB(int size, int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
            } else {
                for (int row = size - 1; row >= 0; row--) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        }
    }

    private static void patternA(int size, int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
    }

    private static void readMatrix(Scanner scanner, int size, int[][] matrix) {
        for (int row = 0; row < size; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }
    }
}
