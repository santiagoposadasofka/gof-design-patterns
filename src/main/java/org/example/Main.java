package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Patrones de Diseño de Creacion ----------------");

        System.out.println("-----------Builder----------------");
        Builder builder = new Builder();
        builder.ejecutar();

        System.out.println("-----------Factory----------------");
        Factory factory = new Factory();
        factory.ejecutar();

        System.out.println("-----------Singleton----------------");
        Singleton singleton = new Singleton();
        singleton.ejecutar();

        System.out.println("-----------Patrones de Diseño de Estructura ----------------");

        System.out.println("-----------Adapter---------------");
        Adapter adapter = new Adapter();
        adapter.ejecutar();
    }
}