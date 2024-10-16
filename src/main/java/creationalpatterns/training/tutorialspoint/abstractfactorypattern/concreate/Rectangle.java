package creationalpatterns.training.tutorialspoint.abstractfactorypattern.concreate;

import creationalpatterns.training.tutorialspoint.abstractfactorypattern.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method:" + getClass().getSimpleName());
    }
}