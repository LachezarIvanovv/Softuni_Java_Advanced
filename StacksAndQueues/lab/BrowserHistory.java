package advanced.StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String currentURL = "";
        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!command.equals("Home")) {
            if (command.equals("back")) {
                if (stack.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                } else {
                    currentURL = stack.pop();
                }
            } else {
                if (!currentURL.equals("")) {
                    stack.push(currentURL);
                }
                currentURL = command;
            }

            System.out.println(currentURL);
            command = scanner.nextLine();
        }
    }
}
