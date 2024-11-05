package behaviourpatterns.observer.exam04;

public interface StockMarket {

    void registerObserver(StockObserver observer);

    void removeObserver(StockObserver observer);

    void notifyObservers(String stockSymbol, double stockPrice);
}