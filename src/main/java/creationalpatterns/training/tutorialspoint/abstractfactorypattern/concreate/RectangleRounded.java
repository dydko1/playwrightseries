package creationalpatterns.training.tutorialspoint.abstractfactorypattern.concreate;

import creationalpatterns.training.tutorialspoint.abstractfactorypattern.interfaces.Shape;

public class RectangleRounded implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method:" + getClass().getSimpleName());
    }
}