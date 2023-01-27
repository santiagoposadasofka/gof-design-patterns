package org.example;

import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.Strategy;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;


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


        Builder builder = new Builder();
        builder.crearSandwich();

        Decorator decorator = new Decorator();
        decorator.crearBebida();

        Proxy proxy = new Proxy();
        proxy.mostrarImagen();

        Mediator mediator = new Mediator();
        mediator.inciarChat();

        Strategy strategy = new Strategy();
        strategy.comprimirArchivo();

    }
}