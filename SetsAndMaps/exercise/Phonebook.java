package advanced.SetsAndMaps.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> phonebook = new HashMap<>();

        while(!input.equals("search")){
            String[] data = input.split("-");
            String name = data[0];
            String phoneNumber = data[1];

            phonebook.put(name, phoneNumber);

            input = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();

        while(!secondInput.equals("stop")){
            if(phonebook.containsKey(secondInput)){
                System.out.printf("%s -> %s%n", secondInput, phonebook.get(secondInput));
            }else{
                System.out.printf("Contact %s does not exist.%n", secondInput);
            }
            secondInput = scanner.nextLine();
        }
    }
}
