package behaviourpatterns.state.a11;

public class FanLowState implements State {

    private final FanContext fanContext;

    public FanLowState(FanContext fanContext) {
        this.fanContext = fanContext;
    }

    @Override
    public void handle() {
        System.out.println("Wyłączenie wentylatora: " + getClass().getSimpleName());
        fanContext.setState(fanContext.getFanOffState());
    }

    @Override
    public String toString() {
        return "Niska prędkość wentylatora";
    }
}