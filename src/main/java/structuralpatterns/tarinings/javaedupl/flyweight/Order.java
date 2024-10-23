package structuralpatterns.tarinings.javaedupl.flyweight;

public class Order {
    private final int orderNumber;
    private final Item123 item123;

    public Order(int orderNumber, Item123 item123) {
        this.orderNumber = orderNumber;
        this.item123 = item123;
    }

    public void processOrder() {
        System.out.println("Pozycja:" + item123 + "ilość:" + orderNumber);
    }
}