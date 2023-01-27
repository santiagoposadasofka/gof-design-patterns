package org.example;
import java.util.Scanner;

import org.example.comprtamiento.EjecuteObserver;
import org.example.comprtamiento.Strategy;
import org.example.comprtamiento.Mediator;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.creacion.Builder;



public class Main {
    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingrese la opcion que desee");
            opcion = info.nextInt();
            switch (opcion){

                case 1:
                    System.out.println("    Patron MEDIATOR  ");
                    Mediator mediator = new Mediator();
                    mediator.ejecutar();
                    break;

                case 2:
                    System.out.println("    Patron OBSERVER  ");
                    EjecuteObserver ejecuteObserver = new EjecuteObserver();
                    ejecuteObserver.ejecutar();
                    break;

                case 3:
                    System.out.println("    Patron STRATEGY  ");
                    Strategy strategy= new Strategy();
                    strategy.ejecutar();
                    break;

                case 4:
                    System.out.println("    Patron FACTORY  ");
                    Factory factory = new Factory();
                    factory.ejecutar();
                    break;

                case 5:
                    System.out.println("    Patron SINGLETON  ");
                    Singleton singleton = new Singleton();
                    singleton.ejecutar();
                    break;
                case 6:
                    System.out.println("    Patron BUILDER  ");
                    Builder builder = new Builder();
                    builder.ejecutar();
                    break;






            }




        }while (opcion != 0);


    }
}