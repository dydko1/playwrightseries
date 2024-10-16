package creationalpatterns.training.tutorialspoint.factorypattern;

public class MainShape {
    public static void main(String[] args) {
        //ShapeFactory circleFactory = new CircleFactory();
        Shape circle = new CircleFactory().shapeFactory();
        circle.draw();

        System.out.println("++++++++++++++++++++++++++++");
        Shape circle1=new Circle();
        circle1.draw();
        System.out.println("++++++++++++++++++++++++++++");

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle=rectangleFactory.shapeFactory();
        rectangle.draw();

        ShapeFactory sqFac=new SquareFactory();
        Shape square=sqFac.shapeFactory();
        square.draw();
    }
}