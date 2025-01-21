package trash123.stream.exc5;

import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Employee> employees =
                Arrays.asList(
                        new Employee(1, 2000d, "Risk Department", DayJob.FULL_TIME),
                        new Employee(2,2500d, "Scoring Department", DayJob.FULL_TIME),
                        new Employee(3,2600d, "Scoring Department", DayJob.FULL_TIME),
                        new Employee(4,2700d, "Credit Department", DayJob.FULL_TIME),
                        new Employee(5,2700d, "Credit Department",DayJob.PART_TIME)
                );

        employees.stream()
                .map(e->e.getDivision())
                .forEach(System.out::println);
    }
}