package org.example.comprtamiento.observer;


public class Observer {
    public void ejecutarCondicionActual() {
        CondicionesActuales condicioActual = new CondicionesActuales();
        condicioActual.setTemp(5).setHumedad(67).setPresion(10);
        System.out.println(condicioActual.toString());
    }

}
