package structuralpatterns.tarinings.javaedupl.decorator;

public class CheeseDecorator extends SandwichDecorator {

    public CheeseDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addCheese();
    }

    private String addCheese() {
        return " + ser";
    }
}