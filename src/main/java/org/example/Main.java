package org.example;

import org.example.comprtamiento.Ejecutar;
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
        Proxy.ejecutar();
        System.out.println("\n");
        Decorator.ejecutar();
        System.out.println("\n");
        Adapter.ejecutar();
        System.out.println("\n");
        Singleton.ejecutar();
        System.out.println("\n");
        Factory.ejecutar();
        System.out.println("\n");
        Builder.ejecutar();
        System.out.println("\n");
        Strategy.ejecutar();
        System.out.println("\n");
        Ejecutar.ejecutar();
        System.out.println("\n");
        Mediator.ejecutar();
    }
}