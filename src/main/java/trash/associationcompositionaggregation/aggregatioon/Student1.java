package trash.associationcompositionaggregation.aggregatioon;

public class Student1 {

    private String studentName;
    private int studentId;

    public Student1(String studentName, int studentId){
        this.studentName=studentName;
        this.studentId=studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }
}