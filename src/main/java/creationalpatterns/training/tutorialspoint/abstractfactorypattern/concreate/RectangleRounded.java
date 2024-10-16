package creationalpatterns.training.tutorialspoint.abstractfactorypattern.concreate;

import creationalpatterns.training.tutorialspoint.abstractfactorypattern.interfaces.Shape;

public class RoundedRectangle implements Shape {

    @Override
    public void Draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}