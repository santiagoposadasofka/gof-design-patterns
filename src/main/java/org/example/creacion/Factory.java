package org.example.creacion;

public class Factory {

    /**
     * Simplifica el proceso de construccion de objetos,
     * en este caso por medio de un parametro "tipo" construimos el objeto esperado.
     * */

    public void Ejecutar(){

    FiguraGeometricaFactory figuraGeometricaFactory=new FiguraGeometricaFactory();
    //figuraGeometricaFactory.crearFiguraGeometrica("circulo"); //ES NECESARIO QUE HAGA ESTO????
    //figuraGeometricaFactory.crearFiguraGeometrica("cuadrado");
    //figuraGeometricaFactory.crearFiguraGeometrica("triangulo");
    Circulo circulo = new Circulo();
    Cuadrado cuadrado = new Cuadrado();
    Triangulo triangulo = new Triangulo();
    circulo.dibujar();
    cuadrado.dibujar();
    triangulo.dibujar();


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