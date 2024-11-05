package behaviourpatterns.observer.exam04;

public class MainStock {
    public static void main(String[] args) {

        StockMarketImpl stockMarket = new StockMarketImpl();

        Investor investor1 = new Investor("Dydko");
        Investor investor2 = new Investor("Janek");

        stockMarket.registerObserver(investor1);
        stockMarket.registerObserver(investor2);

        stockMarket.setStockPrice("INFY", 1250.0); // Both investors receive updates
        stockMarket.setStockPrice("TCS", 2500.0);

        stockMarket.removeObserver(investor1);
        stockMarket.setStockPrice("WIPRO", 700.0); // Only investor
    }
}