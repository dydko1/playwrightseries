package compositionvsinheritance.a1.inheritance;

public class Person {

    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, age: %s", name, age);
    }
}