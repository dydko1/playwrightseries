package structuralpatterns.tarinings.adaptermedium;

public class MainPay1 {
    public static void main(String[] args) {
        double amount = 100.0;
        PaymentGateway ing = new IngAdapter(new Ing());
        PaymentGateway pko = new PkoAdapter(new Pko());
        ing.pay(amount);
        pko.pay(amount);

    }
}