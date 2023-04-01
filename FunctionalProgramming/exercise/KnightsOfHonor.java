package advanced.FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> printer = e -> System.out.println("Sir " + e);
        Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList())
                .forEach(printer);
    }
}
