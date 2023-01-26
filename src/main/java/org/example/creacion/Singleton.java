package org.example.creacion;

public class Singleton {

    /**
     * Nos permite asegurar que solo haya una instancia de un objeto esperado,
     * ya sea porque queremos que solo haya un objeto de este tipo y que a partir de él,
     * todos quien lo requieran tengan que tomar la informacion a partir de este,
     * evitando que haya diferencias entre los interesados a la hora de tomar informacion
     * */

    public void ejecutar() {
        Configuracion config = Configuracion.getInstancia();
        config.setValor1("Nuevo valor 1");
        config.setValor2("Nuevo valor 2");
        System.out.println("Valor 1: " + config.getValor1());
        System.out.println("Valor 2: " + config.getValor2());
    }
}


class Configuracion {
    private static Configuracion instancia = null;
    private String valor1 = "default";
    private String valor2 = "default";

    private Configuracion() {
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }
}
