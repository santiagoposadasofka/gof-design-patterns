package org.example;

import org.example.comprtamiento.mediator.Mediator;
import org.example.comprtamiento.Strategy;
import org.example.comprtamiento.observer.Observer;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.decorator.Decorator;
import org.example.estructura.patronAdapter.Adapter;
import org.example.estructura.proxy.Proxy;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!\n");
        System.out.println("------------------------------------------------------");
        System.out.println("   ** Patrones de diseño Comportamiento *** ");
        System.out.println("------------------------------------------------------\n");
        System.out.println("Patron de diseño Mediator\n");
        Mediator.ejecutar();
        System.out.println();

        System.out.println("Patron de diseño Observer\n");
        Observer.ejecutar();
        System.out.println();

        System.out.println("Patron de diseño Strategy\n");
        Strategy strategy = new Strategy();
        strategy.ejecutarZip();

        System.out.println("------------------------------------------------------");
        System.out.println("  ** Patrones de diseño Creacion ***");
        System.out.println("------------------------------------------------------");

        System.out.println("Patron de diseño Builder\n");
        Builder builder = new Builder();
        builder.ejecutar();
        System.out.println();

        System.out.println("Patron de diseño Factory\n");
        Factory factory = new Factory();
        factory.ejecutarCirculo();
        factory.ejecutarTriangulo();
        factory.ejecutarCuadrado();

        System.out.println();
        System.out.println("Patron de diseño Singleton\n");
        Singleton singleton = new Singleton();
        singleton.ejecutar();

        System.out.println("------------------------------------------------------");
        System.out.println("  ** Patrones de diseño Estructura ***\n");
        System.out.println("------------------------------------------------------");

        System.out.println("Patron de diseño Decorator\n");
        Decorator decorator = new Decorator();
        decorator.ejecutarCafe();
        decorator.ejecutarLeche();

        System.out.println();
        System.out.println("Patron de diseño Adapter\n");
        Adapter adapter = new Adapter();
        adapter.ejecutarMp3();
        adapter.ejecutarWav();

        System.out.println();
        System.out.println("Patron de diseño Proxy\n");
        Proxy proxy = new Proxy();
        proxy.ejecutarImagenProxy();
        proxy.ejecutarImagenReal();



    }
}