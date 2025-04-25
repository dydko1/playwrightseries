package trash345.nestedclass;

public class Car {

    public void startEngine() {
        class Engine {
            public void start() {
                System.out.println("Engine started");
            }
        }
        Engine engine = new Engine();
        engine.start();
    }
}
