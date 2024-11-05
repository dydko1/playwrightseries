package behaviourpatterns.observer.exam02;

public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        StatisticsDisplay statisticsDisplay1 = new StatisticsDisplay();

        weatherStation.addObserver(currentConditionsDisplay);
        weatherStation.addObserver(statisticsDisplay);
        weatherStation.addObserver(statisticsDisplay1);

        System.out.println("--------------");
        weatherStation.setTemperature(25.5f);
        System.out.println("--------------");
        weatherStation.setTemperature(30.0f);
        System.out.println("--------------");
        weatherStation.removeObserver(currentConditionsDisplay);
        weatherStation.setTemperature(28.0f);
    }
}