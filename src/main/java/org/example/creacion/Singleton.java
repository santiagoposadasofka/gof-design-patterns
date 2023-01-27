package org.example.creacion;

public class Singleton {

    /**
     * Nos permite asegurar que solo haya una instancia de un objeto esperado,
     * ya sea por que queremos que solo haya un objeto de este tipo y que a partir de el,
     * todos quien lo requieran tengan que tomar la informacion a partir de este,
     * evitando que hayan diferencias entre los interesados a la hora de tomar informacion
     * */

    /**
     * Para poder acceder al método getInstancia, se crea el método estático getInfo.
     * El método getInfo, utiliza también los métodos getValor1 y getValor2 para acceder a los atributos de la clase
     * Configuracion
     */

    public static void getInfo(){
        /**
         * Toda la información sobre la clase Configuración se obtiene de la única instancia que se crea.
         * Si la instancia no existe, al llamar al método getInstancia, esta se crea.
         */
        String valor1 = Configuracion.getInstancia().getValor1();
        System.out.println("El valor 1 es " + valor1);
        String valor2 = Configuracion.getInstancia().getValor2();
        System.out.println("El valor 2 es " + valor2);
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
