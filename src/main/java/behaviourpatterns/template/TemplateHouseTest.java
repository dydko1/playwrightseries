package behaviourpatterns.template;

public class TemplateHouseTest {
    public static void main(String[] args) {
        House wooden = new WoodenHouse();
        wooden.buildHouse();
    }
}