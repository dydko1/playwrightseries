package compositionvsinheritance.inheritance;

public class Employee extends Person {

    Integer salary;

    public Employee(String name, Integer age, Integer salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, age: %s, salary: %s", name, age, salary);
    }
}