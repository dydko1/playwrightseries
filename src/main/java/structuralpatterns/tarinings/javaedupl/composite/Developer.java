package structuralpatterns.tarinings.javaedupl.composite;

public class Developer implements Employee {
        private String name;
        private double salary;
 
        public Developer(String name,double salary){
                this.name = name;
                this.salary = salary;
        }
       
        public void add(Employee employee) {
                throw new UnsupportedOperationException();
        }
 
        public void remove(Employee employee) {
                throw new UnsupportedOperationException();
        }
 
        public Employee getChild(int i) {
                return null;
        }
 
        public String getName() {
                return name;
        }
 
        public double getSalary() {
                return salary;
        }
 
        public void printDetails() {
                System.out.println("---------------------");
                System.out.println("Name: " + getName());
                System.out.println("Salary: " + getSalary());
        }
 
}