package behaviourpatterns.observer.exam02;

public class CurrentConditionsDisplay implements Observer1 {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    private void display() {
        System.out.println("Current Conditions Display: Temperature = " + temperature);
    }
}