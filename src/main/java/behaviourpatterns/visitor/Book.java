package behaviourpatterns.visitor;

public class Book implements Element{

    private int price;
    private String title;

    public Book(int price, String title) {
        this.price = price;
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}