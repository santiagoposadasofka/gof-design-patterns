package org.example.estructura;

public class Decorator {
    /**
     * Permite a partir de una base añadir funciones o información adicional
     * */
    public static void ejecutar(){
        Bebida bebida=new Cafe();
        System.out.println("Bebida tipo: "+bebida.getDescripcion()+", costo: "+bebida.costo());
        Adicional cafeConLeche=new Leche(bebida);
        System.out.println("Bebida tipo: "+cafeConLeche.getDescripcion()+", costo: "+cafeConLeche.costo());
        System.out.println("\n");
        Auto nissan=new Sedan();
        System.out.println("Vehiculo tipo: "+nissan.getDescripcion()+" con un costo de: "+nissan.costo());
        AutoDecorador decorador=new AireAcondicionado(nissan);
        System.out.println("Vehiculo tipo: "+decorador.getDescripcion()+" con un costo de: "+decorador.costo());
        AutoDecorador luces=new LucesExploradoras(decorador);
        System.out.println("Vehiculo tipo: "+luces.getDescripcion()+" con un costo de: "+luces.costo());
    }
}
interface Auto{
    double costo();
    String getDescripcion();
}
class Sedan implements Auto{
    @Override
    public double costo() {
        return 10000;
    }
    @Override
    public String getDescripcion() {
        return "Sedan";
    }
}
abstract class AutoDecorador implements Auto{
    protected Auto auto;
    public AutoDecorador(Auto auto){
        this.auto=auto;
    }
}
class AireAcondicionado extends AutoDecorador{
    public AireAcondicionado(Auto auto) {
        super(auto);
    }
    @Override
    public double costo() {
        return super.auto.costo()+50;
    }
    @Override
    public String getDescripcion() {
        return super.auto.getDescripcion()+", con aire acondicionado";
    }
}
class LucesExploradoras extends AutoDecorador{
    public LucesExploradoras(Auto auto) {
        super(auto);
    }
    @Override
    public double costo() {
        return super.auto.costo()+10;
    }
    @Override
    public String getDescripcion() {
        return super.auto.getDescripcion()+", con luces exploradoras";
    }
}

abstract class Bebida {
    String descripcion = "Bebida desconocida";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double costo();
}

class Cafe extends Bebida {
    public Cafe() {
        descripcion = "Café";
    }

    public double costo() {
        return 1.99;
    }
}

abstract class Adicional extends Bebida {
    public abstract String getDescripcion();
}

class Leche extends Adicional {
    Bebida bebida;

    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + " con Leche";
    }

    public double costo() {
        return 0.10 + bebida.costo();
    }
}
