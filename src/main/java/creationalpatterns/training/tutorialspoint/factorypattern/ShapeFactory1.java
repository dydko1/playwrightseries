package creationalpatterns.training.tutorialspoint.factorypattern;

public class ShapeFactory1 {

    public Shape getShape(ShapeEnum shapeEnum) {
        return switch (shapeEnum) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
            default -> throw new IllegalStateException("Invalid data");
        };
    }
}