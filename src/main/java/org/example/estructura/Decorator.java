package org.example.estructura;

public class Decorator {

    /**
     * Permite a partir de una base añadir funciones o informacion adicional
     * */
    public static void ejecutar(){
        Cafe cafe = new Cafe();
        Leche leche = new Leche(cafe);
        System.out.println("Bebida: " + leche.getDescripcion());
        System.out.println("Costo: " + leche.costo() + "$");


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
