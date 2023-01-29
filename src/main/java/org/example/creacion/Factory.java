package org.example.creacion;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    /**
     *
     * Simplifica el proceso de construccion de objetos,
     * en este caso por medio de un parametro "tipo" construimos el objeto esperado.
     *
     * */
    public static void ejecutar(){
        FiguraGeometricaFactory figuraGeometrica =  new FiguraGeometricaFactory();
        FiguraGeometrica cuadrado = figuraGeometrica.crearFiguraGeometrica("CUADRADO");
        cuadrado.dibujar();

        FiguraGeometrica triangulo = figuraGeometrica.crearFiguraGeometrica("TRIANGULO");
        triangulo.dibujar();


        FiguraGeometrica circulo = figuraGeometrica.crearFiguraGeometrica("CIRCULO");
        circulo.dibujar();



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
        }else{
            return null;
        }
    }
}