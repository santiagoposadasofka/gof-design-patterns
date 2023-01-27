package org.example;

import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.ObserverPatron;
import org.example.comprtamiento.Strategy;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;

public class Main {
    public static void main(String[] args) {
        //Patrones de diseño de creación

        Factory factory = new Factory();
        //factory.ejecutarFiguraGeometricaFactory();

        Builder builder = new Builder();
        //builder.ejecutarBuilder();

        Singleton singleton = new Singleton();
        //singleton.ejecutarSingleton();

        //Patrones de diseño estructurales

        Adapter adapter = new Adapter();
        //adapter.ejecutarAdapter();

        Decorator decorator = new Decorator();
        //decorator.ejecutarDecorator();

        Proxy proxy = new Proxy();
        //proxy.ejecutarProxy();

        //Patrones de diseño de comportamiento

        Mediator mediator = new Mediator();
        //mediator.ejecutarMediator();

        ObserverPatron observerPatron = new ObserverPatron();
        //observerPatron.ejecutarObserver();

        Strategy strategy = new Strategy();
        strategy.ejecutarStrategy();
    }
}