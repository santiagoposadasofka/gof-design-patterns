package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Patron builder---------");
        Builder builder = new Builder();
        builder.ejecutar();
        System.out.println("------Patron factory---------");
        Factory factory = new Factory();
        factory.ejecutar();
        System.out.println("------Patron Singleton-------");
        Singleton singleton = new Singleton();
        singleton.ejecutar();
        System.out.println("------------------------------");

    }
}