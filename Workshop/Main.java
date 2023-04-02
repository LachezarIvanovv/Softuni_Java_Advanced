package advanced.Workshop;

//import DefiningClasses.exercise.CompanyRoster.Employee;
import advanced.DefiningClasses.exercise.OpinionPoll.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayList<Employee> employees = new ArrayList<>();
        List<DefiningClasses.exercise.CompanyRoster.Department> departmentList = new ArrayList<>();

        while(number-- > 0){
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];
            Employee employee = null;

            switch (data.length){
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    if(data[4].matches("\\d+")){
                        int age = Integer.parseInt(data[4]);
                        employee = new Employee(name, salary, position, department, age);
                    }else{
                        String email = data[4];
                        employee = new Employee(name, salary, position, department, email);
                    }
                    break;
                case 6:
                    String email = data[4];
                    int age = Integer.parseInt(data[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    break;
            }
            boolean departmentExists = departmentList.stream().filter(dep -> dep.getName().equals(department)).count() >= 1;
            if(!departmentExists){
                departmentList.add(new DefiningClasses.exercise.CompanyRoster.Department(department));
            }
            DefiningClasses.exercise.CompanyRoster.Department currentDepartment = departmentList.stream().filter(dep -> dep.getName().equals(department)).findFirst().get();
            currentDepartment.getEmployees().add(employee);
        }
        DefiningClasses.exercise.CompanyRoster.Department highestPaidDepartment = departmentList.stream()
                .max(Comparator.comparingDouble(DefiningClasses.exercise.CompanyRoster.Department::calculateAvgSalary))
                .get();
        System.out.printf("Highest Average Salary: %s%n", highestPaidDepartment.getName());

//        highestPaidDepartment.getEmployees().stream()
//                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
//                .forEach(System.out::println);
    }
}
