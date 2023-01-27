package org.example;

import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.Observador;
import org.example.comprtamiento.Strategy;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

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

        System.out.println("*****Patron Mediator*****");
        Mediator mediator = new Mediator();
        mediator.ejecutar();

        System.out.println("*****Patron Strategy*****");
        Strategy estrategia = new Strategy();
        List<File> archivos = new ArrayList<>();
        archivos.add(new File("file1.pdf"));
        archivos.add(new File("file2.pdf"));
        estrategia.ejecutar(archivos);

        System.out.println("*****Patron Observer*****");
        Observador obser = new Observador();
        obser.ejecutar();

    }
}