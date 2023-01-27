package org.example.creacion;

public class Factory {
    /**
     * Simplifica el proceso de construccion de objetos,
     * en este caso por medio de un parametro "tipo" construimos el objeto esperado.
     */

    /**
     * Se instancia (crea objeto) de la clase FiguraGeometricaFactory
     */
    FiguraGeometricaFactory figuraGeometricaFactory = new FiguraGeometricaFactory();

    /**
     * Método que permite ejecutar el ejercicio de la clase FiguraGeometricaFactory
     */
    public void ejecutrarFactory() {
        FiguraGeometrica cuadrado = figuraGeometricaFactory.crearFiguraGeometrica("cuadrado");
        cuadrado.dibujar();

        FiguraGeometrica triangulo = figuraGeometricaFactory.crearFiguraGeometrica("triangulo");
        triangulo.dibujar();

        FiguraGeometrica circulo = figuraGeometricaFactory.crearFiguraGeometrica("circulo");
        circulo.dibujar();
    }
}

/**
 * Interface de figura geométrica
 */

interface FiguraGeometrica {
    void dibujar();
}

/**
 * Clase de la figura cuadrado que implementa los métodos de figura geométrica
 */
class Cuadrado implements FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado... ⬛");
    }
}

/**
 * Clase de la figura triangulo que implementa los métodos de figura geométrica
 */
class Triangulo implements FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo... ▲");
    }
}

/**
 * Clase de la figura círculo que implementa los métodos de figura geométrica
 */
class Circulo implements FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo... ⚫");
    }
}

/**
 * Clase FiguraGeometricaFactory donde se definen las diferentes figuras geométricas y se crean sus respectivos objetos
 */

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