package behaviourpatterns.template;

public abstract class House {
    public final void buildHouse() {
        constructBase();
        constructWalls();
        constructRoof();
        constructWindows();
        constructWalls();
        constructDoors();
        paintHouse();
    }

    public abstract void paintHouse();

    public abstract void constructDoors();

    public abstract void constructWindows();

    public abstract void constructWalls();

    private final void constructRoof() {
        System.out.println("Dach został zbudowany");
    }

    private final void constructBase() {
        System.out.println("Fundamenty zostały zbudowane");
    }
}