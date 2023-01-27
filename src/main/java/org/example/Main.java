package org.example;

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

        System.out.println("***********   Mediator   ***********");
        System.out.println(" ");
        Mediator mediator = new Mediator();
        mediator.ejecutar();
        System.out.println(" ");

        System.out.println("***********   Strategy   ***********");
        System.out.println(" ");
        Strategy strategy = new Strategy();
        strategy.ejecutar();
        System.out.println(" ");

        System.out.println("***********   Builder   ***********");
        System.out.println(" ");
        Builder builder = new Builder();
        builder.ejecutar();

        System.out.println(" ");
        System.out.println("***********   Factory   ***********");
        System.out.println(" ");
        Factory factory = new Factory();
        factory.ejecutar();

        System.out.println(" ");
        System.out.println("***********   Singleton   ***********");
        System.out.println(" ");
        Singleton singleton = new Singleton();
        singleton.ejecutar();

        System.out.println(" ");
        System.out.println("***********   Adapter   ***********");
        System.out.println(" ");
        Adapter adapter = new Adapter();
        adapter.ejecutar();

        System.out.println(" ");
        System.out.println("***********   Decorator   ***********");
        System.out.println(" ");
        Decorator decorator = new Decorator();
        decorator.ejecutar();

        System.out.println(" ");
        System.out.println("***********   Proxy   ***********");
        System.out.println(" ");
        Proxy proxy = new Proxy();
        proxy.ejecutar();

    }
}