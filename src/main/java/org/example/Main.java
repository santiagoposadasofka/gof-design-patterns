package org.example;

import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.Strategy;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;

public class Main {
    public static void main(String[] args) {
        /**
         * Instancia de elejemplos patrones de comportamiento
         *
         * La instancia del  patron observer estas en el main dentro del archivo Observer.java
         */
        Mediator mediator = new Mediator();
        mediator.ejecutar();

        Strategy strategy = new Strategy();
        strategy.ejecutar();

        /**
         * Instancia de ejemplos patrones de creacion
         */

        Builder builder = new Builder();
        builder.ejecutar();

        Factory factory = new Factory();
        factory.ejecutar();

        Singleton singleton = new Singleton();
        singleton.ejecutar();

        /**
         * Instancia ejemplos patrones de estructura
         */

        Adapter adapter = new Adapter();
        adapter.ejecutar();





    }
}