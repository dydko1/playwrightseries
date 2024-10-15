package creationalpatterns.training.geeksforgeeks.factorymethod_1.abstaclass;

public class MainFactory1 {
    public static void main(String[] args) {
        // Creator creatorA = new CreatorProductA();
        Product productA = new CreatorProductA().factoryMethod();
        productA.display();

        Creator creatorB = new CreatorProductB();
        Product productB=creatorB.factoryMethod();
        productB.display();

    }
}