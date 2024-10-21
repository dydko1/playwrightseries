package structuralpatterns.tarinings.javaedupl.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private double salary;
    private List<Employee> employees = new ArrayList<Employee>();

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public Employee getChild(int i) {
        return employees.get(i);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void printDetails() {
        System.out.println("---------------------");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());

        Iterator<Employee> employeeIterator = employees.iterator();
        for (Employee employee :
                employees) {
            employee.printDetails();
        }
    }
}