package trash123.interfaces.exc01.shape1;

public class MainShape {
    public static void main(String[] args) {
        Shape shape = new Triangle();
        System.out.println(shape.getArea());
        Triangle triangle = (Triangle) shape;
        System.out.println(triangle.getShape());

    }
}