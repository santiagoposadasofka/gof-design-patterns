package org.example.estructura.decorator;

public class Decorator {

    /**
     * Permite a partir de una base añadir funciones o informacion adicional
     * */

    public void ejecutarCafe() {
        Cafe cafe = new Cafe();
        String descripcion = cafe.descripcion;
        System.out.println("Su bebida: " + descripcion +" tiene un costo de: " + cafe.costo());
    }
    public void ejecutarLeche() {
       Leche leche = new Leche();

        System.out.println("Su bebida  " + leche.bebida);
    }
}


