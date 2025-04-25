package trash345.interfaces1.a;

public class MainShape123 {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }
    }
}
