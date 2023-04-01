package advanced.FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = Integer.parseInt(scanner.nextLine());
        List<Integer> dividableNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        Predicate<Integer> predicate = n -> {
            for (Integer dividableNumber : dividableNumbers) {
                if(n % dividableNumber != 0){
                    return false;
                }
            }
            return true;
        };
        for (int i = 1; i <= range; i++) {
            if(predicate.test(i)){
                System.out.print(i + " ");
            }
        }
    }
}
