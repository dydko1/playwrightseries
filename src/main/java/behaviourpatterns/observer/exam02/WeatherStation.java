package behaviourpatterns.observer.exam02;

import behaviourpatterns.observer.exam01.top.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Observer1> observer1s = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer1 observer1) {
        observer1s.add(observer1);
    }

    public void removeObserver(Observer1 observer1) {
        observer1s.remove(observer1);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer1 observer1 : observer1s) {
            observer1.update(temperature);
        }
    }
}