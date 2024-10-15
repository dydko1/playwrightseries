package creationalpatterns.training.geeksforgeeks.factorymethod_1.abstaclass;

public class CreatorProductA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
}