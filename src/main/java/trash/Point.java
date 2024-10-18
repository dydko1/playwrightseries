package trash;

public class Point {
    private static int createdPoints = 0;

    private final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        ++createdPoints;
    }

    public static int count() {
        return createdPoints;
    }
}