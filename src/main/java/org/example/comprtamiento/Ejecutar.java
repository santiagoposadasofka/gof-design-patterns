package org.example.comprtamiento;

/**
 * Permite notificar a todos los interesados sobre un cambio.
 */
public class Ejecutar {
    public static void ejecutar() {
        Clima clima=new Clima();
        clima.registerObserver(new CondicionesActuales(13,10,11));
        clima.notifyObservers();
        clima.medidasChanged();
    }
}
