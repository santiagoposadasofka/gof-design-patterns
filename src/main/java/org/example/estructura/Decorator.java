package org.example.estructura;

public class Decorator {

    /**
     * Permite a partir de una base añadir funciones o informacion adicional
     * */

    public void ejecutar(){

        Cafe cafe = new Cafe();
        Chocolate chocolate = new Chocolate();
        Leche leche = new Leche(cafe);
        Leche leche1 = new Leche(chocolate);

        System.out.println("Esta es su bebida: " + cafe.getDescripcion() +"\n Tiene un costo de: "+ cafe.costo()
                            + "\n Si desea Leche tiene un costo de: " + leche.costo());

        System.out.println("----------------------------------------");

        System.out.println("Esta es su bebida: " + chocolate.getDescripcion() +"\n Tiene un costo de: "+ chocolate.costo()
                + "\n Si desea Leche tiene un costo de: " + leche1.costo());

    }
}


abstract class Bebida {
    String descripcion = "Bebida desconocida";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double costo();
}

class Cafe extends Bebida {
    public Cafe() {
        descripcion = "Café";
    }

    public double costo() {
        return 1.99;
    }
}

class Chocolate extends Bebida {
    public Chocolate() {
        descripcion = "Chocolate";
    }

    public double costo() {
        return 2.0;
    }
}

abstract class Adicional extends Bebida {
    public abstract String getDescripcion();
}

class Leche extends Adicional {
    Bebida bebida;

    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    public double costo() {
        return 0.10 + bebida.costo();
    }
}
