package org.example.estructura;

public class Decorator {

    /**
     * Permite a partir de una base añadir funciones o informacion adicional
     * */

    public void Ejecutar(){

        Bebida cafe = new Cafe();
        System.out.println("Descripción: " + cafe.getDescripcion());
        System.out.println("Costo: $" + cafe.costo());

        Bebida cafeConLeche = new Leche(cafe);
        System.out.println("Descripción: " + cafeConLeche.getDescripcion());
        System.out.println("Costo: $" + cafeConLeche.costo());

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
