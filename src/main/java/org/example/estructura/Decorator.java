package org.example.estructura;

public class Decorator {

    /**
     * Permite a partir de una base añadir funciones o informacion adicional
     * */

    /**
     * Método que permite ejecutar el patrón Decorator
     */
    public void ejecutarDecorator(){
        Bebida bebida = new Cafe();
        System.out.println("Descripción: " + bebida.getDescripcion());
        System.out.println("Costo: " + bebida.costo());

        bebida = new Leche(bebida);
        System.out.println("Descripción " + bebida.getDescripcion());
        System.out.println("Costo: " + bebida.costo());

        bebida = new Hierbabuena(bebida);
        System.out.println("Descripción " + bebida.getDescripcion());
        System.out.println("Costo: " + bebida.costo());
    }
}

/**
 * Clase abstracta bebida
 */
abstract class Bebida {
    String descripcion = "Bebida desconocida";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double costo();
}

/**
 * Clase café que hereda de la clase abstracta bebida.
 */
class Cafe extends Bebida {
    public Cafe() {
        descripcion = "Café";
    }

    /**
     * Método costo
     * @return el valor total de un café
     */
    public double costo() {
        return 1.99;
    }
}

/**
 * Clase abstracta adicional que hereda de bebida.
 */
abstract class Adicional extends Bebida {
    /**
     * Atributo que obtiene la descripción de un ingrediente adicional a la bebida
     */
    public abstract String getDescripcion();
}

/**
 * Clase leche que hereda de la clase abstracta adicional
 */
class Leche extends Adicional {
    Bebida bebida;

    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    /**
     * Método costo
     * @return 10% adicional al valor del café
     */
    public double costo() {
        return 0.10 + bebida.costo();
    }
}

/**
 * Clase Hierbabuena que hereda de la clase abstracta adicional
 */
class Hierbabuena extends Adicional{
    Bebida bebida;

    public Hierbabuena(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Hierbabuena";
    }

    /**
     * Método costo
     * @return 9% adicional al valor del café
     */
    @Override
    public double costo() {
        return 0.09 + bebida.costo();
    }
}
