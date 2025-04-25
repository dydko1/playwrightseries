package trash345.constructor;

public class Classroom {

    private String className;
    private String[] students;

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;

    }

    private void printStudents() {
        for (String student : students) {
            System.out.println(student);
        }
    }

    private void getClassName() {
        System.out.println(className);
    }

    public static void main(String[] args) {
        String[] students = {"A", "B", "C", "D", "E"};
        Classroom classroom = new Classroom("1A", students);
        classroom.printStudents();
        classroom.getClassName();
    }
}
