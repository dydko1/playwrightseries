package behaviourpatterns.state.a2.state;

import behaviourpatterns.state.a2.state2.VendingMachineState;

public class ReadyState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Ready state: Please select a product.");
    }
}