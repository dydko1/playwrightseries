package creationalpatterns.training.tutorialspoint.factorypattern;

public class CircleFactory implements ShapeFactory{
    @Override
    public Shape shapeFactory() {
        return new Circle();
    }
}