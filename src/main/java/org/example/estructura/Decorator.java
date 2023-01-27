package org.example.estructura;

public class Decorator {

    public void crearBebida() {
        Cafe cafe = new Cafe();
        System.out.println(cafe.getDescripcion() + " con un costo de " + cafe.costo() + "$");
        Leche leche = new Leche(cafe);
        System.out.println(leche.getDescripcion() + " con un costo de " + leche.costo() + "$");


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
        return bebida.getDescripcion() + " con un adicional de leche";
    }

    public double costo() {
        return 0.10 + bebida.costo();
    }
}
