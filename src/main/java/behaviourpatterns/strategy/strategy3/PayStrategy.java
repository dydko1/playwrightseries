package behaviourpatterns.strategy.strategy3;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}