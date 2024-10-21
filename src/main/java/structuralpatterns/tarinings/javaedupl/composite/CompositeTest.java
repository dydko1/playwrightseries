package structuralpatterns.tarinings.javaedupl.composite;

public class CompositeTest {
        public static void main(String[] args) {
                Employee employee1 = new Developer("Mateusz Nowak", 4242);
                Employee employee2 = new Developer("Tomasz Kowalski", 7000);
                Employee manager1 = new Manager("Michal Malinowski",6000);
                manager1.add(employee1);
                manager1.add(employee2);
                Employee employee3 = new Developer("Jan Fasola", 2300);
                Manager generalManager=new Manager("Chuck Norris", 29000);
                generalManager.add(employee3);
                generalManager.add(manager1);
                generalManager.printDetails();
        }
}