package org.example.creacion;

public class Factory {

    /**
     * Simplifica el proceso de construccion de objetos,
     * en este caso por medio de un parametro "tipo" construimos el objeto esperado.
     * */

    /**
     * Método para la ejecución del patron
     */
    public void ejecutarFiguraGeometricaFactory() {
        FiguraGeometricaFactory figuraGeometricaFactory = new FiguraGeometricaFactory();

        FiguraGeometrica cuadradrado = figuraGeometricaFactory.crearFiguraGeometrica("Cuadrado");
        cuadradrado.dibujar();

        FiguraGeometrica triangulo = figuraGeometricaFactory.crearFiguraGeometrica("Triangulo");
        triangulo.dibujar();

        FiguraGeometrica circulo = figuraGeometricaFactory.crearFiguraGeometrica("Circulo");
        circulo.dibujar();
    }

}


/**
 * Interfaz de FiguraGeométrica
 */
interface FiguraGeometrica {
    void dibujar();
}

/**
 * Clases concretas que implementan la interfaz FiguraGeométrica
 */

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

/**
 * Clase de fábrica que crea objetos de figurasGeométricas
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
        }else{
            return null;
        }
    }
}