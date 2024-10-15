package creationalpatterns.training.geeksforgeeks.factorymethod_1.interface1;

public class ProductB implements Product {
    @Override
    public void display() {
        System.out.println(String.format("This is %s", getClass().getSimpleName()));
    }
}