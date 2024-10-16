package creationalpatterns.training.tutorialspoint.abstractfactorypattern.shapefactory;

import creationalpatterns.training.tutorialspoint.abstractfactorypattern.concreate.RectangleRounded;
import creationalpatterns.training.tutorialspoint.abstractfactorypattern.concreate.SquareRounded;
import creationalpatterns.training.tutorialspoint.abstractfactorypattern.enums.ShapeForm;
import creationalpatterns.training.tutorialspoint.abstractfactorypattern.interfaces.Shape;

public class ShapeRounded extends AbstractFactory{
    @Override
    public Shape getShape(ShapeForm shapeForm) {
        return switch (shapeForm){
            case RECTANGLE -> new RectangleRounded();
            case SQUARE -> new SquareRounded();
            default -> throw new IllegalStateException("Invalid data: " +shapeForm.name());
        };
    }
}