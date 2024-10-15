package creationalpatterns.training.geeksforgeeks.factorymethod_1.interface1;

public class MainFac2 {
    public static void main(String[] args) {
        Factory fA = new FactoryProductA();
        Product productA = fA.factoryMethod();
        productA.display();

        Factory fB = new FactoryProductB();
        Product productB = fB.factoryMethod();
        productB.display();
    }
}