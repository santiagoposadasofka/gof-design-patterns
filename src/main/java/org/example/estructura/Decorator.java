package org.example.estructura;

// Permite añadir funciones o información adicional a partir de una base.

public class Decorator {
    public void ejecutar() {
        // Se utilizan los elementos prediseñados para aplicar el patrón
        Bebida cafe = new Cafe();
        System.out.println(cafe.getDescripcion() + " de $" + cafe.costo());
        Adicional leche = new Leche(cafe);
        System.out.println(leche.getDescripcion() + " de $" + leche.costo());
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
        return bebida.getDescripcion() + "con Leche";
    }

    public double costo() {
        return 0.10 + bebida.costo();
    }
}
