package creationalpatterns.training.medium.factory;

public class Sushi implements Dish {
    @Override
    public void prepare() {
        System.out.println("Preparing sushi...");
    }

    @Override
    public void serve() {
        System.out.println("Serving sushi...");
    }

    @Override
    public String toString(){
        return "Sushi: "+ getClass().getSimpleName();
    }
}