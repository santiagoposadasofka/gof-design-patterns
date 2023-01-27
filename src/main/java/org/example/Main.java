package org.example;

import org.example.comprtamiento.Mediator;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /***
         * Paquetes Estructura
         */

        Adapter adapter = new Adapter();
        adapter.ejecutar();


        Proxy proxy = new Proxy();
        proxy.ejecutar();

        Decorator decorator = new Decorator();
        decorator.ejecutar();


        /***
         * El paquete creacion
         */

        Builder builder = new Builder();
        builder.ejecutar();

        Factory factory = new Factory();
        factory.ejecutar();


        Mediator mediator = new Mediator();
        mediator.ejecutar();

    }


}