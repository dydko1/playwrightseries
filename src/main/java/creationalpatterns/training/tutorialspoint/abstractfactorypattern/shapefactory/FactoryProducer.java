package creationalpatterns.training.tutorialspoint.abstractfactorypattern.shapefactory;

public class FactoryProducer {
    public AbstractFactory getFactory1(boolean rounded) {
        return rounded ?
                new ShapeRounded() :
                new ShapeFactory();
    }
}