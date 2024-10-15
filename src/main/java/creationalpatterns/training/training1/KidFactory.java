package creationalpatterns.training.training1;

public class KidFactory implements PersonFactory {
    @Override
    public Person getPerson() {
        return new Kid(15);
    }
}