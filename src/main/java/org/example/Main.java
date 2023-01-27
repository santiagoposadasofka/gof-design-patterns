package org.example;


import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.Observere;
import org.example.comprtamiento.Strategy;
import org.example.creacion.Factory;
import org.example.creacion.Builder;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;


public class Main {
    public static void main(String[] args) {
        System.out.println("::::::::::::::::::::::::::PATRONES DE DISEÑO::::::::::::::::::::");

        Factory factory = new Factory();
        factory.ejecutar();

        Builder builder = new Builder();
        builder.ejecutar();

        Singleton singleton = new Singleton();
        singleton.ejeccut();

        Adapter adapter = new Adapter();
        adapter.ejecu();

        Decorator decorator = new Decorator();
        decorator.ejecute();

        Proxy proxy = new Proxy();
        proxy.ejecut();

        Mediator mediator = new Mediator();
        mediator.ejecutor();

        Observere observere = new Observere();
        observere.ejecut();

        Strategy strategy = new Strategy();
        strategy.ejecut();

    }

}