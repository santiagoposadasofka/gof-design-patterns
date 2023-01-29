package org.example;

import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.ObserverEjecutar;
import org.example.comprtamiento.Strategy;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============Patrones de diseño de comportamiento===============");
        System.out.println("Observer");
        ObserverEjecutar observador = new ObserverEjecutar();
        observador.ejecutar();

        System.out.println(" ");
        System.out.println("Mediator");
        Mediator.ejecutar();


        System.out.println(" ");
        System.out.println("Strategy");
        Strategy.ejecutar();
        System.out.println(" ");
        System.out.println("===============Patrones de diseño de comportamiento===============");

        System.out.println(" ");
        System.out.println("Builder");
        Builder.ejecutar();


        System.out.println(" ");
        System.out.println("Factory");
        Factory.ejecutar();


        System.out.println(" ");
        System.out.println("Singleton");
        Singleton.ejecutar();

        System.out.println(" ");
        System.out.println("===============Patrones de diseño de estructura===============");
        System.out.println(" ");
        System.out.println("Adapter");
        Adapter.ejecutar();


        System.out.println(" ");
        System.out.println("Decorator");
        Decorator.ejecutar();

        System.out.println(" ");
        System.out.println("Proxy");
        Proxy.ejecuta();
    }
}