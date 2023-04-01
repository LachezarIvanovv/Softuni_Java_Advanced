package FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Comparator<Integer> comparator = (firstNumber, secondNumber) -> {
            if(firstNumber % 2 == 0 && secondNumber % 2 != 0){
                return -1;
            }else if(firstNumber % 2 != 0 && secondNumber % 2 == 0){
                return 1;
            }else{
                return firstNumber.compareTo(secondNumber);
            }
        };

        Arrays.sort(numbers, comparator);
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
    }
}
