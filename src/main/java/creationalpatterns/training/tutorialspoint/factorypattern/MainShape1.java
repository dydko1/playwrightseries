package creationalpatterns.training.tutorialspoint.factorypattern;

import static creationalpatterns.training.tutorialspoint.factorypattern.ShapeEnum.*;

public class MainShape1 {
    public static void main(String[] args) {
        Shape circle = new ShapeFactory1()
                .getShape(CIRCLE);
        circle.draw();
        Shape squ = new ShapeFactory1()
                .getShape(SQUARE);
        squ.draw();
        Shape rec = new ShapeFactory1()
                .getShape(RECTANGLE);
        rec.draw();
    }
}