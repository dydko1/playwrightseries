package behaviourpatterns.state.a2.context;

import behaviourpatterns.state.a2.state2.VendingMachineState;

public class VendingMachineContext {

    private VendingMachineState state;

    public void handleReq() {
        state.handleRequest();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }
}