package behaviourpatterns.observer.exam02;

public class StatisticsDisplay implements Observer1 {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    private void display() {
        System.out.println("Statistics Display:Temperature = "
                + temperature);
    }
}