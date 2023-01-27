package org.example.creacion;

public class Factory {

    /**
     * Simplifica el proceso de construccion de objetos,
     * en este caso por medio de un parametro "tipo" construimos el objeto esperado.
     * El patrón de diseño Factory es un patrón de creación que proporciona una interfaz
     * para crear objetos en una superclase, pero permite a las subclases decidir qué clase
     * instanciar. Esto se logra mediante la creación de una fábrica de objetos abstracta, que
     * es una clase o interfaz que define los métodos necesarios para crear los objetos. Las subclases
     * de la fábrica de objetos se encargan de instanciar las clases específicas según sea necesario.
     * Este patrón es útil cuando hay una jerarquía de clases relacionadas que deben ser creadas juntas,
     * pero se desconoce la clase específica que se debe instanciar.
     * */


    public void ejecutar(){

        FiguraGeometricaFactory figuraGeometricaFactory = new FiguraGeometricaFactory();
        FiguraGeometrica figuraGeometrica= figuraGeometricaFactory.crearFiguraGeometrica("CUADRADO");
        FiguraGeometrica figuraGeometrica2= figuraGeometricaFactory.crearFiguraGeometrica("CIRCULO");
        FiguraGeometrica figuraGeometrica3= figuraGeometricaFactory.crearFiguraGeometrica("TRIANGULO");
        FiguraGeometrica figuraGeometrica4= figuraGeometricaFactory.crearFiguraGeometrica("CIRCULO");
        FiguraGeometrica figuraGeometrica5= figuraGeometricaFactory.crearFiguraGeometrica("CUADRADO");

        figuraGeometrica.dibujar();
        figuraGeometrica2.dibujar();
        figuraGeometrica3.dibujar();
        figuraGeometrica4.dibujar();
        figuraGeometrica5.dibujar();
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