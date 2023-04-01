package DefiningClasses.exercise.CompanyRoster;

import advanced.DefiningClasses.exercise.OpinionPoll.Employee;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name;
    public List<Employee> employees;

    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }
    public double calculateAvgSalary(){
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
