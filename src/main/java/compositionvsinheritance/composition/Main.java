package compositionvsinheritance.a1.composition;

public class Main {
    public static void main(String[] args) {
        Address addr = new Address("123 Main St", "Springfield", "12345");
        Person person = new Person("Bob", addr);
        person.displayInfo();
    }
}