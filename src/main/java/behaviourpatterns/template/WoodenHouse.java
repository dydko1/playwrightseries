package behaviourpatterns.template;

public class WoodenHouse extends House {

    @Override
    public void paintHouse() {
        System.out.println("Dom został pomalowany.");
    }

    @Override
    public void constructDoors() {
        System.out.println("Drzwi zostały zainstalowane");
    }

    @Override
    public void constructWindows() {
        System.out.println("Okna zostały zainstalowane");
    }

    @Override
    public void constructWalls() {
        System.out.println("Drewniane ściany zostały zbudowane.");
    }
}