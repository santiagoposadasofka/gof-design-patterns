package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Patrones de Diseño de Creacion ----------------");

        System.out.println("-----------Builder----------------");
        Builder builder = new Builder();
        builder.ejecutar();

        System.out.println("-----------Factory----------------");
        Factory factory = new Factory();
        factory.ejecutar();
    }
}