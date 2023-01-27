package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;

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
    }
}