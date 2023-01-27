package org.example.creacion;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    /**
     * Simplifica el proceso de construccion de objetos,
     * en este caso por medio de un parametro "tipo" construimos el objeto esperado.
     * */
    public void ejecutar(){


        FiguraGeometricaFactory figuraGeometricaFactory = new FiguraGeometricaFactory();

        figuraGeometricaFactory.crearFiguraGeometrica("cuadrado").dibujar();
        figuraGeometricaFactory.crearFiguraGeometrica("TRIANGULO").dibujar();
        figuraGeometricaFactory.crearFiguraGeometrica("circulo").dibujar();

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
        //equalsIgnoreCase - Compara dos strings para ver si son iguales ignorando entre mayusculas y minusculas
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