package structuralpatterns.decorator.decorator1;

public abstract class Sandwich1Decorator implements Sandwich1 {

    protected Sandwich1 customSandwich;

    public Sandwich1Decorator(Sandwich1 customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make() {
        return customSandwich.make();
    }
}