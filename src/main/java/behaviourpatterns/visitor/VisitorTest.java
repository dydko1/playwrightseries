package behaviourpatterns.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        Element[] items = new Element[]{
                new Book(20, "Pan Tadeusz"),
                new Book(50, "Wzorce projektowe Java"),
                new Vegetable(3, 4, "Kapusta"),
                new Vegetable(5, 2, "Marchewka")};

        int total = calculatePrice(items);
        System.out.println("Całkowita Cena = " + total);
    }

    private static int calculatePrice(Element[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (Element item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}