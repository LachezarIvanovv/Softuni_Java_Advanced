package advanced.SetsAndMaps.lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> set = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] data = input.split(", ");
            String direction = data[0];
            String registrationNumber = data[1];

            if (direction.equals("IN")) {
                set.add(registrationNumber);
            } else {
                set.remove(registrationNumber);
            }

            input = scanner.nextLine();
        }
        if (set.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String e : set) {
                System.out.println(e);
            }
        }
    }
}
