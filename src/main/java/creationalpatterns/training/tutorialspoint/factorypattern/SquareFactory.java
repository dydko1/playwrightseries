package creationalpatterns.training.tutorialspoint.factorypattern;

public class SquareFactory implements ShapeFactory{
    @Override
    public Shape shapeFactory() {
        return new Square();
    }
}