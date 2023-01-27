package org.example.creacion;

public class Factory {

    /**
     * Simplifica el proceso de construccion de objetos,
     * en este caso por medio de un parametro "tipo" construimos el objeto esperado.
     */
    public void ejecutar() {

        System.out.println("___________________Factory Figuras Geometricas_________________");
        FiguraGeometrica figuraGeometrica1 = new FiguraGeometricaFactory()
                .crearFiguraGeometrica("CUADRADO");
            figuraGeometrica1.dibujar();
        FiguraGeometrica figuraGeometrica2 = new FiguraGeometricaFactory()
                .crearFiguraGeometrica("TRIANGULO");
            figuraGeometrica2.dibujar();
        FiguraGeometrica figuraGeometrica3 = new FiguraGeometricaFactory()
                .crearFiguraGeometrica("nononon");
            System.out.println(figuraGeometrica3+" No se puede dibujar");
        FiguraGeometrica figuraGeometrica4 = new FiguraGeometricaFactory()
                .crearFiguraGeometrica("CIRCULO");
            figuraGeometrica4.dibujar();
        System.out.println("_______________________________________________________________");
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
}