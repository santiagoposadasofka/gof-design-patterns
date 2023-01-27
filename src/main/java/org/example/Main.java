package org.example;

import org.example.comprtamiento.Mediator;

import org.example.comprtamiento.Observerprueba;
import org.example.comprtamiento.Strategy;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int seleccionar;

        do {
            System.out.println("\nEliga una opcion: \n 1.Creacion \n 2.Estructural \n 3.Comportamiento");
            seleccionar = entrada.nextInt();
            entrada.nextLine();
            switch (seleccionar){
                case 1:
                    System.out.println("    Singleton");
                    Singleton singleton = new Singleton();
                    singleton.ejecutar();
                    System.out.println("     Factory");
                    Factory factory = new Factory();
                    factory.ejecutar();
                    System.out.println("     Builder");
                    Builder builder = new Builder();
                    builder.ejecutar();
                    break;
                case 2:
                    System.out.println("    Proxy");
                    Proxy proxy = new Proxy();
                    proxy.ejecutar();
                    System.out.println("    Decorator");
                    Decorator decorator= new Decorator();
                    decorator.ejecutar();
                    System.out.println("    Adapter");
                    Adapter adapter= new Adapter();
                    adapter.ejecutar();
                    break;
                case 3:
                    System.out.println("    Mediator");
                    Mediator mediator = new Mediator();
                    mediator.ejecutar();
                    System.out.println("    Observer");
                    Observerprueba observerprueba = new Observerprueba();
                    observerprueba.ejecutar();
                    System.out.println("    Strategy");
                    Strategy strategy= new Strategy();
                    strategy.ejecutar();
                    break;
                default:
                    break;
            }
        } while (seleccionar !=4);

    }
}