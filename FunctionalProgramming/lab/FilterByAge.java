package advanced.FunctionalProgramming.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            people.putIfAbsent(name, age);

        }
        String ageCondition = scanner.nextLine();
        int ageFormat = Integer.parseInt(scanner.nextLine());
        String[] printFormat = scanner.nextLine().split(" ");

        Predicate<Map.Entry<String, Integer>> filter = ageFilter(ageCondition,ageFormat);

        Consumer<Map.Entry<String, Integer>> printer = print(printFormat);

        resultPrint(filter,printer,people);
    }

    private static void resultPrint(Predicate<Map.Entry<String, Integer>> filter,
                                    Consumer<Map.Entry<String, Integer>> printer,
                                    Map<String, Integer> people) {
        people.entrySet().stream()
                .filter(filter)
                .forEach(printer);
    }

    private static Consumer<Map.Entry<String, Integer>> print(String[] printFormat) {
        if(printFormat.length == 1){
            if(printFormat[0].equals("name")){
                return e -> System.out.println(e.getKey());
            }else if(printFormat[0].equals("age")){
                return e -> System.out.println(e.getValue());
            }
        }

        return e -> System.out.println(e.getKey() + " - " + e.getValue());
    }

    private static Predicate<Map.Entry<String, Integer>> ageFilter(String condition, int format) {
        if(condition.equals("younger")){
            return e -> e.getValue() <= format;
        }
        return e -> e.getValue() >= format;
    }
}
