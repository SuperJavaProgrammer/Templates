package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class MeteoStation implements Observed {
    private int temperature;
    private int pressure;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObservers() {
        for (Observer o : observers)
            o.handleEvent(temperature, pressure);
    }
    void setNewWeather(int t, int p) {
        temperature = t;
        pressure = p;
        notifyObservers();
    }
}
