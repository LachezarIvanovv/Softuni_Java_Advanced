package advanced.DefiningClasses.exercise.OpinionPoll;

public class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department, String email, int age) {
    }

    public Employee(String name, double salary, String position, String department, int age) {
    }

    public Employee(String name, double salary, String position, String department, String email) {
    }

    public Employee(String name, double salary, String position, String department) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", this.name,this.age);
    }

    public double getSalary() {
        return 0;
    }
}
