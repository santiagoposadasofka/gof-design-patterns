package org.example;
import java.util.Scanner;

import org.example.comprtamiento.EjecuteObserver;
import org.example.comprtamiento.Strategy;
import org.example.comprtamiento.Mediator;



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


            }




        }while (opcion != 0);


    }
}