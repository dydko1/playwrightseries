package creationalpatterns.training.medium.factory;

public class PizzaFactory implements DishFactory{
    @Override
    public Dish produceDish() {
        return new Pizza();
    }
}