package trash.associationcompositionaggregation.aggregatioon;

import java.util.List;

public class Department1 {

    private String depName;
    private List<Student1> students;

    public Department1(String depName, List<Student1> students) {
        this.depName = depName;
        this.students = students;
    }

    public List<Student1> getStudents(){
        return students;
    }

    public void addStudent(Student1 student1){
        students.add(student1);
    }
}