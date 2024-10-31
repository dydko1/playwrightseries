package behaviourpatterns.state.a11;

public class StateTest {
    public static void main(String[] args) {
        FanContext fan = new FanContext();
        System.out.println(fan);
        fan.request();
        System.out.println(fan);
        fan.request();
        System.out.println(fan);
        fan.request();
        System.out.println(fan);
    }
}