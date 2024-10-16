package creationalpatterns.training.tutorialspoint.abstractfactorypattern.concreate;

import creationalpatterns.training.tutorialspoint.abstractfactorypattern.interfaces.Shape;

public class SquareRounded implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method:" + getClass().getSimpleName());
    }
}