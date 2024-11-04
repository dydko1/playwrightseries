package behaviourpatterns.visitor;

public interface Element {
    int accept(ShoppingCartVisitor visitor);
}