package creationalpatterns.training.geeksforgeeks.factorymethod_1.interface1;

public class ProductA implements Product{
    @Override
    public void display() {
        System.out.println(String.format("This is %s", getClass().getSimpleName()));
    }
}