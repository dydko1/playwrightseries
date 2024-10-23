package structuralpatterns.tarinings.javaedupl.decorator;

public class MeatDecoratorMain {
    public static void main(String[] args) {
        Sandwich sandwich = new CheeseDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}