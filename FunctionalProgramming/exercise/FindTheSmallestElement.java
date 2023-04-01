package advanced.FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> findTheSmallest = e -> {
            int minNumber = Integer.MAX_VALUE;
            int minPosition = -1;

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) <= minNumber) {
                    minNumber = numbers.get(i);
                    minPosition = numbers.indexOf(minNumber);
                }
            }
            return numbers.lastIndexOf(minNumber);
        };

        System.out.println(findTheSmallest.apply(numbers));
    }
}
