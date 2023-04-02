package advanced.SetsAndMaps.exercise;

import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int firstSetSize = Integer.parseInt(numbers[0]);
        int secondSetSize = Integer.parseInt(numbers[1]);

        Set<String> firstSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetSize; i++) {
            String input = scanner.nextLine();
            firstSet.add(input);
        }

        Set<String> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < secondSetSize; i++) {
            String input = scanner.nextLine();
            secondSet.add(input);
        }
        firstSet.retainAll(secondSet);
        System.out.println(String.join(" ", firstSet));
    }
}
