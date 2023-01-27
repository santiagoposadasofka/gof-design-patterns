package org.example.creacion;

public class Factory {

    /**
     * Simplifica el proceso de construccion de objetos,
     * en este caso por medio de un parametro "tipo" construimos el objeto esperado.
     * */
    public void ejecutar (){
        FiguraGeometricaFactory fig1 = new FiguraGeometricaFactory();
        fig1.crearFiguraGeometrica("CIRCULO");
        Circulo circulo = new Circulo();
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
            System.out.println("Nuevo cuadrado");
            return new Cuadrado();
        } else if (tipo.equalsIgnoreCase("TRIANGULO")) {
            System.out.println("Nuevo triangulo");
            return new Triangulo();
        } else if (tipo.equalsIgnoreCase("CIRCULO")) {
            System.out.println("Nuevo circulo");
            return new Circulo();
        }else{
            return null;
        }
    }
}