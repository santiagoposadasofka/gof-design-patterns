package org.example;

import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.Strategy;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("----CREACION-----");
        System.out.println("----BUILDER-------");

        Builder cocinar = new Builder();
        cocinar.cocinar();

        System.out.println("----FACTORY-------");

        Factory dibujar = new Factory();
        dibujar.dibujarFigura();

        System.out.println("----ESTRUCTURAL-------");
        System.out.println("----ADAPTER-------");

        Adapter adapter = new Adapter();
        adapter.ejecutar();

        System.out.println("----ADAPTER-------");

        Decorator decorar = new Decorator();
        decorar.decorar();

        System.out.println("----COMPORTAMIENTO-------");
        System.out.println("----MEDIATOR-------");

        Mediator mediator = new Mediator();
        mediator.ejecutar();


        System.out.println("----STRATEGY-------");

        Strategy estrategia = new Strategy();
        estrategia.ejecutar();


    }
}