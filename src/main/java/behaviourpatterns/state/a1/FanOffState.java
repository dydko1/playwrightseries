package behaviourpatterns.state.a1;

public class FanOffState implements State {

    private final Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handle() {
        System.out.println("Zmiana predkosci na wolna.");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Wentylator wylaczony";
    }
}