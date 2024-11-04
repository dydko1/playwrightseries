package behaviourpatterns.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost;
        // powyżej 50 zł 5 zł rabatu
        if (book.getPrice() > 30) {
            cost = book.getPrice() - 3;
        } else {
            cost = book.getPrice();
        }
        System.out.println("Tytuł::" + book.getTitle() + " cena =" + cost);
        return cost;
    }

    @Override
    public int visit(Vegetable vegetable) {
        int cost = vegetable.getPricePerKg() * vegetable.getWeight();
        System.out.println(vegetable.getName() + " cena = " + cost);
        return cost;
    }
}