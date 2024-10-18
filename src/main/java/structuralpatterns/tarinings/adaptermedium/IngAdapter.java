package structuralpatterns.tarinings.adaptermedium;

public class IngAdapter implements PaymentGateway{
    private final Ing ing;

    public IngAdapter(Ing ing) {
        this.ing = ing;
    }

    @Override
    public void pay(double amount) {
     ing.change(amount);
    }
}