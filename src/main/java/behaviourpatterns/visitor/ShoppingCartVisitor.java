package behaviourpatterns.visitor;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit (Vegetable vegetable);
}