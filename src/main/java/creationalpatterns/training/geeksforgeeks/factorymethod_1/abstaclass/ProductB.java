package creationalpatterns.training.geeksforgeeks.factorymethod_1.abstaclass;

public class ProductB extends Product {
    @Override
    public void display() {
        System.out.println("This is " + getClass().getSimpleName());
    }
}