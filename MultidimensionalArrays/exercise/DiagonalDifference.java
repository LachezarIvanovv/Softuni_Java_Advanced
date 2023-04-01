package advanced.MultidimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }

        int firstDiagonalSum = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(col == row){
                    firstDiagonalSum += matrix[row][col];
                }
            }
        }
        
        int secondaryDiagonal = 0;
        for (int row = 0; row < size; row++) {
            secondaryDiagonal += matrix[row][size - row - 1];
        }
        int sum = Math.abs(firstDiagonalSum - secondaryDiagonal);
        System.out.println(sum);
    }
}
