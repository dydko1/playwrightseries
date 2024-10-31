package behaviourpatterns.state.a2.state;

import behaviourpatterns.state.a2.state2.VendingMachineState;

public class PaymentPendingState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Payment pending state: Dispensing product.");
    }
}