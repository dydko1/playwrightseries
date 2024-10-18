package creationalpatterns.training.medium.prototype.oth;

public class Animal implements Cloneable {

    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species=species;
        this.age=age;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super
                .clone();
    }
}