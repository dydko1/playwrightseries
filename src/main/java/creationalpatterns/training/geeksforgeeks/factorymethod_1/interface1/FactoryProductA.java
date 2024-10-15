package creationalpatterns.training.geeksforgeeks.factorymethod_1.interface1;

public class FactoryProductA implements Factory {
    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
}