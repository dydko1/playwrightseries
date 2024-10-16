package creationalpatterns.training.tutorialspoint.abstractfactorypattern.concreate;

import creationalpatterns.training.tutorialspoint.abstractfactorypattern.interfaces.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void Draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}