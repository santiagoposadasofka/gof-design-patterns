package org.example.estructura;

public class Decorator {

    /**
     * Permite a partir de una base añadir funciones o informacion adicional
     * */

    /**
     * Método para ejecutar el patron
     */
    public void ejecutarDecorator() {
        Bebida bebida = new Cafe();
        System.out.println("Descripción: " + bebida.getDescripcion());
        System.out.println("Costo: " + bebida.costo());

        bebida = new Leche(bebida);
        System.out.println("Descripción: " + bebida.getDescripcion());
        System.out.println("Costo: " + bebida.costo());

        bebida = new Canela(bebida);
        System.out.println("Descripción: " + bebida.getDescripcion());
        System.out.println("Costo: " + bebida.costo());
    }
}

/**
 * Clase abstracta bebida la cual representa una bebida.
 */
abstract class Bebida {
    /**
     * Atributo que describe la bebida
     */
    String descripcion = "Bebida desconocida";

    /**
     * Método getter para retornar la descripción de la bebida
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo abstracto para obtener el costo de la bebida.
     *
     * @return costo
     */
    public abstract double costo();
}

/**
 * Clase para la bebida de tipo cafe
 */
class Cafe extends Bebida {
    /**
     * Constructor
     */
    public Cafe() {
        descripcion = "Café";
    }

    /**
     * Método que retorna el costo del cafe
     *
     * @return costo
     */
    public double costo() {
        return 1.99;
    }
}

/**
 * La clase abstracta Adicional representa un adicional para la bebida
 */
abstract class Adicional extends Bebida {
    /**
     * Metodo que retorna la descripcion del adicional
     *
     * @return descripcion del adicional
     */
    public abstract String getDescripcion();
}

/**
 * La clase leche representa un adicional de leche para una bebida
 */
class Leche extends Adicional {
    /**
     * La bebida a la que se le agrega la leche
     */
    Bebida bebida;

    /**
     * constructor
     *
     * @param bebida
     */
    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    /**
     * Metodo que retorna la descripción del adicional
     *
     * @return descripcion adicional
     */
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    /**
     * Método que retorna el costo del adicional y se lo suma al precio de la bebida
     *
     * @return precio adicional + bebida
     */
    public double costo() {
        return 0.10 + bebida.costo();
    }
}

/**
 * La clase Canela representa un adicional de canela para una bebida
 */
class Canela extends Adicional {
    /**
     * La bebida a la que se le agrega la leche
     */
    Bebida bebida;

    /**
     * constructor
     *
     * @param bebida
     */
    public Canela(Bebida bebida) {
        this.bebida = bebida;
    }

    /**
     * Método que retorna el costo del adicional y se lo suma al precio de la bebida
     *
     * @return precio adicional + bebida
     */
    @Override
    public double costo() {
        return 0.10 + bebida.costo();
    }

    /**
     * Metodo que retorna la descripción del adicional
     *
     * @return descripcion adicional
     */
    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", canela";
    }
}