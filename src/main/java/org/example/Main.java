package org.example;

import org.example.comprtamiento.EjecuteObserver;
import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.Strategy;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------Mediator-----------------------");
        Mediator mediador = new Mediator();
        mediador.ejecutar();

        System.out.println("\n");

        System.out.println("---------------Observer-----------------------");
        EjecuteObserver ejecuter = new EjecuteObserver();
        ejecuter.ejecutar();

        System.out.println("\n");

        System.out.println("---------------Strategy-----------------------");
        Strategy strategy = new Strategy();
        strategy.ejecutar();

        System.out.println("\n");

        System.out.println("---------------Builder-----------------------");

        Builder builder = new Builder();
        builder.ejecutar();

        System.out.println("\n");

        System.out.println("---------------Factory-----------------------");

        Factory factory = new Factory();
        factory.ejecutar();

        System.out.println("\n");

        System.out.println("---------------Singleton-----------------------");
        Singleton singleton = new Singleton();
        singleton.ejecutar();

        System.out.println("\n");

        System.out.println("---------------Adapter-----------------------");
        Adapter adapter= new Adapter();
        adapter.ejecutar();

        System.out.println("\n");

        System.out.println("---------------Decorator-----------------------");
        Decorator decorator = new Decorator();
        decorator.ejecutar();

        System.out.println("\n");

        System.out.println("---------------Proxy-----------------------");
        Proxy proxy = new Proxy();
        proxy.ejecutar();




    }
}