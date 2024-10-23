package structuralpatterns.tarinings.javaedupl.flyweight;

import java.util.ArrayList;
import java.util.List;

public class InventorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new ArrayList<>();

    public void takeOrder(String itemName, int orderNumber) {
        Item123 item = catalog.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    public void process() {
        for (Order order : orders) {
            order.processOrder();
        }
    }

    public String report() {
        return "Wszystkich obiektów: " + catalog.totalItemsMade();
    }
}