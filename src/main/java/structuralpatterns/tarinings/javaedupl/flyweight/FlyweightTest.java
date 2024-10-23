package structuralpatterns.tarinings.javaedupl.flyweight;

public class FlyweightTest {
    public static void main(String args[]) {
        InventorySystem inventorySystem = new InventorySystem();
 
        inventorySystem.takeOrder("TV Samsung", 121);
        inventorySystem.takeOrder("Lodówka Samsung", 399);
        inventorySystem.takeOrder("Smartfon Motorola", 171);
        inventorySystem.takeOrder("Aparat Nikon", 12);
        inventorySystem.takeOrder("Słuchawki Bluetooth", 121);
 
        inventorySystem.takeOrder("TV Samsung", 134);
        inventorySystem.takeOrder("Lodówka Samsung", 151);
        inventorySystem.takeOrder("Smartfon Motorola", 34);
        inventorySystem.takeOrder("Aparat Nikon", 85);
        inventorySystem.takeOrder("Słuchawki Bluetooth", 1296);

        inventorySystem.takeOrder("TV Samsung", 3401);
        inventorySystem.takeOrder("Lodówka Samsung", 13);
        inventorySystem.takeOrder("Smartfon Motorola", 454);
        inventorySystem.takeOrder("Aparat Nikon", 442);
        inventorySystem.takeOrder("Słuchawki Bluetooth", 921);

        inventorySystem.process();
 
        System.out.println(inventorySystem.report());
                // Wszystkich obiektów: 5
    }
}