package org.example.creacion;

public class Factory {

    /**
     * Simplifica el proceso de construccion de objetos,
     * en este caso por medio de un parametro "tipo" construimos el objeto esperado.
     */
    public void ejecutar() {

        FiguraGeometrica figuraGeometrica1 = new FiguraGeometricaFactory().crearFiguraGeometrica("CUADRADO");
        figuraGeometrica1.dibujar();
        FiguraGeometrica figuraGeometrica2 = new FiguraGeometricaFactory().crearFiguraGeometrica("TRIANGULO");
        figuraGeometrica2.dibujar();
        FiguraGeometrica figuraGeometrica3 = new FiguraGeometricaFactory().crearFiguraGeometrica("nononon");
        if(figuraGeometrica3 != null) { figuraGeometrica3.dibujar();
        } else {
         System.out.println("No se puede dibujar ");
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
}