package creationalpatterns.training.tutorialspoint.abstractfactorypattern.shapefactory;

import creationalpatterns.training.tutorialspoint.abstractfactorypattern.enums.ShapeForm;
import creationalpatterns.training.tutorialspoint.abstractfactorypattern.interfaces.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeForm shapeForm);
}