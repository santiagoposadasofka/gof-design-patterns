package org.example.comprtamiento.observer;

import java.util.ArrayList;
import java.util.List;

class Clima implements Subject {
    private List<IObserver> observadores;
    private float temp;
    private float humedad;
    private float presion;

    public Clima() {
        observadores = new ArrayList<>();
    }

    public void registerObserver(IObserver o) {
        observadores.add(o);
    }

    public void removeObserver(IObserver o) {
        int i = observadores.indexOf(o);
        if (i >= 0) {
            observadores.remove(i);
        }
    }

    public void notifyObservers() {
        for (IObserver observer : observadores) {
            observer.update(temp, humedad, presion);
        }
    }

    public void setMedidas(float temp, float humedad, float presion) {
        this.temp = temp;
        this.humedad = humedad;
        this.presion = presion;
        medidasChanged();
    }

    public void medidasChanged() {
        notifyObservers();
    }
}
