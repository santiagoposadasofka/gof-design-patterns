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
        System.out.println("----------------------------");
        System.out.println("--Patrones de tipo creacion-");
        System.out.println("-----Patron builder---------");
        Builder builder = new Builder();
        builder.ejecutar();
        System.out.println("------Patron factory---------");
        Factory factory = new Factory();
        factory.ejecutar();
        System.out.println("------Patron Singleton-------");
        Singleton singleton = new Singleton();
        singleton.ejecutar();
        System.out.println("-----------------------------");
        System.out.println("-Patrones de tipo Estructura-");
        System.out.println("------Patron Adapter---------");
        Adapter.ejecutar("archivo.wav");
        System.out.println("------Patron Decorador-------");
        Decorator decorator = new Decorator();
        decorator.ejecutar();
        System.out.println("--------Patron proxi---------");
        Proxy proxy = new Proxy();
        proxy.ejecutar("desktop");
        System.out.println("-----Patrones de tipo Comportamiento--------");
        System.out.println("-------Patron mediador-------");
        Mediator.ejecutar();
        System.out.println("-------Patron Observador-------");
        Observador observador = new Observador();
        observador.ejecutar();
        System.out.println("------Patron Estrategico----------");
        Strategy strategy = new Strategy();
        List<File> files = new ArrayList<>();
        files.add(new File("archivo1.txt"));
        files.add(new File("archivo2.txt"));
        strategy.ejecutar(files);

    }

}