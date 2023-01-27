package org.example.creacion;

public class Factory {
    /**
     * Simplifica el proceso de construcción de objetos,
     * en este caso por medio de un parámetro "tipo" construimos el objeto esperado.
     * */
    public static void ejecutar(){
        FiguraGeometrica figuraGeometrica=FiguraGeometricaFactory.crearFiguraGeometrica("cuadrado");
        figuraGeometrica.dibujar();
        Vehiculo auto=VehiculoFactory.cracionVehiculo("AUTO");
        Vehiculo moto=VehiculoFactory.cracionVehiculo("moto");
        auto.mostrarInformacion();
        moto.mostrarInformacion();
    }
}
interface Vehiculo{
    void mostrarInformacion();
}
class Auto implements Vehiculo{
    @Override
    public void mostrarInformacion() {
        System.out.println("Información del auto:" +
                "\nMarca: Toyota" +
                "\nModelo: Corolla");
    }
}
class Moto implements Vehiculo{
    @Override
    public void mostrarInformacion() {
        System.out.println("Información de la moto:" +
                "\nMarca: Honda" +
                "\nModelo: CBR190");
    }
}
class Bicicleta implements Vehiculo{
    @Override
    public void mostrarInformacion() {
        System.out.println("Información de la bicicleta:" +
                "\nMarca: Giant" +
                "\nModelo: Escape");
    }
}
class VehiculoFactory{
    public static Vehiculo cracionVehiculo(String vehiculo){
        if(vehiculo==null)
            return null;
        if(vehiculo.equalsIgnoreCase("Auto"))
            return new Auto();
        if(vehiculo.equalsIgnoreCase("Moto"))
            return new Moto();
        if(vehiculo.equalsIgnoreCase("Bicicleta"))
            return new Bicicleta();
        return null;
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
    public static FiguraGeometrica crearFiguraGeometrica(String tipo) {
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