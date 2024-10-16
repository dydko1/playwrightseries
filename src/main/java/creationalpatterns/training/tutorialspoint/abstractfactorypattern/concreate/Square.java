package creationalpatterns.training.tutorialspoint.abstractfactorypattern.concreate;


import creationalpatterns.training.tutorialspoint.abstractfactorypattern.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method:" + getClass().getSimpleName());
    }
}