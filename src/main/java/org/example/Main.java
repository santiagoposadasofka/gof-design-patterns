package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****Patron Builder*****");
        Builder builder = new Builder();
        builder.ejecutar();

        System.out.println("*****Patron Factory*****");
        Factory factory = new Factory();
        factory.ejecutar();

        System.out.println("*****Patron Singleton*****");
        Singleton single = new Singleton();
        single.ejecutar();

        System.out.println("*****Patron Adapter*****");
        Adapter adapter = new Adapter();
        adapter.ejecutar();

        System.out.println("*****Patron Decorador*****");
        Decorator decorador = new Decorator();
        decorador.ejecutar();

        System.out.println("*****Patron Proxy*****");
        Proxy proxy = new Proxy();
        proxy.ejecutar();
    }
}