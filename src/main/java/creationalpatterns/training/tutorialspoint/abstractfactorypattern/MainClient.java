package creationalpatterns.training.tutorialspoint.abstractfactorypattern;

import creationalpatterns.training.tutorialspoint.abstractfactorypattern.enums.ShapeForm;
import creationalpatterns.training.tutorialspoint.abstractfactorypattern.shapefactory.AbstractFactory;
import creationalpatterns.training.tutorialspoint.abstractfactorypattern.shapefactory.FactoryProducer;
import creationalpatterns.training.tutorialspoint.abstractfactorypattern.interfaces.Shape;

public class MainClient {
    public static void main(String[] args) {
        AbstractFactory shapeRounded = new FactoryProducer().getFactory1(true);
        Shape recRounded = shapeRounded
                .getShape(ShapeForm.RECTANGLE);
        recRounded.draw();
        Shape sqRounded = shapeRounded
                .getShape(ShapeForm.SQUARE);
        sqRounded.draw();

        AbstractFactory shape = new FactoryProducer().getFactory1(false);
        Shape rec = shape.getShape(ShapeForm.RECTANGLE);
        rec.draw();
        Shape sq = shape.getShape(ShapeForm.SQUARE);
        sq.draw();


    }
}