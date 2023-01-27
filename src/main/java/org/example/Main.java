package org.example;

import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.NotifyUpdate;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;

import java.lang.module.Configuration;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.prepararSanduche();

        System.out.println("------------------------------------------------------------------------");

        Factory factory = new Factory();
        factory.crearFigura();

        System.out.println("--------------------------------------------------------------------------");

        /**
         * En este caso, no se crea una instancia de la clase Singleton para acceder al método getInfo.
         * El método getInfo() es estático, por esto se debe acceder desde un contexto estático.
         */
        Singleton.getInfo();

        System.out.println("---------------------------------------------------------------------------------");

        Adapter adapter = new Adapter();
        adapter.reproducirAudio();

        System.out.println("-------------------------------------------------------------------------------------");

        Decorator decorator = new Decorator();
        decorator.prepararBebida();

        System.out.println("---------------------------------------------------------------------------------------");

        Proxy proxy = new Proxy();
        proxy.mostrarImagen();

        System.out.println("------------------------------------------------------------------------------------");

        Mediator mediator = new Mediator();
        mediator.enviar();

        System.out.println("--------------------------------------------------------------------------------------");

        NotifyUpdate notifyUpdate = new NotifyUpdate();
        notifyUpdate.notifyObserver();

    }
}