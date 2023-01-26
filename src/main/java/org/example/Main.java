package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;

public class Main {
    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.prepararSanduche();

        System.out.println("------------------------------------------------------------------------");

        Factory factory = new Factory();
        factory.crearFigura();



    }
}