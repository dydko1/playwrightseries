package trash.associationcompositionaggregation.aggregatioon;

import java.util.ArrayList;
import java.util.List;

public class AggregationExample {
    public static void main(String[] args) {
        // Creating independent Student1 objects
        Student1 s1 = new Student1("Parul", 1);
        Student1 s2 = new Student1("Sachin", 2);
        Student1 s3 = new Student1("Priya", 1);
        Student1 s4 = new Student1("Rahul", 2);

        List<Student1> cse_students = new ArrayList<Student1>();
        cse_students.add(s1);
        cse_students.add(s2);

        List<Student1> ee_students = new ArrayList<Student1>();
        ee_students.add(s3);
        ee_students.add(s4);

        // Creating Department object with a Students list
        // using Aggregation (Department "has" students)
        Department1 CSE = new Department1("CSE", cse_students);
        Department1 EE = new Department1("EE", ee_students);

        // Creating an initial list of Departments
        List<Department1> departments = new ArrayList<Department1>();
        departments.add(CSE);
        departments.add(EE);

        // Creating an Institute object with Departments list
        // using Aggregation (Institute "has" Departments)
        Institute institute = new Institute("BITS", departments);

        System.out.print("Total students in institute: ");

        // Calling method to get total number of students
        // in the institute and printing on console
        System.out.print(
                institute.getTotalStudentsInInstitute());
    }
}