package creationalpatterns.training.medium.prototype.oth;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{

    private String name;
    private int age;
    private List<String> hobbies;

    public Person(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>(hobbies); // Ensures a copy of the list, not just the reference.
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.hobbies = new ArrayList<>(this.hobbies); // Deep copying of mutable fields.
        return cloned;
    }
}