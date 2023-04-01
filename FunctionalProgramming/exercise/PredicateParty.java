package advanced.FunctionalProgramming.exercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("Party!")){
            String[] data = input.split(" ");
            String command = data[0];

            List<String> guestsToAdd = new ArrayList<>();
            Predicate<String> predicate = getPredicate(data);

            if(command.equals("Double")){
                guests.stream()
                        .filter(predicate)
                        .forEach(p -> guestsToAdd.add(p));
                guests.addAll(guestsToAdd);
            }else if(command.equals("Remove")){
                guests.removeIf(predicate);
            }

            input = scanner.nextLine();
        }

        if(guests.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else{
            Collections.sort(guests);
            System.out.println(String.join(", ", guests) + " are going to the party!");
        }
    }

    private static Predicate<String> getPredicate(String[] data) {
        Predicate<String> predicate = null;
        switch (data[1]){
            case "StartsWith":
                predicate = name -> name.startsWith(data[2]);
                break;
            case "EndsWith":
                predicate = name -> name.endsWith(data[2]);
                break;
            case "Length":
                predicate = name -> name.length() == Integer.parseInt(data[2]);
                break;
        }
        return predicate;
    }
}
