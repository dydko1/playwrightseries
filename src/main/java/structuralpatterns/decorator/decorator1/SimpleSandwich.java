package structuralpatterns.decorator.decorator1;

public class SimpleSandwich implements Sandwich1 {
    @Override
    public String make() {
        return "Bułka";
    }
}