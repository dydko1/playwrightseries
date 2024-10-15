package creationalpatterns.training.medium.factory;

public class SushiFactory implements DishFactory {
    @Override
    public Dish produceDish() {
        return new Sushi();
    }
}