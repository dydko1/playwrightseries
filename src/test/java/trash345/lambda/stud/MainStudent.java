package trash345.lambda.stud;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> student_list = new ArrayList<>();
        student_list.add(new Student("Adriana Jamie", 15, "X"));
        student_list.add(new Student("Felix Uisdean", 15, "X"));
        student_list.add(new Student("Conceicao Palmira", 14, "X"));
        student_list.add(new Student("Jair Camila", 14, "X"));
        student_list.add(new Student("Micaela Rosana", 15, "X"));

        System.out.println("Student details:");
        for (Student Student : student_list) {
            System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getSClass());
        }
        System.out.println("------------");
        student_list.sort(Comparator.comparing(Student::getAge));
        System.out.println("Student details:");
        for (Student Student : student_list) {
            System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getSClass());
        }
    }
}
