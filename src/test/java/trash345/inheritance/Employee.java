package trash345.inheritance;

public class Employee {

    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public int getSalary() {
        return salary;
    }
}