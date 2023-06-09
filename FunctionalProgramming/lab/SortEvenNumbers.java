package FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<Integer> predicate = n -> n % 2 == 0;

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(predicate).toList();

        String output = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(output);

        System.out.println(numbers.stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));


    }
}
