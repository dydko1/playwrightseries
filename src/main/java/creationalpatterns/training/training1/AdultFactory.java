package creationalpatterns.training.training1;

public class AdultFactory implements PersonFactory{
    @Override
    public Person getPerson() {
        return new Adult(50);
    }
}