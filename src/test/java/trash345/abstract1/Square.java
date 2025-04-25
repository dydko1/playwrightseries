package trash345.abstract1;

public class Square extends GeometricShape {

    private double side;

    // Define a constructor that initializes the side of the square
    public Square(double side) {
        // Assign the parameter to the instance variable
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
