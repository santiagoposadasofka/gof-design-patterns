package org.example;

import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.ObserverDoer;
import org.example.comprtamiento.Strategy;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejecutando ejemplos del patrón de Comportamiento.");
        // Se ejecutan los ejemplos de uso de este patrón
        Mediator mediator = new Mediator();
        mediator.ejecutar();
        System.out.println("\n< - - - >");

        // Se ejecutan los ejemplos de uso de este patrón
        ObserverDoer observer = new ObserverDoer();
        observer.ejecutar();
        System.out.println("\n< - - - >");

        // Se ejecutan los ejemplos de uso de este patrón
        Strategy strategy = new Strategy();
        strategy.ejecutar();
        System.out.println("\n< - - - >");

        System.out.println("Ejecutando ejemplos del patrón de Creación.");
        // Se ejecutan los ejemplos de uso de este patrón
        Builder builder = new Builder();
        builder.ejecutar();
        System.out.println("\n< - - - >");

        // Se ejecutan los ejemplos de uso de este patrón
        Factory factory = new Factory();
        factory.ejecutar();
        System.out.println("\n< - - - >");

        // Se ejecutan los ejemplos de uso de este patrón
        Singleton singleton = new Singleton();
        singleton.ejecutar();
        System.out.println("\n< - - - >");

        System.out.println("Ejecutando ejemplos del patrón de Estructura.");
        // Se ejecutan los ejemplos de uso de este patrón
        Adapter adapter = new Adapter();
        adapter.ejecutar();
        System.out.println("\n< - - - >");

        // Se ejecutan los ejemplos de uso de este patrón
        Decorator decorator = new Decorator();
        decorator.ejecutar();
        System.out.println("\n< - - - >");

        // Se ejecutan los ejemplos de uso de este patrón
        Proxy proxy = new Proxy();
        proxy.ejecutar();
    }
}