package structuralpatterns.tarinings.javaedupl.flyweight;

public class Item123 {

    private final String name;

    public Item123(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " -:- Item{" +
                "name='" + name + '\'' +
                '}';
    }
}