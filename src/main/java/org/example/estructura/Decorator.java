package org.example.estructura;

// Permite añadir funciones o información adicional a partir de una base.

public class Decorator {
    public void ejecutar() {
        // Se utilizan los elementos prediseñados para aplicar el patrón
        Bebida cafe = new Cafe();                                             // Se crea una nueva bebida, un café
        System.out.println(cafe.getDescripcion() + " de $" + cafe.costo());   // Se muestra qué bebida es y su precio
        Adicional leche = new Leche(cafe);                                    // Se le adiciona leche a la bebida
        System.out.println(leche.getDescripcion() + " de $" + leche.costo()); // Se muestra la nueva bebida y su precio
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
        return bebida.getDescripcion() + "con Leche"; // Cambio en la descripción predefinida para mejor comprensión
    }

    public double costo() {
        return 0.10 + bebida.costo();
    }
}