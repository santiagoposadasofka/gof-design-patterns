package org.example.estructura;
import java.util.ArrayList;
import java.util.List;
public class Decorator {

    /**
     * Permite a partir de una base añadir funciones o informacion adicional
     *  Se utiliza para agregar responsabilidades adicionales a un objeto de manera
     *  independiente de las clases que heredan de él. En lugar de utilizar herencia
     *  para extender las funcionalidades de una clase, se utilizan decoradores para
     *  añadir nuevas responsabilidades a un objeto existente. Esto permite una mayor
     *  flexibilidad y reutilización de código.
     * */

    public void ejecutar (){

        Cafe cafe = new Cafe();
        System.out.println("El costo es "+ cafe.costo() );
        System.out.println("Esta es la descripcion "+ cafe.getDescripcion());


        Leche leche = new Leche  (cafe);
        System.out.println("El costo es "+ leche.costo());
        System.out.println("Esta es la descripcion "+ leche.getDescripcion());

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
