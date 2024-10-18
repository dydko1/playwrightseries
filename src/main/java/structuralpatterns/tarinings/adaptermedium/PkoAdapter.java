package structuralpatterns.tarinings.adaptermedium;

public class PkoAdapter implements PaymentGateway {
    private final Pko pko;

    public PkoAdapter(Pko pko) {
        this.pko = pko;
    }

    @Override
    public void pay(double amount) {
        pko.makePayment(amount);
    }
}