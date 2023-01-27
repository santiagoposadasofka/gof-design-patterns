package org.example;

import org.example.comprtamiento.Strategy;
import org.example.creacion.Builder;
import org.example.creacion.ComidaBuilder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.decorator.Decorator;
import org.example.estructura.patronAdapter.Adapter;
import org.example.estructura.proxy.Proxy;

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

        Decorator decorator = new Decorator();
        decorator.ejecutarCafe();
        decorator.ejecutarLeche();

        System.out.println();

        Adapter adapter = new Adapter();
        adapter.ejecutarMp3();
        adapter.ejecutarWav();

        System.out.println("Patron de diseño Proxy");
        Proxy proxy = new Proxy();
        proxy.ejecutarImagenProxy();
        proxy.ejecutarImagenReal();

        System.out.println();

    }
}