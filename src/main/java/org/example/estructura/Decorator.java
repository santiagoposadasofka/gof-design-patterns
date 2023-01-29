package org.example.estructura;

import java.util.ArrayList;
import java.util.List;

public class Decorator {

    /**
     * Permite a partir de una base añadir funciones o informacion adicional
     */


    public void ejecutar() {

        /**
         * Objeto creando un cafesito con leche
         */
        Bebida cafeLeche = new Leche(new Cafe());
        System.out.println("la Bebida es" + " :" + cafeLeche.descripcion);
        System.out.println("el costo es" + " :" + cafeLeche.costo());

        Bebida Cafe = new Cafe();
        System.out.println("la Bebida es" + " :" + Cafe.descripcion);
        System.out.println("el costo es" + " :" + Cafe.costo());


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
}
