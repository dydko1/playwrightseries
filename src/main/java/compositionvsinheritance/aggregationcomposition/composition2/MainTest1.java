package compositionvsinheritance.aggregationcomposition.composition2;

public class MainTest1 {
    public static void main(String[] args) {
        Engine engine = new Engine("V6", "300");
        Car car = new Car("F-Pace", engine);

        System.out.println(car);    }
}