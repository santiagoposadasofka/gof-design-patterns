package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Patrones de diseño - GOF");

        System.out.println("Patrones de creación");
        //System.out.println("Factory");
        Factory factory = new Factory();
        //factory.ejecutrarFactory();

        //System.out.println("Builder");
        Builder builder = new Builder();
        //builder.ejecutarBuilder();

        System.out.println("Singleton");
        Singleton singleton = new Singleton();
        singleton.ejecutarSingleton();
        /**
        System.out.println("Patrones de estructurales");

        System.out.println("Patrones de comportamiento");
         */
    }
}