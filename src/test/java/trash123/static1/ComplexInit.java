package trash123.static1;

public class ComplexInit {

    private static int x;
    private static int y;
    private static int z;

    static {
        x = 10;
        y = 20;
        z = calculateZ(x, y);
    }

    private static int calculateZ(int x, int y) {
        return x + y;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int getZ() {
        return z;
    }
}