package advanced.SetsAndMaps.lab;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));



        for (int i = 0; i < 50; i++) {
            if(firstDeck.isEmpty() || secondDeck.isEmpty()){
                break;
            }
            int firstPlayer = firstDeck.iterator().next();
            firstDeck.remove(firstPlayer);

            int secondPlayer = secondDeck.iterator().next();
            secondDeck.remove(secondPlayer);

            if(firstPlayer > secondPlayer){
                firstDeck.add(firstPlayer);
                firstDeck.add(secondPlayer);
            }else if(firstPlayer < secondPlayer){
                secondDeck.add(firstPlayer);
                secondDeck.add(secondPlayer);
            }
        }
        if(firstDeck.size() > secondDeck.size()){
            System.out.println("First player win!");
        }else if(firstDeck.size() < secondDeck.size()){
            System.out.println("Second player win!");
        }else{
            System.out.println("Draw!");
        }
    }
}
