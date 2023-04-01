package advanced.MultidimensionalArrays.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] size = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        List<List<Integer>> matrix = new ArrayList<>();

        readMatrix(rows,cols,matrix);

        String input = scanner.nextLine();

        while(!input.equals("Nuke it from orbit")){
            int[] data = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int row = data[0];
            int col = data[1];
            int radius = data[2];

            nukeTarget(matrix,row,col,radius);

            removeEmptyLines(matrix);

            input = scanner.nextLine();
        }
        printMatrix(matrix);
    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> list : matrix) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    private static void removeEmptyLines(List<List<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            if (matrix.get(i).size() == 0) {
                matrix.remove(i--);
            }
        }
    }

    private static void nukeTarget(List<List<Integer>> matrix, int row, int col, int radius) {
        for (int i = col + radius; i >= col - radius; i--) {
            if(isValidIndex(radius, matrix.size()) && isValidIndex(i, matrix.get(i -1).size()) && i != radius){
                matrix.get(i -1).remove(col);
            }
        }

        for (int i = row - radius; i <= row + radius; i++) {
            if (isValidIndex(i, matrix.size()) && isValidIndex(col, matrix.get(i).size()) && i != row) {
                matrix.get(i).remove(col);
            }
        }
    }

    private static boolean isValidIndex(int i, int size) {
        return i >= 0 && i < size;
    }

    private static void readMatrix(int rows, int cols, List<List<Integer>> matrix) {
        int counter = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(counter);
                counter++;
            }
        }
    }
}
