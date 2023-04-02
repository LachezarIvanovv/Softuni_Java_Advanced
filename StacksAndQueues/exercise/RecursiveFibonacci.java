package StacksAndQueues.exercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if(n == 0){
            System.out.println(0);
        }
        long result = fib(n);
        System.out.println(result);
    }
    public static long fib(int n){
        if(n < 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
