package observer.jdk_observer.observer;

import observer.element.DisplayElement;
import observer.jdk_observer.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer,DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Condition: "+temperature+"F degress and "+humidity+"% humidity");
    }
}
