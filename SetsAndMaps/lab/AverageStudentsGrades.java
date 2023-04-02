package advanced.SetsAndMaps.lab;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> map = new TreeMap<>();

        for (int i = number; i > 0; i--) {
            String[] data = scanner.nextLine().split("\\s+");
            String studentName = data[0];
            double grade = Double.parseDouble(data[1]);

            map.putIfAbsent(studentName, new ArrayList<>());
            List<Double> grades = map.get(studentName);
            grades.add(grade);

        }
        for (var entry : map.entrySet()) {
            double averageScore = 0;
            for (Double aDouble : entry.getValue()) {
                averageScore += aDouble;
            }
            averageScore /= entry.getValue().size();

            List<String> grades = entry.getValue().stream()
                    .map(e -> String.format("%.2f", e))
                    .collect(Collectors.toList());
            String result = String.join(" ", grades);
            System.out.printf("%s -> %s (avg: %.2f)%n", entry.getKey(), result, averageScore);
        }
    }
}
