package org.example;

import org.example.comprtamiento.ClimaHacer;
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
        //Mediator mediator =new Mediator();
        //mediator.Ejecutar();

        ClimaHacer clima = new ClimaHacer();
        clima.Ejecutar();

        //Strategy strategy = new Strategy();
        //strategy.Ejecutar();

        //Singleton singleton = new Singleton();
        //singleton.Ejecutar();

        //Factory factory =new Factory();
        //factory.Ejecutar();

        //Adapter adapter = new Adapter();
        //adapter.Ejecutar();

        //Proxy proxy =new Proxy();
        //proxy.Ejecutar();

        //Decorator decorator = new Decorator();
        //decorator.Ejecutar();
    }
}