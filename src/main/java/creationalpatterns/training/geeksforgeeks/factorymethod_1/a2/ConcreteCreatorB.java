package creationalpatterns.training.geeksforgeeks.factorymethod_1.a2;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}