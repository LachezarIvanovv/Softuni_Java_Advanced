package MultidimensionalArrays.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringRotation = scanner.nextLine();
        String input = scanner.nextLine();
        List<String> words = new ArrayList<>();
        int maxCol = Integer.MIN_VALUE;

        while (!input.equals("END")) {
            int currentLength = input.length();

            if(currentLength > maxCol){
                maxCol = currentLength;
            }
            words.add(input);
            input = scanner.nextLine();
        }
        int rows = words.size();
        int cols = maxCol;
        char[][] matrix = new char[rows][cols];

        for (int word = 0; word < words.size(); word++) {
            String currentWord = words.get(word);
            for (int letter = 0; letter < cols; letter++) {
                if(letter < currentWord.length()){
                    char currentChar = currentWord.charAt(letter);
                    matrix[word][letter] = currentChar;
                }else{
                    matrix[word][letter] = ' ';
                }
            }
        }

        String angleString = stringRotation.split("[()]")[1];
        int angle = Integer.parseInt(angleString);
        int angleRotation = angle % 360;

        switch (angleRotation){
            case 0:
                print0Matrix(matrix,rows,cols);
                break;
            case 90:
                print90Matrix(matrix,rows,cols);
                break;
            case 180:
                print180Matrix(matrix,rows,cols);
                break;
            case 270:
                print270Matrix(matrix,rows,cols);
                break;
        }
    }

    private static void print180Matrix(char[][] matrix, int rows, int cols) {
        for (int row = rows - 1; row >= 0; row--) {
            for (int col = cols -1; col >= 0; col--) {
                System.out.print(matrix[row][col] + "");
            }
            System.out.println();
        }
    }

    private static void print270Matrix(char[][] matrix, int rows, int cols) {
        for (int col = cols - 1; col >= 0; col--) {
            for (int row = 0; row < rows; row++) {
                System.out.print(matrix[row][col] + "");
            }
            System.out.println();
        }
    }

    private static void print90Matrix(char[][] matrix, int rows, int cols) {
        for (int col = 0; col < cols; col++) {
            for (int row = rows - 1; row >= 0; row--) {
                System.out.print(matrix[row][col] + "");
            }
            System.out.println();
        }
    }

    private static void print0Matrix(char[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + "");
            }
            System.out.println();
        }
    }
}
