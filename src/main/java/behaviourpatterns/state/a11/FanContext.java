package behaviourpatterns.state.a11;

public class FanContext {
    private State state;
    private State fanOffState;
    private State fanLowState;

    public FanContext() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        state = fanOffState;
    }

    public void request() {
        state.handle();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    @Override
    public String toString() {
        return "FanContext{" +
                "state=" + state +
                '}';
    }
}