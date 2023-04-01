package FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
