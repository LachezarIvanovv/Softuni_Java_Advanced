package StacksAndQueues.exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kids = scanner.nextLine().split("\\s+");
        int counter = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> kidsInTheGame = new ArrayDeque<>();

        for (String kid : kids) {
            kidsInTheGame.offer(kid);
        }


        while(kidsInTheGame.size() > 1){
            for (int i = 1; i < counter; i++) {

                kidsInTheGame.offer(kidsInTheGame.poll());

            }
            System.out.println("Removed " + kidsInTheGame.poll());
        }
        System.out.println("Last is " + kidsInTheGame.poll());
    }
}
