package org.example.comprtamiento;

/**
 * Permite notificar a todos los interesados sobre un cambio.
 */

public class NotifyUpdate {

    /**
     * La clase NotifyUpdate se crea para instanciar CondicionesActuales, registrar Observer,
     * agregar nuevas condiciones climaticas para luego notificar a los observers registrados.
     */

    public void notifyObserver() {
        Observer observer1 = new CondicionesActuales(25, 10, 1000);
        Observer observer2 = new CondicionesActuales(25, 10, 1000);
        Clima clima = new Clima();
        clima.registerObserver(observer1);
        clima.registerObserver(observer2);
        System.out.println(observer1.toString());
        clima.setMedidas(28, 15, 900);
        clima.medidasChanged();
        System.out.println("Las condiciones para el observer1, luego de ser actualizadas son: " + observer1.toString());
        System.out.println("Las condiciones para el observer2, luego de ser actualizadas son: " + observer2.toString());
    }
}
