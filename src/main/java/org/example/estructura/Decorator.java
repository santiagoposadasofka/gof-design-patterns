package org.example.estructura;

public class Decorator {

    /**
     * Permite a partir de una base añadir funciones o informacion adicional.
     * Se crea el método prepararBebida para acceder a los atributos y métodos de las clases abstractas
     * Bebida y Adicional.
     * */

    public void prepararBebida(){
        Cafe cafeConLeche = new Cafe();
        Leche adicional = new Leche(cafeConLeche);
        System.out.println("Se está preparando un " + adicional.getDescripcion());
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
    /**
     * el modificador de acceso del atributo descripcion es default o packege. Por esto se puede acceder a él
     * directamente desde la clase Bebida.
     */
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
        return bebida.getDescripcion() + " con Leche";
    }

    public double costo() {
        return 0.10 + bebida.costo();
    }
}
