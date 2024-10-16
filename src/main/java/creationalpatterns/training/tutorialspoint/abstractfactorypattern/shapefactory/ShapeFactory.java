package creationalpatterns.training.tutorialspoint.abstractfactorypattern.shapefactory;

import creationalpatterns.training.tutorialspoint.abstractfactorypattern.concreate.Rectangle;
import creationalpatterns.training.tutorialspoint.abstractfactorypattern.concreate.Square;
import creationalpatterns.training.tutorialspoint.abstractfactorypattern.enums.ShapeForm;
import creationalpatterns.training.tutorialspoint.abstractfactorypattern.interfaces.Shape;

public class ShapeFactory extends AbstractFactory {

    @Override
     public Shape getShape(ShapeForm shapeForm) {
        return switch (shapeForm ){
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
            default -> throw new IllegalStateException("Invalid data: " +shapeForm.name());
        };
    }
}