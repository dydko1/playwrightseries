package trash345.nestedclass;

public class University {

    static class Deparment {

        private String departmentName;
        private int facultyCount;

        public Deparment(String departmentName, int facultyCount) {
            this.departmentName = departmentName;
            this.facultyCount = facultyCount;
        }

        public void displayInfo() {
            System.out.println("Department: " + departmentName);
            System.out.println("Number of Faculty Members: " + facultyCount);
        }
    }
}
