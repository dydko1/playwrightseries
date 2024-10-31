package behaviourpatterns.state.a1;

public class StateTest {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan);
        fan.request();
        System.out.println(fan);
        fan.request();
        System.out.println(fan);
        fan.request();
        System.out.println(fan);
    }
}