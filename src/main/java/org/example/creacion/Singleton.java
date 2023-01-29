package org.example.creacion;

import java.lang.module.Configuration;

public class
Singleton {

    /**
     * Nos permite asegurar que solo haya una instancia de un objeto esperado,
     * ya sea por que queremos que solo haya un objeto de este tipo y que a partir de el,
     * todos quien lo requieran tengan que tomar la informacion a partir de este,
     * evitando que hayan diferencias entre los interesados a la hora de tomar informacion
     *
     * */
    public static void ejecutar(){
        Configuracion configuracion1 = Configuracion.getInstancia();


        Configuracion configuracion2 = Configuracion.getInstancia();
        Configuracion configuracion3 = Configuracion.getInstancia();
        configuracion1.getValor1();
        configuracion2.getValor2();
        configuracion3.getValor1();
        System.out.println(configuracion1.getValor1());
        System.out.println(configuracion1.getValor2());
        System.out.println(configuracion3.getValor1());
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
