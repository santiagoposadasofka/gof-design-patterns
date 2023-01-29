package org.example.creacion;

/*
 * Simplifica el proceso de construcción de objetos. En este caso por medio de un parámetro "tipo" se construye el
 * objeto esperado.
 */

public class Factory {
    public void ejecutar() {
        // Se utilizan los elementos prediseñados para aplicar el patrón
        FiguraGeometricaFactory fabrica = new FiguraGeometricaFactory(); // Se crea una nueva fábrica de figuras
        fabrica.crearFiguraGeometrica("CUADRADO").dibujar();        // Se fabrica un cuadrado y se dibuja
        fabrica.crearFiguraGeometrica("TRIANGULO").dibujar();       // Se fabrica un triángulo y se dibuja
        fabrica.crearFiguraGeometrica("CIRCULO").dibujar();         // Se fabrica un círculo y se dibuja
    }
}

interface FiguraGeometrica {
    void dibujar();
}

class Cuadrado implements FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}

class Triangulo implements FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo");
    }
}

class Circulo implements FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }
}

class FiguraGeometricaFactory {
    public FiguraGeometrica crearFiguraGeometrica(String tipo) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("CUADRADO")) {
            return new Cuadrado();
        } else if (tipo.equalsIgnoreCase("TRIANGULO")) {
            return new Triangulo();
        } else if (tipo.equalsIgnoreCase("CIRCULO")) {
            return new Circulo();
        } else {
            return null;
        }
    }
}