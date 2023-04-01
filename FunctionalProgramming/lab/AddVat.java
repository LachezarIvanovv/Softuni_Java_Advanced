package FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> vat = x -> x * 1.20;

//        List<Double> numbers = Arrays.stream(scanner.nextLine().split(", "))
//                .map(Double::parseDouble)
//                .collect(Collectors.toList());
//
//        System.out.println("Prices with VAT: ");
//
//        for (Double number : numbers) {
//            System.out.printf("%.2f%n",vat.apply(number));
//        }

        Consumer<Double> printer = d -> System.out.printf("%.2f%n", d);

        System.out.println("Prices with VAT: ");

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(vat)
                .forEach(printer);
    }
}
