package observer;

import observer.observer.impl.CurrentConditionDisplay;
import observer.subject.impl.WeatherData;
import org.junit.Test;

public class WeatherStation {
    @Test
    public void test1(){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,20.2f);
    }
}
