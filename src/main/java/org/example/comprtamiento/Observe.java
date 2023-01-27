package org.example.comprtamiento;


import java.util.ArrayList;
import java.util.List;

public class Observe{
    public void ejecutarObserver(){
        CondicionesActuales condicionesActuales1=new CondicionesActuales(1,2,3);
        CondicionesActuales condicionesActuales2=new CondicionesActuales(4,5,6);
        Clima clima=new Clima();
        clima.registerObserver(condicionesActuales1);
        clima.registerObserver(condicionesActuales2);
        condicionesActuales1.update(7,8,9);
        System.out.println(condicionesActuales1.toString());
    }

}
/**
 * Permite notificar a todos los interesados sobre un cambio.
 * */
interface Observer {
    void update(float temp, float humedad, float presion);
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
    private List<Observer> observadores;
    private float temp;
    private float humedad;
    private float presion;

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

class CondicionesActuales implements Observer, DisplayElement {
    private float temp;
    private float humedad;
    private float presion;

    public CondicionesActuales(float temp, float humedad, float presion) {
        this.temp = temp;
        this.humedad = humedad;
        this.presion = presion;
    }

    @Override
    public void update(float temp, float humedad, float presion) {
        this.temp = temp;
        this.humedad = humedad;
        this.presion = presion;
    }

    @Override
    public void display() {
        this.toString();
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
