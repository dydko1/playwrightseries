package creationalpatterns.training.medium.factory;

public class Pizza implements Dish {
    @Override
    public void prepare() {
        System.out.println("Preparing pizza...");

    }

    @Override
    public void serve() {
        System.out.println("Serving pizza...");
    }

    @Override
    public String toString() {
        return "Pizza: " + getClass().getSimpleName();
    }
}