package creationalpatterns.training.geeksforgeeks.factorymethod_1.abstaclass;

public class CreatorProductB extends Creator{
    @Override
    public Product factoryMethod() {
        return new ProductB();
    }
}