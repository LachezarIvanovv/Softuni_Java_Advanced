package advanced.MultidimensionalArrays.exercise;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimension = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimension[0]);
        int cols = Integer.parseInt(dimension[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] arr = scanner.nextLine().split("\\s+");
            matrix[row] = arr;
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            if (isValidCommand(command, rows, cols)) {
                String[] data = command.split(" ");
                int firstRow = Integer.parseInt(data[1]);
                int firstCol = Integer.parseInt(data[2]);
                int secondRow = Integer.parseInt(data[3]);
                int secondCol = Integer.parseInt(data[4]);

                String firstElement = matrix[firstRow][firstCol];
                String secondElement = matrix[secondRow][secondCol];

                matrix[firstRow][firstCol] = secondElement;
                matrix[secondRow][secondCol] = firstElement;

                printMatrix(matrix);

            } else {
                System.out.println("Invalid input!");
            }

            command = scanner.nextLine();
        }

    }

    private static boolean isValidCommand(String command, int rows, int cols) {
        String[] input = command.split("\\s+");
        if (!input[0].equals("swap")) {
            return false;
        }

        if (input.length != 5) {
            return false;
        }

        int firstRow = Integer.parseInt(input[1]);
        int firstCol = Integer.parseInt(input[2]);
        int secondRow = Integer.parseInt(input[3]);
        int secondCol = Integer.parseInt(input[4]);

        if (firstRow < 0 || firstRow > rows || firstCol < 0 || firstCol > cols
                || secondRow < 0 || secondRow > rows || secondCol < 0 || secondCol > cols) {
            return false;
        }
        return true;
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
