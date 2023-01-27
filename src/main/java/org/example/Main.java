package org.example;

import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.ObserverEjecutar;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------Patrones de Diseño de Creacion -----------");

        System.out.println("-----------Builder----------------");
        Builder builder = new Builder();
        builder.ejecutar();

        System.out.println("-----------Factory----------------");
        Factory factory = new Factory();
        factory.ejecutar();

        System.out.println("-----------Singleton----------------");
        Singleton singleton = new Singleton();
        singleton.ejecutar();
        System.out.println("\n");

        System.out.println("-------Patrones de Diseño de Estructura -----------");

        System.out.println("-----------Adapter---------------");
        Adapter adapter = new Adapter();
        adapter.ejecutar();

        System.out.println("-----------Decorator---------------");
        Decorator decorator = new Decorator();
        decorator.ejecutar();

        System.out.println("-----------Proxy---------------");
        Proxy proxy = new Proxy();
        proxy.ejecutar();
        System.out.println("\n");

        System.out.println("-------Patrones de Diseño de Comportamiento -----------");

        System.out.println("-----------Mediator---------------");
        Mediator mediator = new Mediator();
        mediator.ejecutar();

        System.out.println("-----------Observer---------------");
        ObserverEjecutar observerEjecutar = new ObserverEjecutar();
        observerEjecutar.ejecutar();
    }
}