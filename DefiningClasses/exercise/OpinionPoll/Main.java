package DefiningClasses.exercise.OpinionPoll;

import advanced.DefiningClasses.exercise.OpinionPoll.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> list = new ArrayList<>();

        while(n-- > 0){
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Employee person = new Employee(name,age);
            list.add(person);

        }
        list.stream()
                .filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

    }
}
