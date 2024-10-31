package behaviourpatterns.state.a1;

public class Fan {

    private State fanOffState;
    private State fanLowState;
    private State state;

    public Fan() {
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
        return "Stan: " + state.toString();
    }
}