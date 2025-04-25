package trash345.constructor;

public class Singleton1 {

    private static Singleton1 instance = null;

    private Singleton1() {
        System.out.println("Singleton instance created.");
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            System.out.println("Creating new Singleton instance.");
            instance = new Singleton1();
        }
        System.out.println("Returning existing Singleton instance.");
        return instance;
    }

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        System.out.println("--------------");
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println("--------------");
        Singleton1 singleton3 = Singleton1.getInstance();
        System.out.println("--------------");
        Singleton1 singleton4 = Singleton1.getInstance();
        singleton4.getInstance();
    }
}
