package StacksAndQueues.exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int countToPush = Integer.parseInt(input[0]);
        int countToPop = Integer.parseInt(input[1]);
        int elementToSearch = Integer.parseInt(input[2]);

        String[] numbers = scanner.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < countToPush; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }

        for (int i = 0; i < countToPop; i++) {
            stack.pop();
        }

        if(stack.contains(elementToSearch)){
            System.out.println("true");
        }else if(stack.isEmpty()){
            System.out.println("0");
        }else{
            System.out.println(Collections.min(stack));
        }
    }
}
