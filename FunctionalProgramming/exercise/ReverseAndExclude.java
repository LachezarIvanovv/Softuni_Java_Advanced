package FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int divideNumber = Integer.parseInt(scanner.nextLine());

        numbers.removeIf(n -> (n % divideNumber == 0));
        Collections.reverse(numbers);
        numbers.forEach(e -> System.out.print(e + " "));
    }
}
