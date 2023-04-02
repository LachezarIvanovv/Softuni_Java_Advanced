package SetsAndMaps.lab;

import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> guests = new TreeSet<>();

        while(!input.equals("PARTY")){
            guests.add(input);

            input = scanner.nextLine();
        }
        String guest = scanner.nextLine();

        while (!guest.equals("END")){
            if(guests.contains(guest)){
                guests.remove(guest);
            }

            guest = scanner.nextLine();
        }
        System.out.println(guests.size());
        for (String e : guests) {
            System.out.println(e);
        }
    }
}
