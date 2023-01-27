package org.example;

import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
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

                    break;
                case 3:
                    break;
                default:
                    break;
            }
        } while (seleccionar !=4);

    }
}