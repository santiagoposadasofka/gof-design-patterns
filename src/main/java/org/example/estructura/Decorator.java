package org.example.estructura;

public class Decorator {

    public void ejecutar (){
        Cafe nescafe = new Cafe();
        System.out.println("Cafe cuesta "+ nescafe.costo());
        System.out.println("Este cafe es "+ nescafe.getDescripcion());

        Leche coolechera = new Leche(nescafe);
        System.out.println("Leche cuesta "+ coolechera.costo());
        System.out.println("La leche es "+ coolechera.getDescripcion());


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
        return bebida.getDescripcion() + ", con Leche";
    }

    public double costo() {
        return 0.10 + bebida.costo();
    }
}
