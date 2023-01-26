package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        //factory.ejecutarFiguraGeometricaFactory();

        Builder builder = new Builder();
        //builder.ejecutarBuilder();

        Singleton singleton = new Singleton();
        singleton.ejecutarSingleton();
    }
}