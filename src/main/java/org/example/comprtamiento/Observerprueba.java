package org.example.comprtamiento;

public class Observerprueba {
    public void ejecutar(){
        Clima clima = new Clima();
        CondicionesActuales actuales = new CondicionesActuales(35,17,5);
        actuales.update(34,56,30);
        System.out.println(actuales.toString());


    }
}
