package structuralpatterns.decorator.decorator1;

public class MeatDecorator extends Sandwich1Decorator {

    public MeatDecorator(Sandwich1 customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return super.make() + " Szynka";
    }
}