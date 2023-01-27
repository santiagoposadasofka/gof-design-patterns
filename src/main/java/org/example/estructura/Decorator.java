package org.example.estructura;

public class Decorator {

    /**
     * Permite a partir de una base añadir funciones o informacion adicional
     * */

    public void ejecutarDecorator(){
        Cafe cafe1=new Cafe();
        Cafe cafe2=new Cafe();
        Adicional azucar=new Azucar(cafe1);
        Adicional leche=new Leche(cafe2);

        System.out.println("Usted pidio un: "+azucar.getDescripcion()+" Costo: "+azucar.costo());
        System.out.println("Usted pidio un: "+leche.getDescripcion()+" Costo: "+leche.costo());
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

class Azucar extends Adicional {

    Bebida bebida;

    public Azucar(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public double costo() {
        return bebida.costo()+0.2;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion()+" Azucar";
    }
}
