package SetsAndMaps.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Set<String> set = new TreeSet<>();

        for (int i = 0; i < number; i++) {
            String[] element = scanner.nextLine().split(" ");
            set.addAll(Arrays.asList(element));
        }
        for (String s : set) {
            System.out.print(s + " ");
        }
    }
}
