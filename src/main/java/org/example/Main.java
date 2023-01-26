package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Patron builder---------");
        Builder builder = new Builder();
        builder.ejecutar();
        System.out.println("------Patron factory---------");
        Factory factory = new Factory();
        factory.ejecutar();
        System.out.println("-----------------------------");

    }
}