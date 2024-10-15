package creationalpatterns.training.geeksforgeeks.factorymethod_1.a2;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}