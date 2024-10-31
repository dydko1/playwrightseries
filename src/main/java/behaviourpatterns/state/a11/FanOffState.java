package behaviourpatterns.state.a11;

public class FanOffState implements State {

    private final FanContext fan;

    public FanOffState(FanContext fanContext) {
        this.fan = fanContext;
    }

    @Override
    public void handle() {
        System.out.println("Zmiana prędkości na wolną: " + getClass().getSimpleName());
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Wentylator wyłączony";
    }
}