package org.example.estructura;

public class Decorator {

    public void ejecutar () {
        Bebida Cocacola = new Cocacola();
        System.out.println("Descripción: " + Cocacola.getDescripcion());
        System.out.println("Costo: $" + Cocacola.costo());

        Bebida cafeConLeche = new Leche(Cocacola);
        System.out.println("Descripción: " + cafeConLeche.getDescripcion());
        System.out.println("Costo: $" + cafeConLeche.costo());
    }

    /**
     * Permite a partir de una base añadir funciones o informacion adicional
     * */
}


abstract class Bebida {
    String descripcion = "Bebida desconocida";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double costo();
}

class Cocacola extends Bebida {
    public Cocacola() {
        descripcion = "Cocacola";
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

