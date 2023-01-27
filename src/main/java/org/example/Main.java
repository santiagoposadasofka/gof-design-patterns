package org.example;

import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;


public class Main {
    public static void main(String[] args) {


        Factory factory = new Factory();
        factory.crearFigura("circulo");
        factory.crearFigura("TrIaNgulo");
        factory.crearFigura("CUADRADO");


        Singleton singleton = new Singleton();
        singleton.ingresarValores();


        Adapter adapter = new Adapter();
        adapter.archivoSonido();



    }
}