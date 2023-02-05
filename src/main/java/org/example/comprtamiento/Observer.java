package org.example.comprtamiento;


import java.util.ArrayList;
import java.util.List;


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

    @Override
    public String toString() {
        return "Clima{" +
                "observadores= " + observadores +"\n" +
                "Temperatura=" + temp + "\n" +
                "Humedad=" + humedad + "\n" +
                "Presion=" + presion + "\n" +
                '}';
    }

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

    public CondicionesActuales() {


    }

    @Override
    public void update(float temp, float humedad, float presion) {
        this.temp = temp;
        if(temp > 27){
            System.out.println("Se prendierón los aires acondicionados");
        } else {
            System.out.println("Los aires acondicionados se apagaron" );
        }
        this.humedad = humedad;
        this.presion = presion;
        this.display();
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
