package org.example;

import org.example.comprtamiento.Strategy;
import org.example.creacion.Builder;
import org.example.creacion.ComidaBuilder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;

public class Main {
    public static void main(String[] args) {



        System.out.println("Hello world!");
        Builder builder = new Builder();
        builder.ejecutar();
        System.out.println();

        Factory factory = new Factory();
        factory.ejecutarCirculo();
        factory.ejecutarTriangulo();
        factory.ejecutarCuadrado();
        System.out.println();

        Singleton singleton = new Singleton();
        singleton.ejecutar();

        System.out.println();

        Strategy strategy = new Strategy();
        strategy.ejecutarZip();

        System.out.println();


    }
}