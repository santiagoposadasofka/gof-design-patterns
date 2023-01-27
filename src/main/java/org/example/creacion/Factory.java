package org.example.creacion;

/*
 * Simplifica el proceso de construcción de objetos. En este caso por medio de un parámetro "tipo" se construye el
 * objeto esperado.
 */

public class Factory {
    public void ejecutar() {
        // Se utilizan los elementos prediseñados para aplicar el patrón
        FiguraGeometricaFactory fabrica = new FiguraGeometricaFactory();
        fabrica.crearFiguraGeometrica("CUADRADO").dibujar();
        fabrica.crearFiguraGeometrica("TRIANGULO").dibujar();
        fabrica.crearFiguraGeometrica("CIRCULO").dibujar();
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