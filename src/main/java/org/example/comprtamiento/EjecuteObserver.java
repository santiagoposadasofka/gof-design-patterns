package org.example.comprtamiento;


import java.util.ArrayList;
import java.util.List;


/**
 * Permite notificar a todos los interesados sobre un cambio.
 * El patrón consiste
 * en tres elementos: el sujeto, el observador y el objeto de notificación. El sujeto mantiene
 * una lista de observadores registrados y notifica a estos observadores cuando ocurre un cambio en su estado.
 * Los observadores se registran y se desregistran en el sujeto, y tienen una interfaz común para recibir
 * notificaciones. El objeto de notificación es el mensaje enviado por el sujeto a los observadores para
 * informarles del cambio. Este patrón es útil en sistemas en los que varios componentes deben ser notificados
 * automáticamente de los cambios en otro componente, permitiendo una mayor escalabilidad y flexibilidad en la
 * arquitectura del sistema.
 * */
public class EjecuteObserver{
    public void ejecutar(){
        //Ejemplo de notificacion de cambio de clima a traves de un observador
        Clima clima = new Clima();
        CondicionesActuales actuales = new CondicionesActuales(30,10,2);
        actuales.update(31,12,1);
        System.out.println(actuales.toString());
    }
}
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
