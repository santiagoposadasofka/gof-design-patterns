package org.example.comprtamiento;

import java.util.ArrayList;
import java.util.List;

// Permite notificar a todos los interesados sobre un cambio.

public class ObserverDoer {
    public void ejecutar() {
        // Se utilizan los elementos prediseñados para aplicar el patrón
        CondicionesActuales sensor1 = new CondicionesActuales(20, 60, 1);
        CondicionesActuales sensor2 = new CondicionesActuales(18, 62, 0.98);
        Clima clima = new Clima();
        clima.registerObserver(sensor1);
        clima.registerObserver(sensor2);
        sensor1.display();
        sensor2.display();
        clima.setMedidas(21, 55, 0.95);
        clima.removeObserver(sensor2);
        sensor1.display();
    }
}

interface Observer {
    void update(double temp, double humedad, double presion);

}

interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}

interface DisplayElement {
    void display();
}

class Clima implements Subject {
    private final List<Observer> observadores;
    private double temp;
    private double humedad;
    private double presion;

    public Clima() {
        observadores = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observadores.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observadores.indexOf(o);
        if (i >= 0) {
            observadores.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observadores) {
            observer.update(temp, humedad, presion);
        }
    }

    public void setMedidas(double temp, double humedad, double presion) {
        this.temp = temp;
        this.humedad = humedad;
        this.presion = presion;
        medidasChanged();
    }

    public void medidasChanged() {
        notifyObservers();
    }
}

class CondicionesActuales implements Observer, DisplayElement {
    private double temp;
    private double humedad;
    private double presion;

    public CondicionesActuales(double temp, double humedad, double presion) {
        this.temp = temp;
        this.humedad = humedad;
        this.presion = presion;
    }

    @Override
    public void update(double temp, double humedad, double presion) {
        this.temp = temp;
        this.humedad = humedad;
        this.presion = presion;
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "CondicionesActuales{" +
                "temp=" + temp +
                ", humedad=" + humedad +
                ", presion=" + presion +
                '}';
    }
}
