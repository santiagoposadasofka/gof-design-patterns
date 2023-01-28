package org.example;

import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.ObserverEjecutar;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============Patrones de diseño de comportamiento===============");
        System.out.println("Observer");
        ObserverEjecutar observador = new ObserverEjecutar();
        observador.ejecutar();

        System.out.println(" ");
        System.out.println("Mediator");
        Mediator.ejecutar();
    }
}