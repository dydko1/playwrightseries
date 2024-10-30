package trash123.static1;

public class IdGen {
    private static int nextID = 0;

    public static int nextId() {
        return nextID++;
    }
}