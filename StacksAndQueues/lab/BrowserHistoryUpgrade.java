package StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String currentURL = "";

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        while(!command.equals("Home")){
            if(command.equals("back")){
                if(history.isEmpty()){
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                }else{
                    forward.push(currentURL);
                    currentURL = history.pop();
                }
            }else if(command.equals("forward")){
                if(forward.isEmpty()){
                    System.out.println("no next URLs");
                    command = scanner.nextLine();
                    continue;
                }else{
                    history.push(currentURL);
                    currentURL = forward.pop();
                }
            }else{
                if(!currentURL.equals("")){
                    history.push(currentURL);
                }
                forward.clear();
                currentURL = command;
            }

            command = scanner.nextLine();
            System.out.println(currentURL);

        }
    }
}
