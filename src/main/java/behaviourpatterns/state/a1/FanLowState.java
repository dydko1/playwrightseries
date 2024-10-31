package behaviourpatterns.state.a1;

public class FanLowState implements State {

    private final Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handle() {
        System.out.println("Wylaczenie wentylatora");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Niska predkosc wentylatora";
    }
}