package behaviourpatterns.strategy.strategy2;

public class MainStrategy {
    public static void main(String[] args) {
        int[] numb = {1, 3, 43, 4, 4, 4, 45};

        Context context = new Context(new BubbleSort());
        context.execute(numb);

        Context context1=new Context(new QuickSort());
        context1.execute(numb);
    }
}