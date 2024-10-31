package behaviourpatterns.strategy.strategy2;

public class Context {

    private Strategy1 strategy1;

    public Context(Strategy1 strategy1) {
        this.strategy1 = strategy1;
    }

    public void execute(int[] numbers) {
        strategy1.sort(numbers);
    }
}