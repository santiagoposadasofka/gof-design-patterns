package org.example;

import org.example.comprtamiento.ClimaEjecutar;
import org.example.comprtamiento.Mediator;
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

// patrones de comportamiento
        Mediator mediator = new Mediator();
        mediator.ejecutar();

        ClimaEjecutar clima = new ClimaEjecutar();
        clima.ejecutar();

        /*Observer observer = new Observer();
         *observer.ejecutar();
         */
        Strategy strategy = new Strategy();
        strategy.ejecutar();
// patrones de creación
        Builder builder = new Builder();
        builder.ejecutar();

        Factory factory = new Factory();
        factory.ejecutar();

        Singleton singleton = new Singleton();
        singleton.ejecutar();
// patrones de estructura
        Adapter adapter = new Adapter();
        adapter.ejecutar();

        Decorator decorator = new Decorator();
        decorator.ejecutar();

        Proxy proxy = new Proxy();
        proxy.ejecutar();

    }


}

