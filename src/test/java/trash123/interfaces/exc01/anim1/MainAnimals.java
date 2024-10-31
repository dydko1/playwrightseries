package trash123.interfaces.exc01.anim1;

import java.util.ArrayList;
import java.util.List;

public class MainAnimals {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        System.out.println("-------------");
        new AnimalFeeder().feed(animals);
    }
}