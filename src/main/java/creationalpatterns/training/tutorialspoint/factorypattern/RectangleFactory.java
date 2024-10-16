package creationalpatterns.training.tutorialspoint.factorypattern;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape shapeFactory() {
        return new Rectangle();
    }
}