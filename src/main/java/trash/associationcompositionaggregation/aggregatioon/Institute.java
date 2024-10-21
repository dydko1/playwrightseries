package trash.associationcompositionaggregation.aggregatioon;

import java.util.List;

public class Institute {

    private String instituteName;
    private List<Department1> department1s;

    public Institute(String instituteName, List<Department1> department1s) {
        this.instituteName = instituteName;
        this.department1s = department1s;
    }

    public void addDepartment(Department1 department1) {
        department1s.add(department1);
    }

    public int getTotalStudentsInInstitute() {
        int noOfStudents = 0;

        for (Department1 dept : department1s) {
            List<Student1> student1s = dept.getStudents();
            for (Student1 s : student1s)
                noOfStudents++;
        }

        return noOfStudents;
    }
}