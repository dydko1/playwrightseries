package behaviourpatterns.strategy.strategy2;

public class BubbleSort implements Strategy1{
    @Override
    public void sort(int[] array) {
        System.out.println("Sortowanie bąbelkowe");
    }
}