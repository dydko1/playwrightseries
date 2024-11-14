package structuralpatterns.decorator.decorator1;

public class CheeseDecorator extends MeatDecorator{

    public CheeseDecorator(Sandwich1 customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return super.make() +" Serek!!";
    }
}