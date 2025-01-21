package trash123.stream.exc5;

import lombok.Getter;

@Getter
public class Employee {
    private int id;
    private double salary;
    private String division;
    private DayJob dayJob;

    public Employee(int id, double salary, String division, DayJob dayJob) {
        this.id = id;
        this.salary = salary;
        this.division = division;
        this.dayJob = dayJob;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("Employee {");
        stringBuilder.append(" nid: ").append(this.id);
        stringBuilder.append(", nsalary: ").append(this.salary);
        stringBuilder.append(", ndivision: ").append(this.division);
        stringBuilder.append(", ndayJob: ").append(this.dayJob);
        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}