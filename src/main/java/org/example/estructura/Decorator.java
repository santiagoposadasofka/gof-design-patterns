package org.example.estructura;

public class Decorator {
    public void decorar(){
        Cafe cafe = new Cafe();
        System.out.println(cafe.costo());
        System.out.println("adición de leche");
        Leche leche = new Leche(cafe);
        System.out.println(leche.costo());

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

class Cafe extends Bebida {
    public Cafe() {
        descripcion = "Café";
        System.out.println(descripcion);
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
