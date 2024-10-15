package creationalpatterns.training.geeksforgeeks.factorymethod_1.interface1;

public class FactoryProductB implements Factory{
    @Override
    public Product factoryMethod() {
        return new ProductB();
    }
}