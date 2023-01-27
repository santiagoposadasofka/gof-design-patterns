package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Factory factory = new Factory();
        factory.ejecutar();

        Builder builder = new Builder();

    }

}