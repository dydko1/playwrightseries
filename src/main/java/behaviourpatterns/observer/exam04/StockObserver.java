package behaviourpatterns.observer.exam04;

public interface StockObserver {
    void update(String stockSymbol, double stockPrice);
}