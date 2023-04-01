package advanced.FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        UnaryOperator<List<Integer>> addFunction = e -> e.stream().map(el -> el + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyFunction = e -> e.stream().map(el -> el * 2).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractFunction = e -> e.stream().map(el -> el - 1).collect(Collectors.toList());


        String command = scanner.nextLine();
        while(!command.equals("end")){
            if(command.equals("add")){
                numbers = addFunction.apply(numbers);
            }else if(command.equals("multiply")){
               numbers = multiplyFunction.apply(numbers);
            }else if(command.equals("subtract")){
                numbers = subtractFunction.apply(numbers);
            }else if(command.equals("print")){
                numbers.forEach(e -> System.out.print(e + " "));
                System.out.println();
            }
            command = scanner.nextLine();
        }
    }
}
