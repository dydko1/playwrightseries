package trash345.abstract1;

public class MainShape {
    public static void main(String[] args) {
        GeometricShape[] shapes = new GeometricShape[2];

        shapes[0] = new Triangle(5.0, 5.0, 5.0);
        shapes[1] = new Square(4.0);

        for (GeometricShape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }
    }
}
