package advanced.MultidimensionalArrays.lab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(scanner, rows, cols);
        char[][] secondMatrix = readMatrix(scanner, rows, cols);

        intersection(firstMatrix, secondMatrix, rows, cols);

    }

    private static void intersection(char[][] firstMatrix, char[][] secondMatrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char output = firstMatrix[row][col] == secondMatrix[row][col] ? firstMatrix[row][col] : '*';
                System.out.print(output + " ");
            }
            System.out.println();
        }
    }

    private static char[][] readMatrix(Scanner scanner, int rows, int cols) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();
        }
        return matrix;
    }
}
