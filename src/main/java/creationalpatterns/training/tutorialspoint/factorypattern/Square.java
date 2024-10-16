package creationalpatterns.training.tutorialspoint.factorypattern;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("I'm in " + getClass().getSimpleName());
    }
}