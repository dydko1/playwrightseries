package behaviourpatterns.state.a2.state;

import behaviourpatterns.state.a2.state2.VendingMachineState;

public class OutOfStockState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Out of stock state: Product unavailable. Please select another product.");
    }
}