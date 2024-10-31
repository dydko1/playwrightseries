package behaviourpatterns.state.a2;

import behaviourpatterns.state.a2.context.VendingMachineContext;
import behaviourpatterns.state.a2.state.OutOfStockState;
import behaviourpatterns.state.a2.state.ReadyState;

public class MainState {
    public static void main(String[] args) {

        VendingMachineContext machineState = new VendingMachineContext();
        machineState.setState(new ReadyState());
        machineState.handleReq();
        machineState.setState(new OutOfStockState());
        machineState.handleReq();
    }
}