package SetsAndMaps.lab;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,double[]> map = new TreeMap<>();

        for (int i = n; i > 0; i--) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToDouble(Double::parseDouble)
                                    .toArray();

            map.put(name, grades);
        }
        for (var entry : map.entrySet()) {
            double sum = 0;
            for (double element : entry.getValue()) {
                sum += element;
            }
            sum /= entry.getValue().length;
            System.out.println(entry.getKey() + " is graduated with " + sum);
        }
    }
}
