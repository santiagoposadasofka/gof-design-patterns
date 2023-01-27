package org.example.estructura.decorator;

import java.util.zip.CheckedOutputStream;

class Leche extends Adicional {
    Bebida bebida;

    public Leche(){

    }
    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    public double costo() {
        System.out.println();

        return  .10 + bebida.costo();
    }
}
