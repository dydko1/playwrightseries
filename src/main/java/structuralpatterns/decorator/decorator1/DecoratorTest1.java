package structuralpatterns.decorator.decorator1;

public class DecoratorTest1 {
    public static void main(String[] args) {
        Sandwich1 sandwich1 = new CheeseDecorator(new MeatDecorator(new CheeseDecorator(new SimpleSandwich())));

        System.out.println(sandwich1.make());
    }
}