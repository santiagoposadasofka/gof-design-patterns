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

import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /***
         * Paquetes Estructura
         */
        System.out.println("<----------------Ejemplo de los Patron Estruturales---------------->");

        System.out.println("<----------------Patron Estruturales---------------->");

        Adapter adapter = new Adapter();
        adapter.ejecutar();

        Proxy proxy = new Proxy();
        proxy.ejecutar();

        Decorator decorator = new Decorator();
        decorator.ejecutar();

        /***
         * El paquete creacion
         */
        System.out.println("<----------------Patron Creacion---------------->");

        Builder builder = new Builder();
        builder.ejecutar();

        Factory factory = new Factory();
        factory.ejecutar();

        Singleton singleton = new Singleton();
        singleton.ejecutar();

        /***
         * El paquete creacion
         */
        System.out.println("<----------------Patron Comportamiento---------------->");

        Mediator mediator = new Mediator();
        mediator.ejecutar();

        Strategy strategy = new Strategy();
        strategy.ejecutar();

        ObserverEjecutar observerEjecutar = new ObserverEjecutar();
        observerEjecutar.ejecutar();

    }


}