package org.example.creacion;

public class Factory {

    /**
     * Simplifica el proceso de construccion de objetos,
     * en este caso por medio de un parametro "tipo" construimos el objeto esperado.
     * */
    public void ejecutarFactory(){

        FiguraGeometricaFactory figuraGeometricaFactory=new FiguraGeometricaFactory();
        figuraGeometricaFactory.crearFiguraGeometrica("CUADRADO").dibujar();
        figuraGeometricaFactory.crearFiguraGeometrica("CUBO").dibujar();
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

class Cubo implements FiguraGeometrica{
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cubo");
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
        } else if (tipo.equalsIgnoreCase("CUBO")){
            return new Cubo();
        }else{
            return null;
        }
    }
}