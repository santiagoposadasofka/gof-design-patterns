package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("----CREACION-----");
        System.out.println("----BUILDER-------");

        Builder cocinar = new Builder();
        cocinar.cocinar();

        System.out.println("----FACTORY-------");

        Factory dibujar = new Factory();
        dibujar.dibujarFigura();

        System.out.println("----SINGLETON-------");


    }
}