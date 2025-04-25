package trash345.nestedclass;

public class School {

    static class Student {

        String name;
        String grade;

        Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}
