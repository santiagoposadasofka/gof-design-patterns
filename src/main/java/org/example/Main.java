package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;

import java.lang.module.Configuration;

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
         * El método getInfo() es estático, por esto se debe acceder desde un contexto estático
         */
        Singleton.getInfo();

        System.out.println("---------------------------------------------------------------------------------");

        Adapter adapter = new Adapter();
        adapter.reproducirAudio();

    }
}